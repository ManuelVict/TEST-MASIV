package com.masiv.model;
import java.io.Serializable;
public class Roulette {
	 public boolean state;
	 public int number;
	 public int id;


	 public Integer getNumber(){
		 
       return number;
	 }
	 public Boolean getState(){
		 
		 return state;
	 }
	 public Integer getId(){
		 
		 return id;
	 }
	 public void setNumber(int number){
		 this.number=number;		 
	 }
	 public void setState(boolean state){
		 this.state=state;	 
	 }
	 public void setId(int id){
		 this.id=id;
	  
	 }

}
