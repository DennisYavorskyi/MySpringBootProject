package com.practise.proxy;

import com.practise.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
