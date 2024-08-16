
public class Desktop implements Hardware,Software {
	
	private void desktopModel() {
		System.out.println("DELL");

	}

	@Override
	public void softwareResource() {
		System.out.println("System Software");
		
	}

	@Override
	public void hardwareResource() {
		System.out.println("I/O Port");
		
	}
	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.desktopModel();
		a.hardwareResource();
		a.softwareResource();
	}

}
