package com.liujia.springmybatis.domain;

public class UserWithBLOBs extends User {
    /**
     * 
     */
    private String wx_miniprogram_path;

    /**
     * 
     */
    private String channel_url;

    /**
     * 
     */
    private String wx_qrcode_url;

    /**
     * 
     */
    private String click_url;

    /**
     * 
     */
    private String short_click_url;

    /**
     * 
     * @return wx_miniprogram_path 
     */
    public String getWx_miniprogram_path() {
        return wx_miniprogram_path;
    }

    /**
     * 
     * @param wx_miniprogram_path 
     */
    public void setWx_miniprogram_path(String wx_miniprogram_path) {
        this.wx_miniprogram_path = wx_miniprogram_path == null ? null : wx_miniprogram_path.trim();
    }

    /**
     * 
     * @return channel_url 
     */
    public String getChannel_url() {
        return channel_url;
    }

    /**
     * 
     * @param channel_url 
     */
    public void setChannel_url(String channel_url) {
        this.channel_url = channel_url == null ? null : channel_url.trim();
    }

    /**
     * 
     * @return wx_qrcode_url 
     */
    public String getWx_qrcode_url() {
        return wx_qrcode_url;
    }

    /**
     * 
     * @param wx_qrcode_url 
     */
    public void setWx_qrcode_url(String wx_qrcode_url) {
        this.wx_qrcode_url = wx_qrcode_url == null ? null : wx_qrcode_url.trim();
    }

    /**
     * 
     * @return click_url 
     */
    public String getClick_url() {
        return click_url;
    }

    /**
     * 
     * @param click_url 
     */
    public void setClick_url(String click_url) {
        this.click_url = click_url == null ? null : click_url.trim();
    }

    /**
     * 
     * @return short_click_url 
     */
    public String getShort_click_url() {
        return short_click_url;
    }

    /**
     * 
     * @param short_click_url 
     */
    public void setShort_click_url(String short_click_url) {
        this.short_click_url = short_click_url == null ? null : short_click_url.trim();
    }
}