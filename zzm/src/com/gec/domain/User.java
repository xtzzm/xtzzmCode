package com.gec.domain;

public class User {
	/**
	 * id       | int(11)       | auto_increment |
| account  | varchar(32) | NO   |     | NULL    |                |
| password | varchar(32) | NO   |     | NULL    |                |
| power    | varchar(12) | NO   |     | NULL    |                |
| sex      | varchar(6)  | NO   |     | NULL    |                |
| birthday | varchar(32) | NO   |     | NULL    |                |
| register | varchar(32) | NO   |     | NULL    |                |
	 */
	private int id;
	private String account;
	private String password;
	private String power;
	private String sex;
	private String birthday;
	private String register;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", power=" + power + ", sex="
				+ sex + ", birthday=" + birthday + ", register=" + register + "]";
	}
	
	
	
}
