package com.nsc.web.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import com.nsc.backend.entity.Cart;
import com.nsc.backend.entity.OrderBase;
import com.nsc.backend.entity.Store;
import com.nsc.backend.entity.User;
import com.nsc.backend.service.IAddressService;
import com.nsc.backend.service.ICartService;
import com.nsc.backend.service.IOrderBaseService;
import com.nsc.backend.service.IUserService;
import com.nsc.web.util.backstate.BackState;


@Controller
@RequestMapping("/orderBase")
public class OrderBaseController {

	@Autowired
	private IOrderBaseService orderBaseServiceImpl;
	@Autowired
	private IUserService 	userServiceImpl;
	@Autowired
	private ICartService cartServiceImpl;
	@Autowired
	private IAddressService addressServiceImpl;

	/**
	 *  @param storeList 
	 *  @param orderFreightList	订单运费
	 *  @param orderReightRiskList	订单运费险
	 *  @param openId  
	 *  @param addId  用户选择的地址
	 *  @param note	备注
	 */
	@RequestMapping("/addToOrderBase")
	@ResponseBody
	public List<BackState> addToOrderBase(@RequestBody String orderparam) {
		String param_1 ="{\"storeList\":[{\"storeId\":01},{\"storeId\":01},{\"storeId\":03}],"
				+ "\"orderFreightList\":[{\"orderFreight\":0},{\"orderFreight\":10},{\"orderFreight\":15}],"
				+"\"orderReightRiskList\":[{\"orderReightRisk\":0},{\"orderReightRisk\":3},{\"orderReightRisk\":3}],"
				+"\"noteList\":[{\"note\":0},{\"note\":3},{\"note\":3}],"
				+"\"openId\":\"o_1QS0TEoGebWrlHCxz-bzokvyj0\","
				+"\"addId\":\"83\"}";
		//1.用json把store_id解析出来
		JSONObject json = JSONObject.parseObject(orderparam);
		JSONArray arrstore = (JSONArray) json.get("storeList");//把所有选中的商品的店铺放到一个数组里
		JSONArray arrfreight = (JSONArray) json.get("orderFreightList");//
		JSONArray arrReightRisk = (JSONArray) json.get("orderReightRiskList");//
		JSONArray arrnote = (JSONArray) json.get("noteList");//
		String openId = (String) json.get("openId");
		Integer addId = (Integer) json.get("addId");
		
		User user = userServiceImpl.findUserByopenId(openId);
		Address address = addressServiceImpl.findAddressById(addId);
		
		//生成jsonArray解析为list
		List<Integer> storelist = new ArrayList<Integer>();//List用来装小程序传进来的storeId
		List<Double> freightlist = new ArrayList<Double>();//List用来装小程序传进来的storeId
		List<Double> feightRisklist = new ArrayList<Double>();//List用来装小程序传进来的storeId
		List<String> notelist = new ArrayList<String>();//List用来装小程序传进来的storeId
		List<BackState> states = new ArrayList<BackState>();
		for(int i=0;i<arrstore.size();i++) {
			JSONObject jsonObject = arrstore.getJSONObject(i);
			JSONObject jsonObject1 = arrfreight.getJSONObject(i);
			JSONObject jsonObject2 = arrReightRisk.getJSONObject(i);
			JSONObject jsonObject3 = arrnote.getJSONObject(i);
			
			Integer storeId;
			storeId = jsonObject.getInteger("storeId");
			storelist.add(storeId);
			
			Double orderFreight;
			orderFreight = jsonObject1.getDouble("orderFreight");
			freightlist.add(orderFreight);
			
			Double orderReightRisk;
			orderReightRisk = jsonObject2.getDouble("orderReightRisk");
			feightRisklist.add(orderReightRisk);
			
			String note;
			note = jsonObject3.getString("note");
			notelist.add(note);
			
			
			BackState state;
			state = orderBaseServiceImpl.saveOrderBase(storeId,orderFreight,orderReightRisk, user, address,note);
			states.add(state);
		}
		return states;
	}
	
	
	
	/**
	 * 订单详情
	 * 
	 */
	@RequestMapping("showOrderBase")
	public @ResponseBody OrderBase showOrderBase(String orderNumber) {
		OrderBase orderlist = orderBaseServiceImpl.showOrderBase(orderNumber);
		
		return orderlist;
	}
	
	
	//修改订单支付状态
	/**
	 * 0:待付款 1:已付款
	 * 2:取消订单3:退货
	 * 4:无效
	 * @param OrderState 订单支付状态
	 * @return
	 */
	@RequestMapping("/changeOrderState")
	@ResponseBody
	public void changeOrderState(Integer orderId,Integer orderState) {
		
		
		//最初订单支付状态都是0；
		
		//1:已付款
		orderBaseServiceImpl.changeOrderState(orderId,orderState);
		
		//2:取消订单
		
		//3:退货
		
		//4:无效
		
	}
	
	
	
	
	
}
