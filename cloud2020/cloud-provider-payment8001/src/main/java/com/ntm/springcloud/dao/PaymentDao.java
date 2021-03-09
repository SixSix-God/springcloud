package com.ntm.springcloud.dao;

import com.ntm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Blue
 * @date: 2021/3/9 14:08
 */
public interface PaymentDao {
    public int creat(Payment payment);
    public Payment getPaymentById(@Param("id")Long id);
}
