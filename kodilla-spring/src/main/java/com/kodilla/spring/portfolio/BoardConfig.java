package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("firstList")
    public TaskList firstList;

    @Autowired
    @Qualifier("secondList")
    public TaskList secondList;

    @Autowired
    @Qualifier("thirdList")
    public TaskList thirdList;

    @Bean
    public Board getBoard() {
        return new Board(firstList, secondList, thirdList);
    }

    @Bean(name = "firstList")
    @Scope("prototype")
    public TaskList getFirstList() {
        return new TaskList();
    }

    @Bean(name = "secondList")
    @Scope("prototype")
    public TaskList getSecondList() {
        return new TaskList();
    }

    @Bean(name = "thirdList")
    @Scope("prototype")
    public TaskList getThirdList() {
        return new TaskList();
    }
}
