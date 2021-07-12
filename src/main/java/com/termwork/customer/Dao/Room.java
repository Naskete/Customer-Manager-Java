package com.termwork.customer.Dao;

public class Room {
    private int id;                 // id 客房号
    private int number;             // number 历史入住人数
    private int type;               // type 类型
    private boolean status = false; // status 是否入住，默认未入住

    public Room(){
        this.number = 0;
        this.type = 1;
    }

    public Room(int type){
        this.number = 0;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void addNumber() {
        this.number++;
    }

    public int getType() {
        return type;
    }

    public boolean getStatus() {
        return status;
    }

    public void changeStatus() {
        this.status = !this.status;
    }
}
