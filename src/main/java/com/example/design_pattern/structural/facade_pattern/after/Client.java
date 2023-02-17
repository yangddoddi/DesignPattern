package com.example.design_pattern.structural.facade_pattern.after;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage message = new EmailMessage("dd", "dd", "dd", "dd", "dd");
        emailSender.sendMail(message);
    }
}
