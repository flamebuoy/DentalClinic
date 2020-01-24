package com.SpringArc.model;

public class User {
@NotNull
@NotEmpty
private String firstname;
@NotNull
@NotEmpty
private String lastname;
@ValidEmail
@NotNull
@NotEmpty
private String email;
@DateTimeFormat(pattern="MM/dd/yyyy")
@NotNull @Past
private Date birthdate;
@NotNull
@NotEmpty
private String bloodgroup;
@NotNull
@NotEmpty
private String address;
@NotNull
@NotEmpty
@Phone
private int phone;
@NotNull
@NotEmpty
private String username;
@NotNull
@NotEmpty
private String password;

public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public Date getBirthdate() {
return birthday;
}
public void setBirthdate(Date birthday) {
this.birthdate = birthdate;
}
public String getBloodgroup() {
return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
this.bloodgroup = bloodgroup;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public int getPhone() {
return phone;
}
public void setPhone(int phone) {
this.phone = phone;
}
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
}
