package service;

import java.math.BigDecimal;

/**
 * @Author:wangqi
 * @Description:  基础类
 * @Date:Created in 2019/7/27
 * @Modified by:
 */
public interface Strategy {
    BigDecimal calRecharge(Integer channelId, Integer goodsId);
}
