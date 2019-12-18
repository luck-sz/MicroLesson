package com.example.lesson.app.eventbus;

import java.util.List;

public class ChangeTag {

    private List<Integer> list;

    public ChangeTag(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
