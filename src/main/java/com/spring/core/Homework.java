package com.spring.core;

import org.springframework.stereotype.Component;


@Component
public class Homework {
    private int homeworkid;
    private String homeworktitle;

    public int getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(int homeworkid) {
        this.homeworkid = homeworkid;
    }

    public String getHomeworktitle() {
        return homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        this.homeworktitle = homeworktitle;
    }
}
