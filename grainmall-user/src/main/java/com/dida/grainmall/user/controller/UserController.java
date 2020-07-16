package com.dida.grainmall.user.controller;

import com.dida.grainmall.service.UserService;
import com.dida.grainmall.bean.UmsMember;
import com.dida.grainmall.bean.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    //使用@Autowired注解方式不被倡导使用
    @Autowired
    UserService userService;

    //以下是使用final注入
    //final
    //UserService userService;

    //public UserController(UserService userService) {
        //this.userService = userService;
    //}



    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress=userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember=userService.getAllUser();
        return umsMember;
    }
}
