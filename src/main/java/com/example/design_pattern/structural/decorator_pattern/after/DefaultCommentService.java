package com.example.design_pattern.structural.decorator_pattern.after;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
