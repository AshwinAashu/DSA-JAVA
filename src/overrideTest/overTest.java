package overrideTest;

public class overTest {
	public static void main(String args[]) {
		int i = 10;
		overTest ob = new overTest();
		ob.test1();
		ob.test1(i);
	}
	void test1() {
		System.out.println("this is the first function");
	}
	void test1(int item) {
		System.out.println("item value is"+ item);
	}
}