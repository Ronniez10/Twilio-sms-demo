package com.neelav.resource;

import com.neelav.service.SenderService;
import com.neelav.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/sms")
public class MainResource {

    private final SenderService senderService;

    @Autowired
    public MainResource(SenderService senderService) {
        this.senderService = senderService;
    }

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
        senderService.sendSms(smsRequest);
    }
}
