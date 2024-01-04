package com.example;

public class VibrateOnly implements MobilePhoneState {
    @Override
    public void incomingCall() {
        System.out.println("Bzzz");
    }
}
