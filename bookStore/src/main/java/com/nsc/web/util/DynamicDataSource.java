package com.nsc.web.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.nsc.web.DynamicDataSourceHolder;

/**
 * 
 *用来获取自定义获取数据源的标识
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
        // 从自定义的位置获取数据源标识
        return DynamicDataSourceHolder.getDataSource();
	}

	
	

}
