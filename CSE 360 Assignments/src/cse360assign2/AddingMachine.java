package cse360assign2;

public class AddingMachine {

	private int total ; 
	private String temp ; 
	
	public AddingMachine() {
		total = 0 ; //not needed - included for clarity 
		temp = "0" ; 
	}
	
	public int getTotal() {
		return total ; 
	}
	
	public void add(int value) {
		temp += " + " + Integer.toString(value) ; 
		total = total + value ; 
	}
	
	public void subtract(int value) {
		temp += " - " + Integer.toString(value) ; 
		total = total - value ; 
	}
	
	public String toString() {
		return temp ; 
	}
	
	public void clear() {
		total = 0 ; 
		temp = "" ; 
	}
	
}
