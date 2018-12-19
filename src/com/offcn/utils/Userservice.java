package com.offcn.utils;

public class Userservice {

public User login(User u) throws Exception{
	Userdao ud = new Userdao();
	return ud.login(u);
}
}
