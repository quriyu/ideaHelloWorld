package com.hongkou.hyhy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 曹晓翀 on 2017/3/19.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public Object index(){
        Map returnMap  = new HashMap<String,String>();
        returnMap.put("1","一");
        returnMap.put("2","二");
        List list = new ArrayList<Integer>();
        list.add(3);
        list.add(null);
        returnMap.put("3",list);
        return returnMap;
    }

}
