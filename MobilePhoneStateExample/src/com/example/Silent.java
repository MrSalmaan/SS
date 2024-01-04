package com.example;

public class Silent implements MobilePhoneState {
    @Override
    public void incomingCall() {
        System.out.println(".....");
    }
}
