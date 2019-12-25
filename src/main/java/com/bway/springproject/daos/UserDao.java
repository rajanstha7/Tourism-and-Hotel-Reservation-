package com.bway.springproject.daos;

import com.bway.springproject.models.User;

public interface UserDao {
	
	public void signup(User u);
	public boolean login(String un,String psw);

}
