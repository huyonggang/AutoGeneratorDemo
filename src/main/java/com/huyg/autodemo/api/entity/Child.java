package com.huyg.autodemo.api.entity;

import com.huyg.autodemo.base.BaseEntity;
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
@ApiModel(value="Child对象", description="")
public class Child extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别：0男，1女")
    private Integer sex;

    @ApiModelProperty(value = "生日")
    private String birthday;

    @ApiModelProperty(value = "眼睛度数")
    private Integer eyePower;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getEyePower() {
        return eyePower;
    }

    public void setEyePower(Integer eyePower) {
        this.eyePower = eyePower;
    }

    @Override
    public String toString() {
        return "Child{" +
        "userId=" + userId +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", eyePower=" + eyePower +
        "}";
    }
}
