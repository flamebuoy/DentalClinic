package com.SpringArc.dao;
import com.SprinArc.model.Login;
import com.Spring.model.User;

public interface UserDao {
	
	void register(User user);
	User validateUser(Login login);
}
