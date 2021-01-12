package com.masiv.test.model;
public class Bet {
	public int amount;
	public int id;
	public int numberBet;
	public boolean type;
	public int getAmount() {
		
		return amount;
	}
	public int getId() {
		
		return id;
	}
	public int getNumberBet() {
		
		return numberBet;
	}
	public boolean isType() {
		
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumberBet(int numberBet) {
		this.numberBet = numberBet;
	}
	

}
