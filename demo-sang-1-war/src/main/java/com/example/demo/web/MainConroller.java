package com.example.demo.web;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainConroller {

    @RequestMapping("/index")
    public String index() {
		System.out.println("HELLO WORLD!- demo-sang-1-war");
		return "index";
	}
    
    @RequestMapping("/happy")
    public String happy() {
		System.out.println("HELLO WORLD!- demo-sang-1-war");
		return "happyz ";
	}
}
