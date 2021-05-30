package inheritanceExamples;

public class subclassone extends superClass {
	int k, a ,b;
	subclassone(superClass objSuper){
		super( objSuper);
		  a  = objSuper.i +10; //increments the value of i and j in the superclass by 10 each 
		  b = objSuper.j +10;
		 k = a+b;
		 
	}
	void showk(){
		super.show();
		System.out.println("the value of k in subclass is"+ k );
	}
	void showij() {
		
		System.out.println("the value of i and j  in sub class" + a +" "+ b);
	}
	
}
