package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @author simba@onlying.cn
 * @date 2019/8/30 17:26
 */
//用户下单的交易模型
public class OrderModel {
    //2019083000012858
    private String id;

    //购买用户id
    private Integer userId;

    //购买商品id
    private Integer itemId;

    //若非空，则表示以秒杀商品方式下单
    private Integer promoId;

    //购买商品单价.若promoId非空则以秒杀商品价格下单
    private BigDecimal intemPrice;

    //购买数量
    private Integer amount;

    //购买金额,若promoId非空则以秒杀商品价格下单
    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getIntemPrice() {
        return intemPrice;
    }

    public void setIntemPrice(BigDecimal intemPrice) {
        this.intemPrice = intemPrice;
    }

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }
}
