package cn.jingying.pojo;

import java.util.Date;

public class Cart {
    private Integer id;

    private Integer userId;

    private Integer skuId;

    private Integer quantity;

    private Boolean checked;

    private Date createTime;

    private Date updateTime;

    private Boolean status;

    public Cart(Integer id, Integer userId, Integer skuId, Integer quantity, Boolean checked, Date createTime, Date updateTime, Boolean status) {
        this.id = id;
        this.userId = userId;
        this.skuId = skuId;
        this.quantity = quantity;
        this.checked = checked;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Cart() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}