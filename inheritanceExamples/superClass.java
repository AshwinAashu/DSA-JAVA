package inheritanceExamples;

public class superClass {
	int i, j;
	superClass(int a,int  b ){
		i = a;
		j =b;
	}
	superClass(superClass objSuper){
		i = objSuper.i;
		j = objSuper.j;
	}
	
	void showij() {
		System.out.println("the value of i and j in superclass are "+ i+" "+j);
	}
	void show() {
		System.out.println("the value of k in superclass is"  +(i+j));
	}
}
