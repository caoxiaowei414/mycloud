package com.xiaowei.eurekaprovider8001.entity.cardpackage;

import java.util.Date;
import javax.persistence.*;

@Table(name = "m_cardpackage")
public class MCardpackage {
    /**
     * 主键
     */
    @Id
    @Column(name = "package_id")
    private Long packageId;

    /**
     * 套餐名称
     */
    @Column(name = "package_name")
    private String packageName;

    /**
     * 流量大小 单位:M
     */
    @Column(name = "flow_size")
    private Long flowSize;

    /**
     * 标准价格 单位:分
     */
    @Column(name = "stand_price")
    private Integer standPrice;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return package_id - 主键
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * 设置主键
     *
     * @param packageId 主键
     */
    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    /**
     * 获取套餐名称
     *
     * @return package_name - 套餐名称
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置套餐名称
     *
     * @param packageName 套餐名称
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * 获取流量大小 单位:M
     *
     * @return flow_size - 流量大小 单位:M
     */
    public Long getFlowSize() {
        return flowSize;
    }

    /**
     * 设置流量大小 单位:M
     *
     * @param flowSize 流量大小 单位:M
     */
    public void setFlowSize(Long flowSize) {
        this.flowSize = flowSize;
    }

    /**
     * 获取标准价格 单位:分
     *
     * @return stand_price - 标准价格 单位:分
     */
    public Integer getStandPrice() {
        return standPrice;
    }

    /**
     * 设置标准价格 单位:分
     *
     * @param standPrice 标准价格 单位:分
     */
    public void setStandPrice(Integer standPrice) {
        this.standPrice = standPrice;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}