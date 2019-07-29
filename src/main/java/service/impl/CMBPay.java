package service.impl;

import annotation.PayAnnotation;
import service.Strategy;

import java.math.BigDecimal;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/27
 * @Modified by:
 */
@PayAnnotation(1)
public class CMBPay implements Strategy {

    @Override
    public BigDecimal calRecharge(Integer channelId, Integer goodsId) {
        //业务逻辑
        return null;
    }
}
