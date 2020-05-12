package com.neelav.service;

import com.neelav.model.SmsRequest;

public interface SmsSender {

    void sendSms(SmsRequest smsRequest);

    void sendWhatsAppSms(SmsRequest smsRequest);

    // or maybe void sendSms(String phoneNumber, String message);
}
