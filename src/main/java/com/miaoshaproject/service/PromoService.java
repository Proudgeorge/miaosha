package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author simba@onlying.cn
 * @date 2019/9/2 12:55
 */
public interface PromoService {
    //根据itemId获取即将进行的获正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);

}
