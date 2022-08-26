package com.practise.service;

import com.practise.model.Comment;
import com.practise.proxy.CommentNotificationProxy;
import com.practise.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository repository,@Qualifier("commentPushNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = repository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
