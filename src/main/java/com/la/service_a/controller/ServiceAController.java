package com.la.service_a.controller;


import com.la.service_a.remoteservice.ServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceAController {

    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/mensaje")
    public String serviceA() {
        return "Respuesta desde Service A";
    }

    @GetMapping("/mensaje-b")
    public String getMensajeFromServiceB() {
        return serviceBClient.getMensajeDeServiceB();
    }
}
