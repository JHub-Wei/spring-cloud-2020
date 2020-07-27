package com.domore.springcloud.service;

import com.domore.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @FileName: PaymentService
 * @Author: zhao
 * @Date: 2020/7/22 19:47
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
