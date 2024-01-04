package com.example;

public class SoundAndVibrate implements MobilePhoneState {
    @Override
    public void incomingCall() {
        System.out.println("BzzzBeepBzzz");
    }
}
