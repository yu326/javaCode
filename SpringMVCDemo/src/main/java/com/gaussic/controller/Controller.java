package com.gaussic.controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/9.
 */
@org.springframework.stereotype.Controller
@RequestMapping("bxt")
public class Controller {

    @RequestMapping(value = "jxq")
    public String index() {
        return "index";

    }
//    @RequestMapping(value = "hello")
//    @ResponseBody
//    public String hello() {
//        String s=HttpRequest.sendGet("http://127.0.0.1:8080/solrstore/select", "q=sourceid:1&facet=off&fl=&sort=guid+desc&start=0&rows=100&indent=on");
//        System.out.println(s);
//        return s;
//    }
}