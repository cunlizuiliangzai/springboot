package com.liujia.springwebsocket.controller;

import com.liujia.springwebsocket.sotcketserver.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 客户端  服务端互相通信
 */
@RestController
public class SendMessage {

    @Autowired
    WebSocket webSocket;


    @ResponseBody
    @GetMapping("/sendTo")
    public String sendTo(@RequestParam("userId") String userId, @RequestParam("msg") String msg) throws IOException {

        webSocket.sendMessageTo(msg,userId);

        return "推送成功";
    }

    @ResponseBody
    @GetMapping("/sendAll")
    public String sendAll(@RequestParam("msg") String msg) throws IOException {

        webSocket.sendMessageAll(msg);

        return "推送成功";
    }

}
