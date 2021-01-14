package week3.day2;
//Interface
public class Desktop implements HardWare,SoftWare{
	
	public void desktopModel() {
		System.out.println("Desktop Model");

	}

	public void softwareResources() {
		System.out.println("SoftwareResources from Software Interface");
		
	}

	public void hardwareResources() {
		System.out.println("HardWare Resources from Hardware Interface");
		
	}
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopModel();
		obj.softwareResources();
		obj.hardwareResources();
	}
	

}
