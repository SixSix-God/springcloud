package com.ntm.springcloud.service.impl;

import com.ntm.springcloud.entities.Payment;
import com.ntm.springcloud.dao.PaymentDao;
import com.ntm.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Blue
 * @date: 2021/3/9 14:11
 */
public class PaymentImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
