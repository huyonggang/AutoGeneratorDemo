package com.huyg.autodemo.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.huyg.autodemo.base.BaseEntity;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author huyg
 * @since 2020-11-02
 */
@TableName("expert")
@ApiModel(value="Expert对象", description="")
public class Expert extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty(value = "头像")
    @TableField("avatar")
    private String avatar;

    @ApiModelProperty(value = "性别：0男，1女")
    @TableField("sex")
    private Integer sex;

    @ApiModelProperty(value = "职称")
    @TableField("professor")
    private String professor;

    @ApiModelProperty(value = "擅长")
    @TableField("good_at")
    private String goodAt;

    @ApiModelProperty(value = "简介")
    @TableField("Introduction")
    private Blob Introduction;

    @ApiModelProperty(value = "是否在线0：不在线，1：在线")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "环信uuid")
    @TableField("em_uuid")
    private String emUuid;

    @ApiModelProperty(value = "环信用户id")
    @TableField("em_username")
    private String emUsername;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt;
    }

    public Blob getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(Blob Introduction) {
        this.Introduction = Introduction;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmUuid() {
        return emUuid;
    }

    public void setEmUuid(String emUuid) {
        this.emUuid = emUuid;
    }

    public String getEmUsername() {
        return emUsername;
    }

    public void setEmUsername(String emUsername) {
        this.emUsername = emUsername;
    }

    @Override
    public String toString() {
        return "Expert{" +
        "phone=" + phone +
        ", nickname=" + nickname +
        ", avatar=" + avatar +
        ", sex=" + sex +
        ", professor=" + professor +
        ", goodAt=" + goodAt +
        ", Introduction=" + Introduction +
        ", status=" + status +
        ", emUuid=" + emUuid +
        ", emUsername=" + emUsername +
        "}";
    }
}
