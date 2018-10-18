package com.nsc.web.contorller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nsc.backend.entity.Address;
import com.nsc.backend.entity.User;
import com.nsc.backend.service.IAddressService;
import com.nsc.backend.service.IUserService;
import com.nsc.web.util.backstate.BackState;

//管理用户收货地址
@Controller
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private IAddressService addressServiceImpl;
	@Autowired
	private IUserService userServiceImpl;
	
		//接受微信授权地址，并且如果能够接受到的话，设为默认地址
		@RequestMapping("saveWeiAdd")//Y-get
		@ResponseBody
		public BackState  addWeiAdd(String openId,String userName,String postalCode,String provinceName,String cityName
				,String countyName,String detailInfo,String nationalCode,String telNumber){
				
				User user = userServiceImpl.findUserByopenId(openId);
				System.out.println("user======================"+user);
				Address add = new Address();
				add.setAddUserName(userName);
				add.setAddPostalCode(postalCode);
				add.setAddProvince(provinceName);
				add.setAddCity(cityName);
				add.setAddCounty(countyName);
				add.setAddDetailInfo(detailInfo);
				add.setAddNationalCode(nationalCode);
				add.setAddTele(telNumber);
				add.setAddDefault(true);
				add.setUser(user);
			    System.out.println("add====================="+add);
				addressServiceImpl.saveWeiAdd(add);
				//返回状态码
				BackState bs = new BackState();
				bs.setStateName("HTTP State 200");
				return bs;
				
		}
		
		//接受微信授权地址，并且如果能够接受到的话，设为默认地址
		@RequestMapping("addAddress")//Y-post
		@ResponseBody
		public BackState  addAddress(@RequestBody String para){
			    System.out.println("para============"+para);
				JSONObject json = JSONObject.parseObject(para);
				String openId = (String) json.get("openId");
				String userName = (String) json.get("userName");
				String postalCode = (String) json.get("postalCode");
				String provinceName = (String) json.get("provinceName");
				String cityName = (String) json.get("cityName");
				String countyName = (String) json.get("countyName");
				String detailInfo = (String) json.get("detailInfo");
				String nationalCode = (String) json.get("nationalCode");
				String telNumber = (String) json.get("telNumber");
				
				User user = userServiceImpl.findUserByopenId(openId);
				Address add = new Address();
				add.setAddUserName(userName);
				add.setAddPostalCode(postalCode);
				add.setAddProvince(provinceName);
				add.setAddCity(cityName);
				add.setAddCounty(countyName);
				add.setAddDetailInfo(detailInfo);
				add.setAddNationalCode(nationalCode);
				add.setAddTele(telNumber);
				add.setAddDefault(true);
				add.setUser(user);
				
				//保存之前，先将其他的地址设置为0
				List<Address> list = addressServiceImpl.findAllAddress(user.getUserId());
				if(list!=null){
					Iterator<Address> it = list.iterator();
					while(it.hasNext()){
						Address add1 = it.next();
						if(add1.getAddDefault()){
							add1.setAddDefault(false);
							addressServiceImpl.updateAddress(add1);
						}
					}
				}
				addressServiceImpl.saveWeiAdd(add);
				//返回状态码
				BackState bs = new BackState();
				bs.setStateName("HTTP State 200");
				return bs;
		}
		
		//展示用户的所有收货地址
		@RequestMapping("showAddress")//Y-post
		@ResponseBody
		public List<Address> showAddress( @RequestBody String openId){
			System.out.println("Start"+openId+"End");
			JSONObject json = JSONObject.parseObject(openId);
			System.out.println("json="+json);
			String id = (String) json.get("openId");
			System.out.println("id="+id);
			User userByopenId = userServiceImpl.findUserByopenId(id);
			List<Address> list = addressServiceImpl.findAllAddress(userByopenId.getUserId());
			System.out.println("showAddress success");
			return list;
		}
		
		//修改用户的默认地址
		@RequestMapping("modifyDeAdd")
		@ResponseBody
		public BackState  modifyDeAdd(String openId,Integer addId){
			System.out.println("openId="+openId+" addId="+addId);
			//将所有的收货地址查出来，原来默认的为false，新的为true
			User userByopenId = userServiceImpl.findUserByopenId(openId);
			System.out.println("userByopenId="+userByopenId);
			List<Address> list = addressServiceImpl.findAllAddress(userByopenId.getUserId());
			Iterator<Address> it = list.iterator();
			while(it.hasNext()){
				Address add = it.next();
				if(add.getAddDefault()){
					add.setAddDefault(false);
					addressServiceImpl.updateAddress(add);
				}
				if(add.getAddId()==addId){
					add.setAddDefault(true);
					addressServiceImpl.updateAddress(add);
				}
			}
			//返回状态码
			BackState bs = new BackState();
			bs.setStateName("HTTP State 200");
			return bs;
		}
		
		//加载用户的默认地址
		@RequestMapping("showDeAddress")//Y-post
		@ResponseBody
		public Address findDeAddress(@RequestBody String openId){
			JSONObject json = JSONObject.parseObject(openId);
			String id = (String) json.get("openId");
			User user = userServiceImpl.findUserByopenId(id);
			Address address = addressServiceImpl.findDefaultAdd(user.getUserId());
			System.out.println("findDeAddress is seccess");
			return address;
		}
	
	
}
