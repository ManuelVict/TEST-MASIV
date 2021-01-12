package com.masiv.test.model;
import java.util.ArrayList;
public class Roulette {
	 public boolean state;
	 public int number;
	 public int id;
	 public ArrayList<Bet>rouletteBet=new ArrayList<Bet>();
	 public Integer getNumber(){
		 
       return number;
	 }
	 public Boolean getState(){
		 
		 return state;
	 }
	 public Integer getId(){
		 
		 return id;
	 }
	 public ArrayList<Bet> getRouletteBet() {
		 
		return rouletteBet;
	}
	public void setRouletteBet(ArrayList<Bet> rouletteBet) {
		this.rouletteBet = rouletteBet;
	}
	public void setNumber(){
		 this.number= (int)(Math.random()*36);	 
	 }
	 public void setState(boolean state){
		 this.state=state;	 
	 }
	 public void setId(int id){
		 this.id=id;	
	 }
	

}
