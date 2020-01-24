package com.SpringArc.model;

public class Login {
@NotEmpty
private String username;
@NotNull
@Size(min = 6, max = 15)
private String password;
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}




/**********************************8
 * 
 */
private final Map<String,Stirng> activeUesr =  new HahsMap();
private final Map<String,Stirng> activeAdmin =  new HahsMap();
public login(User user) {
	String firstNAme =  user.getFirstname();
	String passwaord =  user.getPassWord();
	if(activeUser.contains(username)) {
		//USER
		if(activeSession.contains(firstNAme)) {
			// send him the login page
			//new ModelAndView(“login”);
		}else {
			// get the user from Database trough DAO
			//save it in activeSession map
			
			//If not present in Database thorw errorPage
			//new ModelAndView(“error”);
			
		}
	}
	else {
		//admin
		if(activeSession.contains(firstNAme)) {
			// send him the login page
			//new ModelAndView(“login”);
		}else {
			// get the user from Database trough DAO
			//save it in activeSession map
			
			//If not present in Database thorw errorPage
			//new ModelAndView(“error”);
			
		}
	}eles{
		throw
	}
}

}
