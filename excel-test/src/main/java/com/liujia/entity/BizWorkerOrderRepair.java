package com.liujia.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.liujia.base.MpBaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 维修工单表
 * </p>
 *
 * @author liujia
 * @since 2020-09-14
 */
@Data
public class BizWorkerOrderRepair{

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
     * 销售网点
     */
    private String salesWname;

    /**
     * 创建网点id
     */
    private Integer createWid;

    /**
     * 创建网点编号
     */
    private String createNumber;

    /**
     * 创建网点
     */
    private String createWname;

    /**
     * 售后网点id
     */
    private Integer afterWid;

    /**
     * 售后网点编号
     */
    private String afterNumber;

    /**
     * 售后网点
     */
    private String afterWname;

    /**
     * 主服务人员id
     */
    private Integer woid;

    /**
     * 主服务人员名称
     */
    private String woname;

    /**
     * 工单号码
     */
    private String workerOrderNo;

    /**
     * 老系统工单编号
     */
    private String oldWorkerOrderNo;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 需求类别
     */
    private String type;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 消息来源
     */
    private String messageResource;

    /**
     * 区域Id
     */
    private Integer businessId;

    /**
     * 客户customer id
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
     * 联系人ｉｄ
     */
    private Integer contactId;

    /**
     * 联系人
     */
    private String userContact;

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
     * 工单到期时间点
     */
    private Integer endDatetime;

    /**
     *  派工时间
     */
    private Integer appointDatetime;

    /**
     * 派工给服务人员的时间
     */
    private Integer appointWorkerDatetime;

    /**
     * 服务人员完工时间
     */
    private Integer workerFinishTime;

    /**
     * 完工时间
     */
    private Integer finishTime;

    /**
     * 区域经理审核时间
     */
    private Integer areaCheckTime;

    /**
     * 用户微信端语音留言
     */
    private String voice;

    /**
     * 声音时长
     */
    private Integer voiceLenth;

    /**
     * 用户微信端拍摄照片
     */
    private String picture;

    /**
     * 用户微信拍摄视频
     */
    private String video;

    /**
     * 用户微信端文字留言
     */
    private String leaveMessage;

    /**
     * 备注
     */
    private String remark;

    /**
     * 评价:1:差评,2:中评,3:好评,0:未评价
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
     * 是否紧急工单，1是，0不是
     */
    private Integer isUrgency;

    /**
     * 工单子信息总数量
     */
    private Integer childInfoNum;

    /**
     * 工单子信息未读数量
     */
    private Integer childNoreadNum;

    /**
     * 一段时间内是否预约客户，1已预约，0未预约
     */
    private Integer isAppointment;

    /**
     * 紧急工单推迟时间
     */
    private Integer postponeTime;

    /**
     * 结算状态
     */
    private Integer clearing;

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
     * 格力总部-派工工单id
     */
    private String pgguid;

    /**
     * 格力总部－派工主键id2
     */
    private String pgid;

    /**
     * 主类id
     */
    private Integer mainId;

    /**
     * 主类名称
     */
    private String mainName;

    /**
     * 总部保养 1总部保养 其他非总部保养
     */
    private String zbby;

    /**
     * 商品json
     */
    private String productJson;

    /**
     * 最新日志
     */
    private String orderLog;

    /**
     * 工单创建人姓名
     */
    private String operator;

    /**
     * 工单创建人id(系统用户的id)
     */
    private Integer operatorId;

    /**
     * 售货单位
     */
    @TableField("salesName")
    private String salesName;

    /**
     * 要维修的机器数量
     */
    private Integer machineNum;

    /**
     * 还需要完成的数量
     */
    private Integer needNum;

    /**
     * 审核状态
     */
    private Integer verifyStatus;

    /**
     * 同步至条码库（-1,咨询工单，不同步  0，未同步至金蝶；1，已同步至金蝶，2，同步至总部）
     */
    private Integer syscStatus;

    /**
     * 用户至网点的距离
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
     * 其他费用(网点添加其他费用)
     */
    private BigDecimal otherMoney;

    /**
     * 上门金额
     */
    private BigDecimal comeMoney;

    /**
     * 折扣金额
     */
    private BigDecimal discountMoney;

    /**
     * 审核备注
     */
    private String verifyRemark;

    /**
     * 激励金额
     */
    private BigDecimal incentiveAmount;

    /**
     * 明细json
     */
    private String detailJson;

    private Integer createTime;



}
