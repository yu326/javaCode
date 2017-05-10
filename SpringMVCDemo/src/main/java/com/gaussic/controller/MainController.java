package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/2/9.
 */
@Controller
@RequestMapping("/yu")
public class MainController {

    @RequestMapping(value = "/test")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "hello")
    @ResponseBody
    public String hello() {
        String s = HttpRequest.sendGet("http://127.0.0.1:8080/solrstore/select", "q=sourceid:1&facet=off&fl=&sort=guid+desc&start=0&rows=100&indent=on");
        System.out.println(s);
        return s;
    }

    //练习用的main方法
    public static void main(String[] args) {
        //世界，你好。
        //System.out.println("hello world~~");

        //类型转化的时候，有三种可能会有精度损失的转换
        //① int 转 float     float的长度大小为-3.4E38~3.4E38之间,而int比这个大。
        int n = 1234567899;
        float f = n;
//        System.out.println(f);   //f = 1.23456792E8

//        http://blog.csdn.net/m1n_love/article/details/55224990

        //判断是否相等。       equals  判断是否相等       equalsIgnoreCase 不区分大小写
//        String s = "hehe";
//        String s1 = "heHe";
//        if(s.equalsIgnoreCase(s1)){
//            System.out.println("==");
//        }else{
//            System.out.println("!=");
//        }
        //判断字符串中是否包含某个词      indexOf()   不包含返回 -1，包含返回在字符串中第一次出现的下标   lastIndexOf   包含返回在字符串中最后一次出现的下标
//        String s = "suixin";
//        System.out.println(s.indexOf("ui"));
//        System.out.println(s.lastIndexOf("i"));
        //检查是否存在
//        String s1 = "user.text";
//        if(s1.contains(".")){
//            System.out.println("1");
//        }else{
//            System.out.println("2");
//        }
        //判断字符串自否包含某个字符   返回true或者false
//        String s = "koreyoshi";
//        Boolean res = s.contains("ke");
//        System.out.println(res);
        //字符串替换
//        String s = "koreyoshi";
//        String s1 = s.replace("kor","yyy");
//        System.out.println(s1);
        //测试是否以指定字符串开始
//        String s = "koreyoshi";
//        Boolean res = s.startsWith("kor");
//        System.out.println(res);
        //字符串截取             默认截取，从beginIndex到船尾或者是endIndex的所有代码的单位。如果endIndex>字符串的总长度 会报错。
//          String s = "koreyoshi";
//          String s1 = s.substring(1);
//          System.out.println(s1);
        //字符串大小写转换   toLowerCase  变成小写     toUpperCase  变成大写
//        String s = "KOREYOHSI";
//        String S1 = s.toLowerCase();
//        System.out.println(S1);
        //去除空格  trim
        String s = " koreyoshi   ";
        System.out.println(s);
        String s1 = s.trim();
        System.out.println(s1);
        //分割字符串
//        String s2 = "user\\text";
//        String[] fieldPath = s2.split("\\\\");
//        for (int i = 0; i < fieldPath.length; i++) {
//            System.out.println(fieldPath[i]);
//        }
//        System.out.println(fieldPath[0]);

//        String s2 = "acount=? and num =? or u=?";
//        String[] fieldPath = s2.split("and|or");
//        for (int i = 0; i < fieldPath.length; i++) {
//            System.out.println(fieldPath[i]);
//        }
//        System.out.println(fieldPath[2]);
    }
}
