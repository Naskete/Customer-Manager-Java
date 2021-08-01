package com.termwork.customer.Controller;

import com.termwork.customer.DTO.ResultJson;
import com.termwork.customer.Service.CustomerService;
import com.termwork.customer.Service.ManagerService;
import com.termwork.customer.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class RoomController {
    // TODO 优化返回值
    // TODO 异常处理

    @Autowired
    private RoomService roomService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ManagerService managerService;

    // 登录
    @PostMapping("/login")
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password){
        if(username.equals("admin")&&password.equals("123123"))
            return new ResultJson(200, "登录成功");
        return new ResultJson(400,"登录失败");
    }

    // TODO 登记入住
    @PostMapping("/checkin")
    public Object checkIn(@RequestParam("roomID") int roomID, @RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone){
        if(managerService.checkIn(roomID, id, name, phone))
            return new ResultJson(200, "登记成功");
        return new ResultJson(400, "登记失败");
    }

    // 客房名单
    // 单人间
    @GetMapping("/single")
    public Object singleRoomList(){
        return  roomService.getSingleRoom();
    }

    // 双人间
    @GetMapping("/twin")
    public Object twinRoomList(){
        return roomService.getTwinRoom();
    }

    // 房间信息
    @PostMapping("/info/room")
    public Object roomInfo(@RequestParam("roomID") int roomId){
        return roomService.getRoomInfo(roomId);
    }

    // TODO 替换房间信息中的0/1改为单双人间？

    // 添加房间
    @PostMapping("/addRoom")
    public Object addRoom(@RequestParam("roomID") int roomID, @RequestParam("type") int type, @RequestParam("price") double price){
        if(roomService.addRoom(roomID,type,price)){
            return new ResultJson(200, "添加成功");
        } else {
            return new ResultJson(400, "添加失败");
        }
    }

    // 删除房间
    @PostMapping("/deleteRoom")
    public Object deleteRoom(@RequestParam("roomID") int roomID){
        if(roomService.deleteRoom(roomID))
            return new ResultJson(200,"删除成功");
        return new ResultJson(400,"删除失败");
    }

    // TODO 获取旅客信息
    @PostMapping("/info/customer")
    public Object customerInfo(@RequestParam("id") String id){
        return customerService.getCustomerInfo(id);
    }

    // TODO 删除旅客
    @PostMapping("/deleteCustomer")
    public Object deleteRecord(@RequestParam("id") String id){
        if(customerService.deleteCustomer(id))
            return new ResultJson(200, "删除成功");
        return new ResultJson(400, "删除失败");
    }

    @PostMapping("/price")
    public Object price(@RequestParam("roomID") int roomId){
        double price = managerService.price(roomId);
        return new ResultJson(200, "success", price);
    }

    @PostMapping("/checkOut")
    public Object checkOut(){
        managerService.checkOut();
        return new ResultJson(200, "checkout");
    }
}
