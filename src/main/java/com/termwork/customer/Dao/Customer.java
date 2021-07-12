package com.termwork.customer.Dao;

public class Customer {
    private int id;             // id 身份证号
    private String name;        // name 姓名
    private int count;          // count 入住次数

    public Customer() {}

    public Customer(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
