package com.neelav.resource;

import com.neelav.service.SenderService;
import com.neelav.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class MainResource {

    private final SenderService senderService;

    @Autowired
    public MainResource(SenderService senderService) {
        this.senderService = senderService;
    }

    @GetMapping("/hello")
    public String printHello()
    {
        return "Hello World";
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        senderService.sendSms(smsRequest);
    }
}
