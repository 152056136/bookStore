package com.nsc.web.contorller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nsc.backend.entity.User;
import com.nsc.backend.service.IUserService;
import com.nsc.web.util.CommonUtil;

import net.sf.json.JSONObject;

/**
 * 获取微信用户信息
 * @author Lenovo
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService userServiceImpl;
	
	//获取微信用户的信息
	@RequestMapping("login")
	public void login(HttpServletResponse response,HttpServletRequest request,String appid,String appsecret,String code)
		throws IOException{
		System.out.println(appid+"=="+appsecret+"=="+code);
		
		String requestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+appsecret+"&js_code="+code+"&grant_type=authorization_code";
		//requestUrl.replaceAll("APPID", appid).replaceAll("SECRET", appsecret).replaceAll("JSCODE", code);
		JSONObject httpsRequest = CommonUtil.httpsRequest(requestUrl, "GET", null);
		String json = httpsRequest.toString();
		String openid = (String) httpsRequest.get("openid");
		String sekey  = (String) httpsRequest.get("session_key");
		System.out.println("这是用户信息"+openid+"===="+sekey);
		
		//现根据openid查找下，用户是否已经存在了
		User userByopenId = userServiceImpl.findUserByopenId(openid);
		if(userByopenId==null){
			User user = new User();
			user.setUserOpenId(openid);
			user.setUserNickName("Tom");
			//将用户的openId保存到数据库
			userServiceImpl.saveUser(user);
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); // 转码
		PrintWriter out = response.getWriter();
		System.out.println(json);
		//String one="{\"session_key\":\"5r9TVfOwFjdXhEj5CeDREA==\",\"expires_in\":7200,\"openid\":\"o_1QS0WoXqiTeHge-MzBJ1CnPOL0\"}";
		out.println(json);
		
	}
	
	/**
	 * 添加用户信息，字段待确定
	 */
	
	
	
	
	
	
	
	
	
	
	
}
