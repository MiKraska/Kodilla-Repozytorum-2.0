package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        String user = forumUser.getUsername();

        Assert.assertEquals("John Smith",user);
    }
}