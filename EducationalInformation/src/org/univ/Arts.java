package org.univ;

public class Arts extends University{
	private void bsc() {
		System.out.println("BSC");
	}
	private void bed() {
		System.out.println("BED");

	}
	private void bba() {
		System.out.println("BBA");

	}
	@Override
	public void ug() {
		System.out.println("##UG");

	}
	public void pg() {
		System.out.println("##PG");

	}
	public static void main(String[] args) {
		Arts a= new Arts();
		a.bba();
		a.bed();
		a.bsc();
		a.ug();
		a.pg();
	}

}
