package com.practise;

import com.practise.config.ProjectConfig;
import com.practise.model.Comment;
import com.practise.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PractiseApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//
//        System.out.println(cs1);
//        System.out.println(cs2);
//        System.out.println(cs1 == cs2);


    }
}
