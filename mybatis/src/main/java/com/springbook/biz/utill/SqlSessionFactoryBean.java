package com.springbook.biz.utill;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
	private static SqlSessionFactory s =  null;
	
	static {
		try {
			if(s==null) {
				Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
				s = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static SqlSession getSqlSessiongInstance() {
		return s.openSession();
	}
}
