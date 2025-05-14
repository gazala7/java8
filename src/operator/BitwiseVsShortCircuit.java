package operator;

public class BitwiseVsShortCircuit {
public static void main(String[] args) {
	int a=10;
	int b=20;
	if(a++<b & b++<a) {
		System.out.println("inside if block");
	}
	System.out.println(a);
	System.out.println(b);
}
}
