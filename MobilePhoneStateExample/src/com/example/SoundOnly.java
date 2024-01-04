package com.example;

public class SoundOnly implements MobilePhoneState {
    @Override
    public void incomingCall() {
        System.out.println("Beep!");
    }
}
