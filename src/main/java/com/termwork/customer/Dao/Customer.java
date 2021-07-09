package com.termwork.customer.Dao;

public class Customer {
    private int id;
    private String name;
    private int count;
    private Record record;

    public Customer() {}

    public Customer(int id, String name, int count, Record record) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.record = record;
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

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
