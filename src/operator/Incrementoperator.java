package operator;
//pre increment mean first increase the value then assign/place/print
//post increment mean first print/place/assign the value then increases
public class Incrementoperator {
public static void main(String[] args) {
	//Pre and post increment
	int a =10;
	//a++;
	++a;
	//System.out.println(a);
	int b=10;
	//System.out.println(b++);
	int c=10;
	c=c++ +c+c-- -c-- + c++;
	System.out.println(c);
	int d=10;
	System.out.println(++d + d++ +d - --d + d--);
	//expression evaluation left to right
	//value assignment right to left
	//int e=10++;// increment-decrement operator applicable for variables only not for constant
	final int f=10; //compile time constant
	//f--; invalid cz increment decrement operator applicable only for variables not for constant
	System.out.println(f);
	
}
}
