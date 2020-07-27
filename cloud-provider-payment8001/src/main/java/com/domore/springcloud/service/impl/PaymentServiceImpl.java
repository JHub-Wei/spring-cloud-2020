package com.domore.springcloud.service.impl;

import com.domore.springcloud.dao.PaymentDao;
import com.domore.springcloud.entities.Payment;
import com.domore.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @FileName: PaymentServiceImpl
 * @Author: zhao
 * @Date: 2020/7/22 19:47
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
