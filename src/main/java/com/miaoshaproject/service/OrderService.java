package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

/**
 * @author simba@onlying.cn
 * @date 2019/8/31 23:14
 */
public interface OrderService {
    //使用1.通过前端url上传过来秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已开始
    //2.直接在下单接口内判断对应的商品是否存在秒杀活动，若在进行中的则以秒杀价格下单
    OrderModel createOrder(Integer userId,Integer itemId,Integer promoId, Integer amount) throws BusinessException;

}
