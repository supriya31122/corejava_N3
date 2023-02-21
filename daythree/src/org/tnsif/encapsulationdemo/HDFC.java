package org.tnsif.encapsulationdemo;

public class HDFC {

	
		// TODO Auto-generated method stub
	private int pin;
	void accept() {
		System.out.println("The ATM pin is: "+pin);
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
