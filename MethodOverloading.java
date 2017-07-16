// Method Overloading
class Sum{
	void add(int a, int b){
		System.out.println("Sum of two = " + (a + b));;
	}
	void add(int a , int b,int c){
		System.out.println("Sum of three = " + (a + b + c));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Sum a = new Sum();
		a.add(10, 20);

		a.add(10, 90, 100);
	}

}
