package com.liujia.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.util.CollectionUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.style.column.AbstractColumnWidthStyleStrategy;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ex_111806190
 * @since 2020-9-14 9:45
 */
@Slf4j
public class EasyExcelUtil {

    /**
     * simpleWrit，直接写出
     *
     * @param fileName:输出的目标文件名(不需要加文件类型后缀)
     * @param response：
     * @param clazz：列的实体类(可通过注解标记，也可不标记)
     * @param data：要填充的数据，一般为实体类的list
     * @return void
     * @author gaohongpeng
     * @date 2020-8-13 10:13
     */
    public static void export(String fileName, HttpServletResponse response, Class<?> clazz, List<?> data) {
        log.info("ExcelUtil export start .........................");
        ExcelWriter excelWriter = null;
        try {
            log.info("excelWriter start ...........");
            excelWriter = EasyExcel.write(getOutputStream(fileName, response), clazz).build();
            if (excelWriter == null) {
                log.error("excelWriter is null!");
            }
            int i = 0;
            log.info("writeSheet start ...........");
            WriteSheet writeSheet = EasyExcel.writerSheet(i, "Sheet" + (i + 1)).registerWriteHandler(new CustomCellWriteHandler()).build();// 直接写入数据
            if (writeSheet == null) {
                log.error("writeSheet is null!");
            }
            excelWriter.write(data, writeSheet);
            i++;
        } catch (Exception e) {
            log.error("excel export Exception [{}]", e.getMessage());
        } finally {
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
        log.info("ExcelUtil export end .........................");
    }

    /**
     * @param fileName：输出的目标文件名(不需要加文件类型后缀)
     * @param response：
     * @return outputStream:输出流
     * @throws Exception：
     */
    private static OutputStream getOutputStream(String fileName, HttpServletResponse response) throws Exception {
        log.info("getOutputStream start ......");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ss HH:mm:ss");
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.setContentType("application/ms-excel;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment; filename="
                    + fileName + sdf.format(new Date()) + ".xlsx");
            response.setHeader("Pragma", "public");
            response.setHeader("Cache-Control", "no-store");
            response.addHeader("Cache-Control", "max-age=0");
            return response.getOutputStream();
        } catch (IOException e) {
            log.error("excel getOutputStream IOException [{}]", e.getMessage());
        }
        return null;
    }

    static class CustomCellWriteHandler extends AbstractColumnWidthStyleStrategy {
        private Map<Integer, Map<Integer, Integer>> CACHE = new HashMap<>();

        @Override
        protected void setColumnWidth(WriteSheetHolder writeSheetHolder, List<CellData> cellDataList, Cell cell, Head head, Integer integer, Boolean isHead) {
            boolean needSetWidth = isHead || !CollectionUtils.isEmpty(cellDataList);
            if (needSetWidth) {
                Map<Integer, Integer> maxColumnWidthMap = CACHE.computeIfAbsent(writeSheetHolder.getSheetNo(), k -> new HashMap<>());

                Integer columnWidth = this.dataLength(cellDataList, cell, isHead);
                if (columnWidth >= 0) {
                    if (columnWidth > 255) {
                        columnWidth = 255;
                    }

                    Integer maxColumnWidth = maxColumnWidthMap.get(cell.getColumnIndex());
                    if (maxColumnWidth == null || columnWidth > maxColumnWidth) {
                        maxColumnWidthMap.put(cell.getColumnIndex(), columnWidth);
                        writeSheetHolder.getSheet().setColumnWidth(cell.getColumnIndex(), (columnWidth + 1) * 256);
                    }

                }
            }
        }

        private Integer dataLength(List<CellData> cellDataList, Cell cell, Boolean isHead) {
            if (isHead) {
                return cell.getStringCellValue().getBytes().length;
            } else {
                CellData cellData = cellDataList.get(0);
                CellDataTypeEnum type = cellData.getType();
                if (type == null) {
                    return -1;
                } else {
                    switch (type) {
                        case STRING:
                            return cellData.getStringValue().getBytes().length;
                        case BOOLEAN:
                            return cellData.getBooleanValue().toString().getBytes().length;
                        case NUMBER:
                            return cellData.getNumberValue().toString().getBytes().length;
                        default:
                            return -1;
                    }
                }
            }
        }
    }

}
