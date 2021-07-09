package com.termwork.customer.Dao;

import java.util.Date;

public class Record {
    private Date date;
    private int number;

    public Record() {}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
