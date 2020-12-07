package com.liujia.springfilter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyTestController {

    @ResponseBody
    @RequestMapping(value="testFilter",method={RequestMethod.POST})

    public void testFilter(@RequestBody String jsonStr) {
        System.out.println("aaaaa");
        System.out.println(jsonStr);

    }

}
