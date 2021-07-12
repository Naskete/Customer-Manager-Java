package com.termwork.customer.Dao;

import java.util.Date;

public class Record {
    private int id;         // id 记录号
    private int cusID;      // cusID 用户id
    private int num;        // number 房间号
    private Date date;      // date 日期

    public Record() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
