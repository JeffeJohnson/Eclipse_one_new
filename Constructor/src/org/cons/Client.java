package org.cons;

public class Client {
	
	public Client() {
		System.out.println("Default Constructor");
	}
	public Client(int id) {
		System.out.println("ID..."+id);
	}
	public Client(String name) {
		System.out.println("NAME..."+name);
	}
	public Client(long phno) {
		System.out.println("PHONE ...."+phno);
	}
	
	
	public static void main(String[] args) {
		Client a = new Client();
		Client a1 = new Client(212);
		Client a2 = new Client("jeffe");
		Client a3= new Client(78289999276l);
		
		
		
	}
	

}
