package com.nsc.web.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nsc.backend.entity.Book;
import com.nsc.backend.entity.Cart;
import com.nsc.backend.entity.User;
import com.nsc.backend.service.IBookService;
import com.nsc.backend.service.ICartService;
import com.nsc.backend.service.IUserService;
import com.nsc.web.util.backstate.BackState;

/**
 * 商品加入购物车controller
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private ICartService cartServiceImpl;
	@Autowired
	private IUserService userServiceImpl;
	@Autowired
	private IBookService bookServiceImpl;
	
	@RequestMapping("test")
	public void test(){
		System.out.println("这是测试方法的");
	}
	
	/**
	 * 添加购物车信息，如果已经包含则更新购物车的信息
	 * @param openId
	 * @param bookId
	 * @param unitPrice
	 * @param count
	 */
	@RequestMapping("addToCart")//N
	@ResponseBody
	public BackState addToCart(String openId,Integer bookId,Double unitPrice,Integer count){
		/**
		 * 将用户的购物车信息保存到数据库
		 */
		//判断购物车是否有此商品
		Cart cart = cartServiceImpl.getCartByBookId(bookId,openId);
		Cart addCart = new Cart();
		if(cart==null){
			Book book = new Book();
			//User user = new User();
			//查找用户和book,为cart添加外键
			User user = userServiceImpl.findUserByopenId(openId);
			//Book book = bookServiceImpl.findBookById(bookId);
			//user.setUserOpenId(openId);
			book.setBookId(bookId);
			//设置当前时间，保存购物车
			Date parse = null;
			try {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat();
				String formate = sdf.format(date);
				parse = sdf.parse(formate);
			} catch (ParseException e) {
				System.out.println("当前日期初始化错误");
				e.printStackTrace();
			}
			addCart.setCartJoinTime(parse);
			addCart.setBook(book);
			addCart.setUser(user);
			addCart.setCartUnitPrice(unitPrice);
			addCart.setCartCount(count);
			addCart.setCartTotalUndiscount(unitPrice*count);
			//保存订单信息到数据库
			cartServiceImpl.saveCart(addCart);
			System.out.println(addCart.getCartId()+"=========================");
			
			//为小程序返回，操作状态
			BackState bs = new BackState();
			bs.setStateName("HTTP State 200");//HTTP Status 404
			return bs;
		}else{
			Date parse = null;
			try {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat();
				String formate = sdf.format(date);
				parse = sdf.parse(formate);
			} catch (ParseException e) {
				System.out.println("当前日期初始化错误");
				e.printStackTrace();
			}
			cart.setCartJoinTime(parse);
			cart.setCartCount(cart.getCartCount()+count);
			cart.setCartTotalUndiscount(cart.getCartCount()*cart.getCartUnitPrice());
			//将更新的购物车信息，在数据库进行更新
		    cartServiceImpl.updateCart(cart);
		  //为小程序返回，操作状态
			BackState bs = new BackState();
			bs.setStateId(Math.random());
			bs.setStateName("HTTP State 200");
		    return bs;
		}
		
	}
	
	@RequestMapping("cacheToCart")
	@ResponseBody
	public BackState cacheToCart(@RequestBody String para ){
		//测试json
		String testList = "{\"cartList\":[{\"bookId\":24,\"unitPrice\":52,\"count\":10},"
				+ "{\"bookId\":25,\"unitPrice\":38,\"count\":10},"
				+ "{\"bookId\":26,\"unitPrice\":39,\"count\":10}]}";
		String one = "{\"openId\":\"o_1QS0WoXqiTeHge-MzBJ1CnPOL0\",\"cartList\":[{\"bookId\":39,\"unitPrice\":2.3,\"count\":10}]}";
		JSONObject json = JSONObject.parseObject(para);
		JSONArray arr = (JSONArray) json.get("cartList");
		String openId = (String) json.get("openId");
		
		//查找用户和book,为cart添加外键
		User user = userServiceImpl.findUserByopenId(openId);
		//生成jsonArray解析为list
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.size();i++){
			JSONObject jsonObject = arr.getJSONObject(i);
			Integer bookId = jsonObject.getInteger("bookId");
			Double unitPrice = jsonObject.getDouble("unitPrice");
			Integer count = jsonObject.getInteger("count");
			//判断购物车是否有此商品
			Cart cart = cartServiceImpl.getCartByBookId(bookId,openId);
			if(cart==null){
				Cart addCart = new Cart();
				Book book = new Book();
				book.setBookId(bookId);
				//设置当前时间，保存购物车
				Date parse = null;
				try {
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat();
					String formate = sdf.format(date);
					parse = sdf.parse(formate);
				} catch (ParseException e) {
					System.out.println("当前日期初始化错误");
					e.printStackTrace();
				}
				addCart.setCartJoinTime(parse);
				addCart.setBook(book);
				addCart.setUser(user);
				addCart.setCartUnitPrice(unitPrice);
				addCart.setCartCount(count);
				addCart.setCartTotalUndiscount(unitPrice*count);
				//保存订单信息到数据库
				cartServiceImpl.saveCart(addCart);
				System.out.println(addCart.getCartId()+"=========================");
				
			}else{
				Date parse = null;
				try {
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat();
					String formate = sdf.format(date);
					parse = sdf.parse(formate);
				} catch (ParseException e) {
					System.out.println("当前日期初始化错误");
					e.printStackTrace();
				}
				cart.setCartJoinTime(parse);
				cart.setCartCount(cart.getCartCount()+count);
				cart.setCartTotalUndiscount(cart.getCartCount()*cart.getCartUnitPrice());
				//将更新的购物车信息，在数据库进行更新
			    cartServiceImpl.updateCart(cart);
			}
		}
		//为小程序返回，操作状态
		BackState bs = new BackState();
		bs.setStateName("HTTP State 200");//HTTP Status 404
		return bs ;
	}
	
	/**
	 * 删除购物车信息，根据cartId,并且将删除之后的信息，查询并且返回去
	 */
	@RequestMapping("deleteCart")
	@ResponseBody
	public BackState deleteBooks(@RequestBody String para){
		//测试数据json串
		String paralist ="{\"openId\":\"o_1QS0WoXqiTeHge-MzBJ1CnPOL0\","
				+ "\"cartList\":[{\"cartId\":17},{\"cartId\":18},{\"cartId\":19}]}";
		JSONObject json = JSONObject.parseObject(para);
		JSONArray arr = (JSONArray) json.get("cartList");
		String openId = (String) json.get("openId");
		//生成jsonArray解析为list
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.size();i++){
			JSONObject jsonObject = arr.getJSONObject(i);
			list.add(jsonObject.getInteger("cartId"));
		}
		//将list传向持久层，删除购物车信息
		cartServiceImpl.deleteCart(list);
		BackState backState = new BackState();
		backState.setStateName("HTTP State 200");
		return backState;
	}
	
	/**
	 *	根据cartId和count修改，购物车中书籍中数量 
	 * @param cartId
	 * @param count
	 */
	@RequestMapping("updateBookCount")
	@ResponseBody
	public BackState updateBookCount(Integer cartId,Integer count){
		//修改数据中cart的count,先查找出cart，进行更新
		Cart cart = cartServiceImpl.findCartByCartId(cartId);
		cart.setCartCount(count);
		cart.setCartTotalUndiscount(count*cart.getCartUnitPrice());
		cartServiceImpl.updateBookCount(cart);
		
		BackState bs = new BackState();
		bs.setStateName("HTTP State 200");
		return bs;
	}
	
	
	/**
	 * 根据用户的openId，将此用户加入到购物车的信息返回到前台
	 * @param openId
	 * @return
	 */
	@RequestMapping(value="showCart",method=RequestMethod.POST)
	public @ResponseBody List<Cart> showCart(@RequestBody String openId){
		//根据用户id将此用户的购物信息，查找出来
		JSONObject json=JSONObject.parseObject(openId);
		openId=json.getString("openId");
		System.out.println("======carts========");
		System.out.println("openId=="+openId);
		List<Cart> carts = cartServiceImpl.showCart(openId);
		for(Cart c:carts){
			System.out.println("carts===="+c.toString());
		}
		return carts ;
	}
	
	
	
	
	
	
}
