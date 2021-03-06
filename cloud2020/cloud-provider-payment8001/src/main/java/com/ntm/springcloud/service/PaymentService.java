package com.ntm.springcloud.service;

import com.ntm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Blue
 * @date: 2021/3/9 14:10
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
