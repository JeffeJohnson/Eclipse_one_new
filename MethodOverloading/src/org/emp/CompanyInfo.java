package org.emp;

public class CompanyInfo {
	private void companyName(String name,int id) {
		System.out.println("Name is...."+name+"\nId is...."+id);

	}
	private void companyName(float pf,long ph) {
		System.out.println("PF is..."+pf+"\nPhone is..."+ph);

	}
	public static void main(String[] args) {
		CompanyInfo a = new CompanyInfo();
		a.companyName("Greens", 25);
		a.companyName(34233.56f,8734522617l );
	}

}
