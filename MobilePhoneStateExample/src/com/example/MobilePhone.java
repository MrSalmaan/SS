package com.example;

public class MobilePhone {
    private MobilePhoneState currentState;

    public MobilePhone(MobilePhoneState initialState) {
        currentState = initialState;
    }

    public void setState(MobilePhoneState state) {
        currentState = state;
    }

    public void incomingCall() {
        currentState.incomingCall();
    }

    public static void main(String[] args) {
        // Create the MobilePhone
        MobilePhone phone = new MobilePhone(new Silent());
        phone.incomingCall();

        // Switch to VibrateOnly mode
        phone.setState(new VibrateOnly());
        phone.incomingCall();

        // Switch to SoundOnly mode
        phone.setState(new SoundOnly());
        phone.incomingCall();

        // Switch to SoundAndVibrate mode
        phone.setState(new SoundAndVibrate());
        phone.incomingCall();
    }
}
