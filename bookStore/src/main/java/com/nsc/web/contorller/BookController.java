package com.nsc.web.contorller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nsc.backend.entity.Address;
import com.nsc.backend.entity.Book;
import com.nsc.backend.entity.Order;
import com.nsc.backend.entity.OrderItem;
import com.nsc.backend.entity.User;
import com.nsc.backend.service.IAddressService;
import com.nsc.backend.service.IBookService;
import com.nsc.backend.service.IOrderService;
import com.nsc.backend.service.IUserService;
import com.nsc.web.util.backstate.BackState;
import com.nsc.web.util.page.PageBean;

/**
 * 微信小程序书籍操作类
 * @author Lenovo
 */
@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService bookServiceImpl;
	@Autowired
	private IUserService	userServiceImpl;
	@Autowired
	private IOrderService 	orderServiceImpl;
	@Autowired
	private IAddressService addressService; 
	
	//点击二级分类，图书信息显示，使用分页	
	@RequestMapping("bySecondCateId")//Y-get
	public @ResponseBody PageBean  findBooksBySecondCaeId(Integer secondCateId,Integer currentPageNum){
		//根据传递的二级分类id，分页查找相应的书籍
	 	PageBean<Book> pageBean = bookServiceImpl.findBooksBySecondCaeId(secondCateId,currentPageNum);
		return pageBean;
	}
	
	@RequestMapping("bySecondCateIdName")//N
	public @ResponseBody PageBean  findBooksBySecondCaeId_Name(Integer secondCateId,String secondCateName,Integer currentPageNum){
		//根据传递的二级分类id，分页查找相应的书籍
	 	PageBean<Book> pageBean = bookServiceImpl.findBooksBySecondCaeId_Name(secondCateId,secondCateName,currentPageNum);	 	
		return pageBean;	
	}
	
	/**
	 * 直接购买某一本书
	 * @param openId
	 * @param bookId
	 * @param count
	 */
	@RequestMapping("addBookToOrder")//
	@ResponseBody 
	public BackState addBookToOrder( @RequestBody String para){
		JSONObject json = JSONObject.parseObject(para);
		String openId = (String) json.get("openId");
		Integer addId = (Integer) json.get("addId");
		Integer count = (Integer) json.get("count");
		Integer bookId = (Integer) json.get("bookId");
		//根据userOpenId查找出用户user_id
		User user = userServiceImpl.findUserByopenId(openId);
		Book book = bookServiceImpl.findBookById(bookId);
		Address add = addressService.findAddressById(addId);
		//生成订单，保存
		Order order = new Order();
		BackState state = new BackState();
		//设置当前时间，保存订单
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
		//订单和订单项,在订单类中得到订单项，然后保存到数据库
		order.setOrderTime(parse);
		order.setOrderState(1);
		order.setOrderTotalUndiscount(book.getBookUnitPrice()*count);
		order.setUser(user);
		order.setAddress(add);
		//将订单关联订单项，保存到数据库,并且将order主键返回
		orderServiceImpl.saveOrder(order);
		OrderItem oit = new OrderItem();
		oit.setBook(book);
		oit.setOitemSubtotal(book.getBookUnitPrice()*count);
		oit.setOitemUnitPrice(book.getBookUnitPrice());
		oit.setOitemCount(count);
		oit.setOrder(order);
		oit.setDistributor(book.getDistributor());
		orderServiceImpl.saveOrderItem(oit);
		if(oit.getOitemId()!=null){
			state.setStateName("HTTP Status 200");
			return  state;
		}
		state.setStateName("HTTP Status 500");
		return state;
	}
	
	
}
