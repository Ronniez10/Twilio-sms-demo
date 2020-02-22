package com.neelav.service;

import com.neelav.model.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private  SmsSender smsSender;


    public void sendSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
