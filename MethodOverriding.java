//method overriding
class a {
	void calculate(double x){
		System.out.println("square value="+(x*x));
	}
	
}
class b {
	void calculate(double x)
	{
	            System.out.println("square root="+Math.sqrt(x));
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		a obj = new a();
		obj.calculate(15);
		b obj1 = new b();
		obj1.calculate(20);
		
	}

}
