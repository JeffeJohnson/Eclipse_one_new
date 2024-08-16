package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("South");
	}
	private void northIndia() {
		System.out.println("North");

	}
	public static void main(String[] args) {
		StateDetails a = new StateDetails();
		a.southIndia();
		a.northIndia();
		
		LanuageInfo b = new LanuageInfo();
		b.tamilLanguage();
		b.englishLanguage();
		b.hindiLanuage();
		
	}
}
