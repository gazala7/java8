package datatype;

public class VariableScope {
	{
		System.out.println(a);
	}
int a=10;   //scope is from line no.7 to end } that is line no. 28
{ final int a=40;  //local variable
	static int b=20;   //local variable
	System.out.println(a);   //it will print 40 because local variable precedence is more then instance variable
}
public void m1() {
	int c=30;    //local variable
	System.out.println(b);
	System.out.println(a);
	{
		System.out.println(c);
	}
	
}
public void m2(int d){
	int g;
}
{
	System.out.println(c);
	}

public static void main(String[] args) {
	
}
}
