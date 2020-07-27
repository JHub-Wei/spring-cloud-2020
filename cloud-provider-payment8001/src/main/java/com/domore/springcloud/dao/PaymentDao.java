package com.domore.springcloud.dao;

import com.domore.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @FileName: PaymentDao
 * @Author: zhao
 * @Date: 2020/7/22 7:43
 **/
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
