package com.liujia.springredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class QueueController {

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 加入队伍
     * @param userId
     */
    @ResponseBody
    @GetMapping("/addQueue")
    public void addQueue(@RequestParam("userId") String userId) {
        //  redisTemplate.opsForList().leftPush("myQueue",userId);
        redisTemplate.opsForList().rightPush("yourQueue",userId);
    }


    /**
     * 队伍总人数
     */
    @ResponseBody
    @GetMapping("/queueCount")
    public String queueCount() {
        Long listSize = redisTemplate.opsForList().size("yourQueue");
        return "队伍总人数："+listSize;
    }


    /**
     * 队伍详情
     */
    @ResponseBody
    @GetMapping("/queueData")
    public String queueData() {
        List listData = redisTemplate.opsForList().range("yourQueue", 0, -1);
        return listData.toString();
    }


    /**
     * 离开队伍
     * @param userId
     */
    @ResponseBody
    @GetMapping("/leaveQueue")
    public void leaveQueue(@RequestParam("userId") String userId) {
        //移除所有  传入-1   right遍历第一个移除    1  left遍历第一个移除
        Long removeNum = redisTemplate.opsForList().remove("yourQueue", 0, userId);
        System.out.println(removeNum);
    }

    /**
     * 默认离队,先进先出
     */
    @ResponseBody
    @GetMapping("/defaultLeaveQueue")
    public void defaultLeaveQueue() {

        redisTemplate.opsForList().leftPop("yourQueue");
    }


    /**
     * 查看我自己的队列位置
     * @param userId
     */
    @ResponseBody
    @GetMapping("/getMyPosition")
    public void getMyPosition(@RequestParam("userId") String userId){
        List listData = redisTemplate.opsForList().range("yourQueue", 0, -1);
        int myPositionBeforeNum = listData.indexOf(userId);
        int myPositionNum = listData.indexOf(userId)+1;
        int size=listData.size();
        System.out.println("所在位置前面人数："+myPositionBeforeNum);
        System.out.println("所在位置："+myPositionNum);
        System.out.println("所在位置后面人数："+(size-myPositionNum));
    }


    /**
     * 野蛮插队
     * @param userId
     * @param toUserId
     */
    @ResponseBody
    @GetMapping("/savageAction")
    public void savageAction(@RequestParam("userId") String userId ,@RequestParam("toUserId") String toUserId,@RequestParam("type") String type){

        //userId 插队人
        //toUserId 被插队人
        //before 插前面
        //after 插后面
        if ("before".equals(type)){
            redisTemplate.opsForList().leftPush("yourQueue",toUserId,userId);
        }
        if ("after".equals(type)){
            redisTemplate.opsForList().rightPush("yourQueue",toUserId,userId);
        }
    }
}
