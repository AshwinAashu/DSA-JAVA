package inheritanceExamples;

public class implementationClass {
	public static void main(String args[]) {
		superClass objSuper = new superClass(10,20);
		subclassone objsubone = new subclassone(objSuper);
		
		
		
		System.out.println("Printing the value ");
		objSuper.showij();
		System.out.println("Printing the inherited values now ");
		objsubone.showij();
		objsubone.showk();
		
		
		
	}
}
