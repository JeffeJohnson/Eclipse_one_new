package org.bike;


public class Ktm implements Bike {
	@Override
	public void cost() {
		System.out.println("2 Lakh");

	}
	@Override
	public void speed() {
		System.out.println("100 km");

	}
	public static void main(String[] args) {
		Ktm a = new Ktm();
		a.cost();
		a.speed();
	}

}
