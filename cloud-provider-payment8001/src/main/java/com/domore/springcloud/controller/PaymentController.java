package com.domore.springcloud.controller;

import com.domore.springcloud.entities.CommonResult;
import com.domore.springcloud.entities.Payment;
import com.domore.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @FileName: PaymentController
 * @Author: zhao
 * @Date: 2020/7/22 19:53
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果：{}.", result);

        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else {
            return new CommonResult(444, "插入数据失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果：{}.", payment);

        if (Objects.nonNull(payment)) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, String.format("记录不存在，id：%s", id));
        }
    }
}
