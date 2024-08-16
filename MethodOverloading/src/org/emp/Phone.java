package org.emp;

public class Phone {
	private void phoneInfo(String model,long num) {
		System.out.println("Model..."+model+"\tNumber..."+num);

	}
	private void phoneInfo(long num,String model) {
		System.out.println("Number..."+num+"\tModel..."+model);

	}
	public static void main(String[] args) {
		Phone a = new Phone();
		a.phoneInfo("oneplus", 8932281819l);
		a.phoneInfo( 8932281819l, "oneplus");
	}


}
