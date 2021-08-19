package com.termwork.customer.DTO;

import com.alibaba.fastjson.annotation.JSONField;
import com.termwork.customer.Dao.Record;

import java.util.List;

public class CustomerInfo {
    @JSONField(name = "id")
    private String id;          // id 身份证号

    @JSONField(name = "name")
    private String name;        // name 姓名

    @JSONField(name="phone")
    private String phone;       // phone 电话号码

    @JSONField(name="count")
    private int count;          // count 入住次数

    @JSONField(name="records")
    private List<Record> records;   // recodes 入住

    public CustomerInfo(){}

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

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
