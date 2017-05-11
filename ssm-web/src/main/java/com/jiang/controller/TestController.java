package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ����һ��������
 * @author jiang
 *
 */
@Controller
@RequestMapping("/")
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		
		return "success";
	}
	
}
