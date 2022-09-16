package com.example.design_pattern.structural.decorator_pattern.after;

public class ClientAfter {
    private CommentService commentService;

    public ClientAfter(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}
