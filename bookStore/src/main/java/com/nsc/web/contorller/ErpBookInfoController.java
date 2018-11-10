package com.nsc.web.contorller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsc.backend.entity.Book;
import com.nsc.backend.entity.ErpBookInfo;
import com.nsc.backend.service.IErpBookInfoService;


@Controller
@RequestMapping("/ErpBookInfoController")
public class ErpBookInfoController {
	 @Autowired
	private IErpBookInfoService iebis;
	
	 @RequestMapping(value="/selData")
	 @ResponseBody
	 public void selData(){
		 //List<Map<String, Object>> baseList=null;
		 /*List<Object> baseList=null;*/
		 /*HashMap<String, Object> baseList=new HashMap<String, Object>();*/
		/*	String num;
			Date date=new Date();*/
	
			 
			 List<ErpBookInfo> bookList = new ArrayList<ErpBookInfo>();
			 bookList= iebis.selData();	
			
//			 for(int i=0;i<baseList.size();i++){  
//				 Map<String,Object> map = baseList.get(i);
				 
//				 num=501+i+"";
//				 
//				 map.put("book_id", num);
//				 map.put("title", "【人民出版社】特价 赢在专注：从简单到极致的36技 10071148:200905;10071147:9787506034678;10071150:东方出版社");
//				 map.put("props_name", "hh");
//				 map.put("version", "1");
//				 map.put("pic_url", "http://img10.360buyimg.com/n1/jfs/t2305/263/763174789/133819/40ca5b9d/5627043aNcc2a643b.jpg");
//				 map.put("author", num);
//				 map.put("print_date", date.toString());
//				 map.put("print_house", num);
				 /*System.out.println(map.get("book_id")+" "+map.get("title")+" "+map.get("props_name")+" "
				                 +map.get("version")+" "+map.get("pic_url")+" "
				                   +map.get("author")+" "+map.get("print_date")+" "
				                   +map.get("print_house")+" "+map.get("frame"));*/
				
				 //System.out.println(map);

				 /*Set<String> keys=map.keySet();
				 Iterator<String> iter=keys.iterator();
				 while(iter.hasNext()){
					 String str=iter.next();
					 System.out.print(str);
				 }*/
			 System.out.println(bookList);
			 	iebis.insert(bookList);
			 
	 }
	 
	 
	 
/*	 @RequestMapping(value="/selDatar")
	 @ResponseBody
	 public void selData2(){
		Map<String, Object> map=null;
	
		map= iebis.selData2();
		
				 System.out.println(map.get("title")+" "+map.get("props_name")+" "
				                 +map.get("version")+" "+map.get("pic_url")+" "
				                   +map.get("author")+" "+map.get("print_date")+" "
				                   +map.get("print_house")+" "+map.get("frame"));
			 	
			 iebis.insert2(map);
	 }*/
	 
	 
	 
	 

	 

}
