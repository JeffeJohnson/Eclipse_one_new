package org.emp;

public class GreensTech {
	private void greensOmr(int age) {
		System.out.println("Age is..."+age);

	}
	private void greensOmr(int pin,String name) {
		System.out.println("Pin is..."+pin+"\tName..."+name);

	}
	private void greensOmr(long ph,String add) {
		System.out.println("Phone..."+ph+"\tAddress...."+add);

	}
	public static void main(String[] args) {
		GreensTech a = new GreensTech();
		a.greensOmr(25);
		a.greensOmr(2424, "Greens");
		a.greensOmr(89456327819l, "2/34,north street");
	}
}
