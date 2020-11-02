package com.huyg.autodemo.api.entity;

import java.time.LocalDateTime;
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
@ApiModel(value="Activity对象", description="")
public class Activity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "活动标题")
    private String title;

    @ApiModelProperty(value = "活动内容")
    private String content;

    @ApiModelProperty(value = "活动地点")
    private String address;

    @ApiModelProperty(value = "活动开始时间")
    private LocalDateTime timeStart;

    @ApiModelProperty(value = "活动结束时间")
    private LocalDateTime timeEnd;

    @ApiModelProperty(value = "活动宣传页")
    private String image;

    @ApiModelProperty(value = "最多参与人数")
    private String peopleMax;

    @ApiModelProperty(value = "当前参与人数")
    private String peopleCount;

    @ApiModelProperty(value = "是否开启")
    private Integer visible;

    @ApiModelProperty(value = "活动url")
    private String activityUrl;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalDateTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalDateTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(String peopleMax) {
        this.peopleMax = peopleMax;
    }

    public String getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(String peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    @Override
    public String toString() {
        return "Activity{" +
        "title=" + title +
        ", content=" + content +
        ", address=" + address +
        ", timeStart=" + timeStart +
        ", timeEnd=" + timeEnd +
        ", image=" + image +
        ", peopleMax=" + peopleMax +
        ", peopleCount=" + peopleCount +
        ", visible=" + visible +
        ", activityUrl=" + activityUrl +
        "}";
    }
}
