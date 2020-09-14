package com.liujia.controller;

import com.liujia.entity.LoanInfo;
import com.liujia.util.EasyExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


/**
 * @author ex_111806190
 * @since 2020-9-14 10:57
 */
@Controller
public class ExportController {

    @GetMapping("/export")
    public void cooperation(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<LoanInfo> loanInfos = new ArrayList<>();
        LoanInfo loanInfo = new LoanInfo();
        loanInfo.setId("123");
        loanInfo.setName("liujia");
        loanInfos.add(loanInfo);
        EasyExcelUtil.export("loanInfo.xlsx",response,LoanInfo.class,loanInfos);
    }
}
