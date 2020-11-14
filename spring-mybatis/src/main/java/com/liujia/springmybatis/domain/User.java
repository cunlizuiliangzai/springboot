package com.liujia.springmybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class User extends BaseDomain implements Serializable {
    /**
     *
     */
    private String id;

    /**
     * 名字
     */
    private String full_name;

    /**
     * 用户名
     */
    private String user_name;

    /**
     * 密码
     */
    private String pass_word;

    /**
     * 会员等级
     */
    private Integer level;

    /**
     * 商店名
     */
    private String shop_name;

    /**
     * 创建时间
     */
    private Date create_date;

    /**
     * 修改时间
     */
    private Date update_date;

    /**
     * 小程序id
     */
    private String openid;

    /**
     * 联合id
     */
    private String unionid;

    /**
     * 昵称
     */
    private String nick_name;

    /**
     * 电话号码
     */
    private String phone_number;

    /**
     * pure_phone_number
     */
    private String pure_phone_number;

    /**
     * country_code
     */
    private String country_code;

    /**
     * 微信头像
     */
    private String avatar_url;

    /**
     * 今天订单数量
     */
    private Integer today_order;

    /**
     * 累计返利订单
     */
    private Integer rebate_order;

    /**
     * 累计返利金额（类额）
     */
    private Long rebate_money;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 推荐人id
     */
    private String recommender_id;

    /**
     * 推荐人电话号码
     */
    private String recommender_phone_number;

    /**
     * 邀请成功数量
     */
    private Integer invitation_number;

    /**
     * 获取的卷
     */
    private Integer acquired_number;

    /**
     * 是否生效
     */
    private String whether_valid;

    /**
     * 最后访问时间
     */
    private Date visit_date;

    /**
     * 生日/年份
     */
    private Date birth_date;

    /**
     * 设备(第一次进入的设备)
     */
    private String equipment;

    /**
     * common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     */
    private String user_type;

    /**
     * 勋章(如值为1,则威望勋章1)
     */
    private String medal;

    /**
     * 禁止截至时间
     */
    private Date forbid_say_date;

    /**
     * 禁止发布截至时间
     */
    private Date forbid_publish_date;

    /**
     * 禁止抢购霸晚餐截至时间
     */
    private Date forbid_buy_overbearfood_date;

    /**
     * 对接第三方代理id
     */
    private String relation_id;

    /**
     *
     */
    private Integer double_card;

    /**
     * 饿了么渠道id
     */
    private String eleme_relation_id;

    /**
     * 会员到期时间
     */
    private Date vip_end_date;

    /**
     * 会员续费次数
     */
    private Integer buy_vip_num;

    /**
     * 会员首次购买时间
     */
    private Date first_buy_vip_date;

    /**
     * 会员卡ID
     */
    private String vip_card_id;

    /**
     * 模板消息状态(false:不开启;true:开启)
     */
    private Byte message_status;

    /**
     * 进度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 美团用户的openid
     */
    private String mei_openid;

    /**
     * 城市
     */
    private String city_name;

    /**
     * 地址
     */
    private String address;

    /**
     * t_user
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 名字
     * @return full_name 名字
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * 名字
     * @param full_name 名字
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name == null ? null : full_name.trim();
    }

    /**
     * 用户名
     * @return user_name 用户名
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * 用户名
     * @param user_name 用户名
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * 密码
     * @return pass_word 密码
     */
    public String getPass_word() {
        return pass_word;
    }

    /**
     * 密码
     * @param pass_word 密码
     */
    public void setPass_word(String pass_word) {
        this.pass_word = pass_word == null ? null : pass_word.trim();
    }

    /**
     * 会员等级
     * @return level 会员等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 会员等级
     * @param level 会员等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 商店名
     * @return shop_name 商店名
     */
    public String getShop_name() {
        return shop_name;
    }

    /**
     * 商店名
     * @param shop_name 商店名
     */
    public void setShop_name(String shop_name) {
        this.shop_name = shop_name == null ? null : shop_name.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * 创建时间
     * @param create_date 创建时间
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * 修改时间
     * @return update_date 修改时间
     */
    public Date getUpdate_date() {
        return update_date;
    }

    /**
     * 修改时间
     * @param update_date 修改时间
     */
    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    /**
     * 小程序id
     * @return openid 小程序id
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 小程序id
     * @param openid 小程序id
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 联合id
     * @return unionid 联合id
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 联合id
     * @param unionid 联合id
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * 昵称
     * @return nick_name 昵称
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     * 昵称
     * @param nick_name 昵称
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * 电话号码
     * @return phone_number 电话号码
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * 电话号码
     * @param phone_number 电话号码
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number == null ? null : phone_number.trim();
    }

    /**
     * pure_phone_number
     * @return pure_phone_number pure_phone_number
     */
    public String getPure_phone_number() {
        return pure_phone_number;
    }

    /**
     * pure_phone_number
     * @param pure_phone_number pure_phone_number
     */
    public void setPure_phone_number(String pure_phone_number) {
        this.pure_phone_number = pure_phone_number == null ? null : pure_phone_number.trim();
    }

    /**
     * country_code
     * @return country_code country_code
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     * country_code
     * @param country_code country_code
     */
    public void setCountry_code(String country_code) {
        this.country_code = country_code == null ? null : country_code.trim();
    }

    /**
     * 微信头像
     * @return avatar_url 微信头像
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     * 微信头像
     * @param avatar_url 微信头像
     */
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url == null ? null : avatar_url.trim();
    }

    /**
     * 今天订单数量
     * @return today_order 今天订单数量
     */
    public Integer getToday_order() {
        return today_order;
    }

    /**
     * 今天订单数量
     * @param today_order 今天订单数量
     */
    public void setToday_order(Integer today_order) {
        this.today_order = today_order;
    }

    /**
     * 累计返利订单
     * @return rebate_order 累计返利订单
     */
    public Integer getRebate_order() {
        return rebate_order;
    }

    /**
     * 累计返利订单
     * @param rebate_order 累计返利订单
     */
    public void setRebate_order(Integer rebate_order) {
        this.rebate_order = rebate_order;
    }

    /**
     * 累计返利金额（类额）
     * @return rebate_money 累计返利金额（类额）
     */
    public Long getRebate_money() {
        return rebate_money;
    }

    /**
     * 累计返利金额（类额）
     * @param rebate_money 累计返利金额（类额）
     */
    public void setRebate_money(Long rebate_money) {
        this.rebate_money = rebate_money;
    }

    /**
     * 积分
     * @return integral 积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 积分
     * @param integral 积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 推荐人id
     * @return recommender_id 推荐人id
     */
    public String getRecommender_id() {
        return recommender_id;
    }

    /**
     * 推荐人id
     * @param recommender_id 推荐人id
     */
    public void setRecommender_id(String recommender_id) {
        this.recommender_id = recommender_id == null ? null : recommender_id.trim();
    }

    /**
     * 推荐人电话号码
     * @return recommender_phone_number 推荐人电话号码
     */
    public String getRecommender_phone_number() {
        return recommender_phone_number;
    }

    /**
     * 推荐人电话号码
     * @param recommender_phone_number 推荐人电话号码
     */
    public void setRecommender_phone_number(String recommender_phone_number) {
        this.recommender_phone_number = recommender_phone_number == null ? null : recommender_phone_number.trim();
    }

    /**
     * 邀请成功数量
     * @return invitation_number 邀请成功数量
     */
    public Integer getInvitation_number() {
        return invitation_number;
    }

    /**
     * 邀请成功数量
     * @param invitation_number 邀请成功数量
     */
    public void setInvitation_number(Integer invitation_number) {
        this.invitation_number = invitation_number;
    }

    /**
     * 获取的卷
     * @return acquired_number 获取的卷
     */
    public Integer getAcquired_number() {
        return acquired_number;
    }

    /**
     * 获取的卷
     * @param acquired_number 获取的卷
     */
    public void setAcquired_number(Integer acquired_number) {
        this.acquired_number = acquired_number;
    }

    /**
     * 是否生效
     * @return whether_valid 是否生效
     */
    public String getWhether_valid() {
        return whether_valid;
    }

    /**
     * 是否生效
     * @param whether_valid 是否生效
     */
    public void setWhether_valid(String whether_valid) {
        this.whether_valid = whether_valid == null ? null : whether_valid.trim();
    }

    /**
     * 最后访问时间
     * @return visit_date 最后访问时间
     */
    public Date getVisit_date() {
        return visit_date;
    }

    /**
     * 最后访问时间
     * @param visit_date 最后访问时间
     */
    public void setVisit_date(Date visit_date) {
        this.visit_date = visit_date;
    }

    /**
     * 生日/年份
     * @return birth_date 生日/年份
     */
    public Date getBirth_date() {
        return birth_date;
    }

    /**
     * 生日/年份
     * @param birth_date 生日/年份
     */
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    /**
     * 设备(第一次进入的设备)
     * @return equipment 设备(第一次进入的设备)
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * 设备(第一次进入的设备)
     * @param equipment 设备(第一次进入的设备)
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment == null ? null : equipment.trim();
    }

    /**
     * common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     * @return user_type common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     */
    public String getUser_type() {
        return user_type;
    }

    /**
     * common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     * @param user_type common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     */
    public void setUser_type(String user_type) {
        this.user_type = user_type == null ? null : user_type.trim();
    }

    /**
     * 勋章(如值为1,则威望勋章1)
     * @return medal 勋章(如值为1,则威望勋章1)
     */
    public String getMedal() {
        return medal;
    }

    /**
     * 勋章(如值为1,则威望勋章1)
     * @param medal 勋章(如值为1,则威望勋章1)
     */
    public void setMedal(String medal) {
        this.medal = medal == null ? null : medal.trim();
    }

    /**
     * 禁止截至时间
     * @return forbid_say_date 禁止截至时间
     */
    public Date getForbid_say_date() {
        return forbid_say_date;
    }

    /**
     * 禁止截至时间
     * @param forbid_say_date 禁止截至时间
     */
    public void setForbid_say_date(Date forbid_say_date) {
        this.forbid_say_date = forbid_say_date;
    }

    /**
     * 禁止发布截至时间
     * @return forbid_publish_date 禁止发布截至时间
     */
    public Date getForbid_publish_date() {
        return forbid_publish_date;
    }

    /**
     * 禁止发布截至时间
     * @param forbid_publish_date 禁止发布截至时间
     */
    public void setForbid_publish_date(Date forbid_publish_date) {
        this.forbid_publish_date = forbid_publish_date;
    }

    /**
     * 禁止抢购霸晚餐截至时间
     * @return forbid_buy_overbearfood_date 禁止抢购霸晚餐截至时间
     */
    public Date getForbid_buy_overbearfood_date() {
        return forbid_buy_overbearfood_date;
    }

    /**
     * 禁止抢购霸晚餐截至时间
     * @param forbid_buy_overbearfood_date 禁止抢购霸晚餐截至时间
     */
    public void setForbid_buy_overbearfood_date(Date forbid_buy_overbearfood_date) {
        this.forbid_buy_overbearfood_date = forbid_buy_overbearfood_date;
    }

    /**
     * 对接第三方代理id
     * @return relation_id 对接第三方代理id
     */
    public String getRelation_id() {
        return relation_id;
    }

    /**
     * 对接第三方代理id
     * @param relation_id 对接第三方代理id
     */
    public void setRelation_id(String relation_id) {
        this.relation_id = relation_id == null ? null : relation_id.trim();
    }

    /**
     *
     * @return double_card
     */
    public Integer getDouble_card() {
        return double_card;
    }

    /**
     *
     * @param double_card
     */
    public void setDouble_card(Integer double_card) {
        this.double_card = double_card;
    }

    /**
     * 饿了么渠道id
     * @return eleme_relation_id 饿了么渠道id
     */
    public String getEleme_relation_id() {
        return eleme_relation_id;
    }

    /**
     * 饿了么渠道id
     * @param eleme_relation_id 饿了么渠道id
     */
    public void setEleme_relation_id(String eleme_relation_id) {
        this.eleme_relation_id = eleme_relation_id == null ? null : eleme_relation_id.trim();
    }

    /**
     * 会员到期时间
     * @return vip_end_date 会员到期时间
     */
    public Date getVip_end_date() {
        return vip_end_date;
    }

    /**
     * 会员到期时间
     * @param vip_end_date 会员到期时间
     */
    public void setVip_end_date(Date vip_end_date) {
        this.vip_end_date = vip_end_date;
    }

    /**
     * 会员续费次数
     * @return buy_vip_num 会员续费次数
     */
    public Integer getBuy_vip_num() {
        return buy_vip_num;
    }

    /**
     * 会员续费次数
     * @param buy_vip_num 会员续费次数
     */
    public void setBuy_vip_num(Integer buy_vip_num) {
        this.buy_vip_num = buy_vip_num;
    }

    /**
     * 会员首次购买时间
     * @return first_buy_vip_date 会员首次购买时间
     */
    public Date getFirst_buy_vip_date() {
        return first_buy_vip_date;
    }

    /**
     * 会员首次购买时间
     * @param first_buy_vip_date 会员首次购买时间
     */
    public void setFirst_buy_vip_date(Date first_buy_vip_date) {
        this.first_buy_vip_date = first_buy_vip_date;
    }

    /**
     * 会员卡ID
     * @return vip_card_id 会员卡ID
     */
    public String getVip_card_id() {
        return vip_card_id;
    }

    /**
     * 会员卡ID
     * @param vip_card_id 会员卡ID
     */
    public void setVip_card_id(String vip_card_id) {
        this.vip_card_id = vip_card_id == null ? null : vip_card_id.trim();
    }

    /**
     * 模板消息状态(false:不开启;true:开启)
     * @return message_status 模板消息状态(false:不开启;true:开启)
     */
    public Byte getMessage_status() {
        return message_status;
    }

    /**
     * 模板消息状态(false:不开启;true:开启)
     * @param message_status 模板消息状态(false:不开启;true:开启)
     */
    public void setMessage_status(Byte message_status) {
        this.message_status = message_status;
    }

    /**
     * 进度
     * @return longitude 进度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 进度
     * @param longitude 进度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 纬度
     * @return latitude 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 纬度
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 美团用户的openid
     * @return mei_openid 美团用户的openid
     */
    public String getMei_openid() {
        return mei_openid;
    }

    /**
     * 美团用户的openid
     * @param mei_openid 美团用户的openid
     */
    public void setMei_openid(String mei_openid) {
        this.mei_openid = mei_openid == null ? null : mei_openid.trim();
    }

    /**
     * 城市
     * @return city_name 城市
     */
    public String getCity_name() {
        return city_name;
    }

    /**
     * 城市
     * @param city_name 城市
     */
    public void setCity_name(String city_name) {
        this.city_name = city_name == null ? null : city_name.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}