package com.nsc.web.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsc.backend.service.IBookService;

@Controller
@RequestMapping("/change")
public class ChangeController {
	
	@Autowired
	private IBookService ibookservice;
	
	
	/**
	 * 畅销-换一换
	 */
 
}
