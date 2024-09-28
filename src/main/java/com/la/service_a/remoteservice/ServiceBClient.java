package com.la.service_a.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b")
public interface ServiceBClient {

    @GetMapping("/mensaje")
    String getMensajeDeServiceB();
}
