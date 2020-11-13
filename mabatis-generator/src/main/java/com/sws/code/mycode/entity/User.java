package com.sws.code.mycode.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * 名字
     */
    private String fullName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 会员等级
     */
    private Integer level;

    /**
     * 商店名
     */
    private String shopName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

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
    private String nickName;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * pure_phone_number
     */
    private String purePhoneNumber;

    /**
     * country_code
     */
    private String countryCode;

    /**
     * 微信头像
     */
    private String avatarUrl;

    /**
     * 今天订单数量
     */
    private Integer todayOrder;

    /**
     * 累计返利订单
     */
    private Integer rebateOrder;

    /**
     * 累计返利金额（类额）
     */
    private Long rebateMoney;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 推荐人id
     */
    private String recommenderId;

    /**
     * 推荐人电话号码
     */
    private String recommenderPhoneNumber;

    /**
     * 邀请成功数量
     */
    private Integer invitationNumber;

    /**
     * 获取的卷
     */
    private Integer acquiredNumber;

    /**
     * 是否生效
     */
    private String whetherValid;

    /**
     * 最后访问时间
     */
    private Date visitDate;

    /**
     * 生日/年份
     */
    private Date birthDate;

    /**
     * 设备(第一次进入的设备)
     */
    private String equipment;

    /**
     * common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     */
    private String userType;

    /**
     * 勋章(如值为1,则威望勋章1)
     */
    private String medal;

    /**
     * 禁止截至时间
     */
    private Date forbidSayDate;

    /**
     * 禁止发布截至时间
     */
    private Date forbidPublishDate;

    /**
     * 禁止抢购霸晚餐截至时间
     */
    private Date forbidBuyOverbearfoodDate;

    /**
     * 对接第三方代理id
     */
    private String relationId;

    /**
     * 
     */
    private Integer doubleCard;

    /**
     * 饿了么渠道id
     */
    private String elemeRelationId;

    /**
     * 会员到期时间
     */
    private Date vipEndDate;

    /**
     * 会员续费次数
     */
    private Integer buyVipNum;

    /**
     * 会员首次购买时间
     */
    private Date firstBuyVipDate;

    /**
     * 会员卡ID
     */
    private String vipCardId;

    /**
     * 模板消息状态(false:不开启;true:开启)
     */
    private Byte messageStatus;

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
    private String meiOpenid;

    /**
     * 城市
     */
    private String cityName;

    /**
     * 地址
     */
    private String address;

    /**
     * 
     */
    private String wxMiniprogramPath;

    /**
     * 
     */
    private String channelUrl;

    /**
     * 
     */
    private String wxQrcodeUrl;

    /**
     * 
     */
    private String clickUrl;

    /**
     * 
     */
    private String shortClickUrl;

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
    public String getFullName() {
        return fullName;
    }

    /**
     * 名字
     * @param fullName 名字
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 用户名
     * @return user_name 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return pass_word 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 密码
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
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
    public String getShopName() {
        return shopName;
    }

    /**
     * 商店名
     * @param shopName 商店名
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 修改时间
     * @return update_date 修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 修改时间
     * @param updateDate 修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 电话号码
     * @return phone_number 电话号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 电话号码
     * @param phoneNumber 电话号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * pure_phone_number
     * @return pure_phone_number pure_phone_number
     */
    public String getPurePhoneNumber() {
        return purePhoneNumber;
    }

    /**
     * pure_phone_number
     * @param purePhoneNumber pure_phone_number
     */
    public void setPurePhoneNumber(String purePhoneNumber) {
        this.purePhoneNumber = purePhoneNumber == null ? null : purePhoneNumber.trim();
    }

    /**
     * country_code
     * @return country_code country_code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * country_code
     * @param countryCode country_code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * 微信头像
     * @return avatar_url 微信头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 微信头像
     * @param avatarUrl 微信头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * 今天订单数量
     * @return today_order 今天订单数量
     */
    public Integer getTodayOrder() {
        return todayOrder;
    }

    /**
     * 今天订单数量
     * @param todayOrder 今天订单数量
     */
    public void setTodayOrder(Integer todayOrder) {
        this.todayOrder = todayOrder;
    }

    /**
     * 累计返利订单
     * @return rebate_order 累计返利订单
     */
    public Integer getRebateOrder() {
        return rebateOrder;
    }

    /**
     * 累计返利订单
     * @param rebateOrder 累计返利订单
     */
    public void setRebateOrder(Integer rebateOrder) {
        this.rebateOrder = rebateOrder;
    }

    /**
     * 累计返利金额（类额）
     * @return rebate_money 累计返利金额（类额）
     */
    public Long getRebateMoney() {
        return rebateMoney;
    }

    /**
     * 累计返利金额（类额）
     * @param rebateMoney 累计返利金额（类额）
     */
    public void setRebateMoney(Long rebateMoney) {
        this.rebateMoney = rebateMoney;
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
    public String getRecommenderId() {
        return recommenderId;
    }

    /**
     * 推荐人id
     * @param recommenderId 推荐人id
     */
    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId == null ? null : recommenderId.trim();
    }

    /**
     * 推荐人电话号码
     * @return recommender_phone_number 推荐人电话号码
     */
    public String getRecommenderPhoneNumber() {
        return recommenderPhoneNumber;
    }

    /**
     * 推荐人电话号码
     * @param recommenderPhoneNumber 推荐人电话号码
     */
    public void setRecommenderPhoneNumber(String recommenderPhoneNumber) {
        this.recommenderPhoneNumber = recommenderPhoneNumber == null ? null : recommenderPhoneNumber.trim();
    }

    /**
     * 邀请成功数量
     * @return invitation_number 邀请成功数量
     */
    public Integer getInvitationNumber() {
        return invitationNumber;
    }

    /**
     * 邀请成功数量
     * @param invitationNumber 邀请成功数量
     */
    public void setInvitationNumber(Integer invitationNumber) {
        this.invitationNumber = invitationNumber;
    }

    /**
     * 获取的卷
     * @return acquired_number 获取的卷
     */
    public Integer getAcquiredNumber() {
        return acquiredNumber;
    }

    /**
     * 获取的卷
     * @param acquiredNumber 获取的卷
     */
    public void setAcquiredNumber(Integer acquiredNumber) {
        this.acquiredNumber = acquiredNumber;
    }

    /**
     * 是否生效
     * @return whether_valid 是否生效
     */
    public String getWhetherValid() {
        return whetherValid;
    }

    /**
     * 是否生效
     * @param whetherValid 是否生效
     */
    public void setWhetherValid(String whetherValid) {
        this.whetherValid = whetherValid == null ? null : whetherValid.trim();
    }

    /**
     * 最后访问时间
     * @return visit_date 最后访问时间
     */
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * 最后访问时间
     * @param visitDate 最后访问时间
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * 生日/年份
     * @return birth_date 生日/年份
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 生日/年份
     * @param birthDate 生日/年份
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
    public String getUserType() {
        return userType;
    }

    /**
     * common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     * @param userType common_user:普通用户;gourmet_user:美食经纪人;forbid_gourmet_user:清退美食经纪人
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
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
    public Date getForbidSayDate() {
        return forbidSayDate;
    }

    /**
     * 禁止截至时间
     * @param forbidSayDate 禁止截至时间
     */
    public void setForbidSayDate(Date forbidSayDate) {
        this.forbidSayDate = forbidSayDate;
    }

    /**
     * 禁止发布截至时间
     * @return forbid_publish_date 禁止发布截至时间
     */
    public Date getForbidPublishDate() {
        return forbidPublishDate;
    }

    /**
     * 禁止发布截至时间
     * @param forbidPublishDate 禁止发布截至时间
     */
    public void setForbidPublishDate(Date forbidPublishDate) {
        this.forbidPublishDate = forbidPublishDate;
    }

    /**
     * 禁止抢购霸晚餐截至时间
     * @return forbid_buy_overbearfood_date 禁止抢购霸晚餐截至时间
     */
    public Date getForbidBuyOverbearfoodDate() {
        return forbidBuyOverbearfoodDate;
    }

    /**
     * 禁止抢购霸晚餐截至时间
     * @param forbidBuyOverbearfoodDate 禁止抢购霸晚餐截至时间
     */
    public void setForbidBuyOverbearfoodDate(Date forbidBuyOverbearfoodDate) {
        this.forbidBuyOverbearfoodDate = forbidBuyOverbearfoodDate;
    }

    /**
     * 对接第三方代理id
     * @return relation_id 对接第三方代理id
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * 对接第三方代理id
     * @param relationId 对接第三方代理id
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    /**
     * 
     * @return double_card 
     */
    public Integer getDoubleCard() {
        return doubleCard;
    }

    /**
     * 
     * @param doubleCard 
     */
    public void setDoubleCard(Integer doubleCard) {
        this.doubleCard = doubleCard;
    }

    /**
     * 饿了么渠道id
     * @return eleme_relation_id 饿了么渠道id
     */
    public String getElemeRelationId() {
        return elemeRelationId;
    }

    /**
     * 饿了么渠道id
     * @param elemeRelationId 饿了么渠道id
     */
    public void setElemeRelationId(String elemeRelationId) {
        this.elemeRelationId = elemeRelationId == null ? null : elemeRelationId.trim();
    }

    /**
     * 会员到期时间
     * @return vip_end_date 会员到期时间
     */
    public Date getVipEndDate() {
        return vipEndDate;
    }

    /**
     * 会员到期时间
     * @param vipEndDate 会员到期时间
     */
    public void setVipEndDate(Date vipEndDate) {
        this.vipEndDate = vipEndDate;
    }

    /**
     * 会员续费次数
     * @return buy_vip_num 会员续费次数
     */
    public Integer getBuyVipNum() {
        return buyVipNum;
    }

    /**
     * 会员续费次数
     * @param buyVipNum 会员续费次数
     */
    public void setBuyVipNum(Integer buyVipNum) {
        this.buyVipNum = buyVipNum;
    }

    /**
     * 会员首次购买时间
     * @return first_buy_vip_date 会员首次购买时间
     */
    public Date getFirstBuyVipDate() {
        return firstBuyVipDate;
    }

    /**
     * 会员首次购买时间
     * @param firstBuyVipDate 会员首次购买时间
     */
    public void setFirstBuyVipDate(Date firstBuyVipDate) {
        this.firstBuyVipDate = firstBuyVipDate;
    }

    /**
     * 会员卡ID
     * @return vip_card_id 会员卡ID
     */
    public String getVipCardId() {
        return vipCardId;
    }

    /**
     * 会员卡ID
     * @param vipCardId 会员卡ID
     */
    public void setVipCardId(String vipCardId) {
        this.vipCardId = vipCardId == null ? null : vipCardId.trim();
    }

    /**
     * 模板消息状态(false:不开启;true:开启)
     * @return message_status 模板消息状态(false:不开启;true:开启)
     */
    public Byte getMessageStatus() {
        return messageStatus;
    }

    /**
     * 模板消息状态(false:不开启;true:开启)
     * @param messageStatus 模板消息状态(false:不开启;true:开启)
     */
    public void setMessageStatus(Byte messageStatus) {
        this.messageStatus = messageStatus;
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
    public String getMeiOpenid() {
        return meiOpenid;
    }

    /**
     * 美团用户的openid
     * @param meiOpenid 美团用户的openid
     */
    public void setMeiOpenid(String meiOpenid) {
        this.meiOpenid = meiOpenid == null ? null : meiOpenid.trim();
    }

    /**
     * 城市
     * @return city_name 城市
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 城市
     * @param cityName 城市
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
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

    /**
     * 
     * @return wx_miniprogram_path 
     */
    public String getWxMiniprogramPath() {
        return wxMiniprogramPath;
    }

    /**
     * 
     * @param wxMiniprogramPath 
     */
    public void setWxMiniprogramPath(String wxMiniprogramPath) {
        this.wxMiniprogramPath = wxMiniprogramPath == null ? null : wxMiniprogramPath.trim();
    }

    /**
     * 
     * @return channel_url 
     */
    public String getChannelUrl() {
        return channelUrl;
    }

    /**
     * 
     * @param channelUrl 
     */
    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl == null ? null : channelUrl.trim();
    }

    /**
     * 
     * @return wx_qrcode_url 
     */
    public String getWxQrcodeUrl() {
        return wxQrcodeUrl;
    }

    /**
     * 
     * @param wxQrcodeUrl 
     */
    public void setWxQrcodeUrl(String wxQrcodeUrl) {
        this.wxQrcodeUrl = wxQrcodeUrl == null ? null : wxQrcodeUrl.trim();
    }

    /**
     * 
     * @return click_url 
     */
    public String getClickUrl() {
        return clickUrl;
    }

    /**
     * 
     * @param clickUrl 
     */
    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl == null ? null : clickUrl.trim();
    }

    /**
     * 
     * @return short_click_url 
     */
    public String getShortClickUrl() {
        return shortClickUrl;
    }

    /**
     * 
     * @param shortClickUrl 
     */
    public void setShortClickUrl(String shortClickUrl) {
        this.shortClickUrl = shortClickUrl == null ? null : shortClickUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fullName=").append(fullName);
        sb.append(", userName=").append(userName);
        sb.append(", passWord=").append(passWord);
        sb.append(", level=").append(level);
        sb.append(", shopName=").append(shopName);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", openid=").append(openid);
        sb.append(", unionid=").append(unionid);
        sb.append(", nickName=").append(nickName);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", purePhoneNumber=").append(purePhoneNumber);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", todayOrder=").append(todayOrder);
        sb.append(", rebateOrder=").append(rebateOrder);
        sb.append(", rebateMoney=").append(rebateMoney);
        sb.append(", integral=").append(integral);
        sb.append(", recommenderId=").append(recommenderId);
        sb.append(", recommenderPhoneNumber=").append(recommenderPhoneNumber);
        sb.append(", invitationNumber=").append(invitationNumber);
        sb.append(", acquiredNumber=").append(acquiredNumber);
        sb.append(", whetherValid=").append(whetherValid);
        sb.append(", visitDate=").append(visitDate);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", equipment=").append(equipment);
        sb.append(", userType=").append(userType);
        sb.append(", medal=").append(medal);
        sb.append(", forbidSayDate=").append(forbidSayDate);
        sb.append(", forbidPublishDate=").append(forbidPublishDate);
        sb.append(", forbidBuyOverbearfoodDate=").append(forbidBuyOverbearfoodDate);
        sb.append(", relationId=").append(relationId);
        sb.append(", doubleCard=").append(doubleCard);
        sb.append(", elemeRelationId=").append(elemeRelationId);
        sb.append(", vipEndDate=").append(vipEndDate);
        sb.append(", buyVipNum=").append(buyVipNum);
        sb.append(", firstBuyVipDate=").append(firstBuyVipDate);
        sb.append(", vipCardId=").append(vipCardId);
        sb.append(", messageStatus=").append(messageStatus);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", meiOpenid=").append(meiOpenid);
        sb.append(", cityName=").append(cityName);
        sb.append(", address=").append(address);
        sb.append(", wxMiniprogramPath=").append(wxMiniprogramPath);
        sb.append(", channelUrl=").append(channelUrl);
        sb.append(", wxQrcodeUrl=").append(wxQrcodeUrl);
        sb.append(", clickUrl=").append(clickUrl);
        sb.append(", shortClickUrl=").append(shortClickUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}