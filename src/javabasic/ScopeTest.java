package javabasic;



import datatype.PrimitiveDataType;

public class ScopeTest extends PrimitiveDataType{
public static void main(String[] args) {
	PrimitiveDataType dt = new PrimitiveDataType();
    ScopeTest st=new ScopeTest();
    System.out.println(st.b);
	System.out.println(dt.a);
	System.out.println(dt.b);
	System.out.println(dt.c);
	System.out.println(dt.d);
	
}
}
