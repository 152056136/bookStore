package com.nsc.web.util;

import java.util.Random;

public class OrderUtil {
	
	/**生成18位数的随机数(10+x+(8-x))
	 * 
	 * 10:时间戳
	 * x:storeId
	 * (8-x):随机数
	 */
	public static String getRandom(Integer storeId){		
		
		String orderNumber ;
		
		//时间戳
		Long timeStamp = System.currentTimeMillis() / 1000;
		
		orderNumber = "" + timeStamp + storeId ;
		
		Random random = new Random();
		for (int i = orderNumber.length()+1; i <= 18; i++) {
			orderNumber += String.valueOf(random.nextInt(10));
		}

		return orderNumber;
	}

}
