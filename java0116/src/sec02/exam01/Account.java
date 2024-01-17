package sec02.exam01;

import java.io.Serializable;

public class Account implements Serializable{
	private String name;
	private String id;
	private int password;
	private String tel;
	private String birth;
	private int balance = 0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", password=" + password + ", tel=" + tel + ", birth=" + birth
				+ ", balance=" + balance + "]";
	}
	public Account() {
		
	}
	
	public Account(String name, String id, int password, String tel, String birth, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.birth = birth;
		this.balance = balance;
	}
	
	public int deposit(int deposit) {
		if(deposit <= 0) {
			System.out.println("잘못된 금액을 입력하셨습니다.");
		}
		return balance += deposit; 
	}
	public int withdraw(int withdraw) {
		if(balance < withdraw) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -= withdraw;
		}
		return balance;
	}
	public int check() {
		return balance;
	}
	
}
