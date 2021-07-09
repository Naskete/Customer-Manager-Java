package com.termwork.customer.Dao;

// 返回的客房名单只要单人间和双人间就行，每个客房加个是否入住的属性就行
// 每个客房的属性有：是否入住，类型，历史入住人数
public class Room {
    private int number;
    private int type;
    private boolean status = false;

    public Room(){
        this.number = 0;
        this.type = 1;
    }

    public Room(int type){
        this.number = 0;
        this.type = type;
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
