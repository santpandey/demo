package com.example.demo.service;

import java.util.List;

public class DataResponse {
    List<Integer> fiveMinute;

    List<Integer> thirtyMinute;

    List<Integer> tenMinute;

    List<Integer> allList;

    public List<Integer> getFiveMinute() {
        return fiveMinute;
    }

    public void setFiveMinute(List<Integer> fiveMinute) {
        this.fiveMinute = fiveMinute;
    }

    public List<Integer> getTenMinute() {
        return tenMinute;
    }

    public void setTenMinute(List<Integer> tenMinute) {
        this.tenMinute = tenMinute;
    }

    public List<Integer> getAllList() {
        return allList;
    }

    public void setAllList(List<Integer> allList) {
        this.allList = allList;
    }

    public List<Integer> getThirtyMinute() {
        return thirtyMinute;
    }

    public void setThirtyMinute(List<Integer> thirtyMinute) {
        this.thirtyMinute = thirtyMinute;
    }
}
