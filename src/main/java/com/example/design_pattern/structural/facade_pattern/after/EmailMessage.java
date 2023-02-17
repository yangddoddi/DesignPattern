package com.example.design_pattern.structural.facade_pattern.after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmailMessage {
    private String from;
    private String to;
    private String subject;
    private String text;
    private String title;
}
