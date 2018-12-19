package com.offcn.utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
public class Userdao {
	public User login(User u) throws Exception {
		QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
	
return queryRunner.query("select * from user where username=? and password=?",new BeanHandler<User>(User.class), u.getUsername(), u.getPassword());
	}
	

}
