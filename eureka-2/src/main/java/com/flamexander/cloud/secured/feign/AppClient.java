package com.flamexander.cloud.secured.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface AppClient {

    @GetMapping("/abcr")
    public String test();
}
