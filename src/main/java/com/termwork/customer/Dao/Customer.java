package com.termwork.customer.Dao;

public class Customer {
    private String id;            // id 身份证号
    private String name;        // name 姓名
    private String phone;       // phone 电话号码
    private int count;          // count 入住次数

    public Customer() {}

    public Customer(String id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
