package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @GetMapping(value = "/payment/get/{id}")
    public String getPaymentById(@PathVariable("id") String id) {
        return "8001";
    }

}
