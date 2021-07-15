package com.termwork.customer.Controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoomController {
    String tip;
    // 登录
    @PostMapping("/login")
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password){
        if(username.equals("admin")&&password.equals("123123")){
            tip = "{\"status\":200,\"message\":\"登录成功\"}";
        } else {
            tip = "{\"status\":400,\"message\":\"登录失败\"}";
        }
        return JSON.parse(tip);
    }
    // 登记入住
    @PostMapping("/checkin")
    public Object checkIn(@RequestParam("roomID") int roomID, @RequestParam("id") long id, @RequestParam("name") String name, @RequestParam("phone") String phone){

        return "";
    }

    // 客房名单
    @GetMapping("/single")
    public Object singleRoomList(){
        return  null;
    }

    @GetMapping("/twin")
    public Object twinRoomList(){
        return null;
    }

    @GetMapping("/info/room")
    public Object roomInfo(){
        return null;
    }

    @PostMapping("/addRoom")
    public Object addRoom(@RequestParam("roomID") int roomID, @RequestParam("type") int type){
        return null;
    }

    @GetMapping("/deleteRoom")
    public Object deleteRoom(@RequestParam("roomID") int roomID){
        return null;
    }

    @GetMapping("/info/customer")
    public String customerInfo(@RequestParam("id") String id){
        return null;
    }

    @PostMapping("/info/customer/delete")
    public Object deleteRecord(){
        return null;
    }

    @PostMapping("/price")
    public Object price(){
        return null;
    }
}
