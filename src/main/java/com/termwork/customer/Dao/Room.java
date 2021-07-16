package com.termwork.customer.Dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    private int roomId;             // roomId 客房号
    private int number;             // number 历史入住人数
    private int type;               // type 类型
    private double price;           // price 价格 ？/天
    private boolean status = false; // status 是否入住，默认未入住

    public Room(){
        this.number = 0;
        this.type = 1;
        this.price = 40.0;
    }

    public Room(int type){
        this.number = 0;
        this.type = type;
    }

    public Room(int roomId, int type, double price) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.number = 0;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
