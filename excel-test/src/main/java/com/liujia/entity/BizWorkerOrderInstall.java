package com.liujia.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.liujia.base.MpBaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 安装工单表
 * </p>
 *
 * @author liujia
 * @since 2020-09-14
 */
@Data
public class BizWorkerOrderInstall {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公司id
     */
    private Integer cid;

    /**
     * 销售网点id
     */
    private Integer salesWid;

    /**
     * 销售网点编号
     */
    private String salesNumber;

    /**
     * 销售网点名称
     */
    private String salesWname;

    /**
     * 销售网点系统编号
     */
    private String salesXtbh;

    /**
     * 售后网点id
     */
    private Integer afterWid;

    /**
     * 售后网点编号
     */
    private String afterNumber;

    /**
     * 售后网点名称
     */
    private String afterWname;

    /**
     * 售后网点系统编号
     */
    private String afterXtbh;

    /**
     * 创建工单的网点
     */
    private Integer createWid;

    /**
     * 创建工单编号
     */
    private String createNumber;

    /**
     * 创建网点名称
     */
    private String createWname;

    /**
     * 创建网点系统编号
     */
    private String createXtbh;

    /**
     * 主服务人员id
     */
    private Integer woid;

    /**
     * 服务人员名称
     */
    private String woname;

    /**
     * 销售订单号
     */
    private String salesOrderNo;

    /**
     * 老系统工单编号
     */
    private String oldWorkerOrderNo;

    /**
     * 工单号码
     */
    private String workerOrderNo;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 销售网点业务线id
     */
    private Integer businessId;

    /**
     * 销售类型
     */
    private String salesType;

    /**
     * 消息来源
     */
    private String messageResource;

    /**
     * 用户customer id
     */
    private Integer userId;

    /**
     * 客户电话
     */
    private String userPhone;

    /**
     * 客户名字
     */
    private String userName;

    /**
     * 联系人
     */
    private String userContact;

    /**
     * 联系人id
     */
    private Integer contactId;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 街道
     */
    private String street;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 经度
     */
    private String lng;

    /**
     * 发票编号
     */
    private String invoiceNo;

    /**
     * 购买时间
     */
    private Integer buyDatetime;

    /**
     * 妥投时间
     */
    private Integer reachDatetime;

    /**
     * 是否完成配送：有货（完成），无货
     */
    private String reachStatus;

    /**
     * 微信预约id
     */
    private Integer reserveId;

    /**
     * 客户预约时间
     */
    private Integer reserveDatetime;

    /**
     * 预约时间段
     */
    private String reservePeriod;

    /**
     * 工单开始时间
     */
    private Integer beginDatetime;

    /**
     * 工单超时时间点
     */
    private Integer endDatetime;

    /**
     * 首次派工时间
     */
    private Integer firstAppointDatetime;

    /**
     * 派工到网点的时间
     */
    private Integer appointDatetime;

    /**
     * 派工给服务人员的时间
     */
    private Integer appointWorkerDatetime;

    /**
     * 服务人员报完工时间
     */
    private Integer workerFinishTime;

    /**
     * 完工时间
     */
    private Integer finishTime;

    /**
     * 工程名称
     */
    private String projectName;

    /**
     * 工程编号
     */
    private String projectNo;

    /**
     * 支架
     */
    private String bracket;

    /**
     * 加长管
     */
    private String pipe;

    /**
     * 空气开关
     */
    private String switchFlag;

    /**
     * 高空作业
     */
    private String highAltitude;

    /**
     * 一次成型墙孔
     */
    private String hole;

    /**
     * 备注
     */
    private String remark;

    /**
     * 用户微信端语音留言
     */
    private String voice;

    /**
     * 语音时长
     */
    private Integer voiceLenth;

    /**
     * 用户微信端拍摄照片
     */
    private String picture;

    /**
     * 用户微信拍摄视屏
     */
    private String video;

    /**
     * 用户微信端文字留言
     */
    private String leaveMessage;

    /**
     * 评价:1:差评,2:中评,3:好评,0:未评价，4：已评价
     */
    private Integer appraise;

    /**
     * 评价内容
     */
    private String appraiseContent;

    /**
     * 评价标签
     */
    private String appraiseLabel;

    /**
     * 评价时间
     */
    private Integer appraiseDatetime;

    /**
     * 最迟评价时间
     */
    private Integer appraiseEndtime;

    /**
     * 追评
     */
    private Integer secondAppraise;

    /**
     * 追评内容
     */
    private String secondAppraiseContent;

    /**
     * 追评标签
     */
    private String secondAppraiseLabel;

    /**
     * 追评时间
     */
    private Integer secondAppraiseDatetime;

    /**
     * 状态
     */
    private String status;

    /**
     * order_state 工单状态：0:分公司待派工、1:网点待派工、2:已派工、3:已完工、4:网点已关闭工单、5:分公司已关闭工单,6:异常关闭、7:已作废、
     */
    private Integer orderState;

    /**
     * 派工状态：0:分公司待派工、1:网点待派工、2:已派工、3:已接收、4:已签到、5:已完工
     */
    private Integer appointState;

    /**
     * 要安装的机器数量
     */
    private Integer machineNum;

    /**
     * 是否已经结算，1已结算，0未结算
     */
    private Integer clearing;

    /**
     * 一段时间内是否预约客户，1已预约，0未预约
     */
    private Integer isAppointment;

    /**
     * 结算时间
     */
    private Integer clearingDatetime;

    /**
     * 结算金额
     */
    private BigDecimal clearingAmount;

    /**
     * 最后修改时间
     */
    private Integer lastUpdateTime;

    /**
     * 工单是否已超时
     */
    private Integer timeout;

    /**
     * 格力总部-安装工单主id
     */
    private String pgguid;

    /**
     * 格力安装派工id
     */
    private String pgid;

    /**
     * 格力流程id
     */
    private String lcid;

    /**
     * 主类id
     */
    private Integer mainId;

    /**
     * 主类名称
     */
    private String mainName;

    /**
     * 商品json
     */
    private String productJson;

    /**
     * 最新反馈日志
     */
    private String orderLog;

    /**
     * 还需要完成的数量
     */
    private Integer needNum;

    /**
     * 工单创建人姓名
     */
    private String operator;

    /**
     * 工单创建人的id(系统用户表中id)
     */
    private Integer operatorId;

    /**
     * 售货单位
     */
    @TableField("salesName")
    private String salesName;

    /**
     * 同步至条码库（0，未同步至金蝶；1，已同步至金蝶，2，未同步至条码，3，已同步至条码）
     */
    private Integer syscStatus;

    /**
     * 审核状态
     */
    private Integer verifyStatus;

    /**
     * 作业网点到用户距离
     */
    private String longDistance;

    /**
     * 是否操作过，1、已操作，0未操作
     */
    private Integer isOperation;

    /**
     * 下次操作提醒时间
     */
    private Integer lastOperationTime;

    /**
     * 明细json
     */
    private String detailJson;


}
