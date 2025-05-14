package operator;
//> < >= <= to check relationship (applicable for all primitive type except boolean type)
//equality check !=(not equal to) == (applicable for all primitive type including boolean)
//note:equality operator is also applicable for object reference 
//but relational operator is not applicable for object reference

public class RelationalOperator {
public static void main(String[] args) {
	//System.out.println(10>20);
	int gazalaAge= 18;
	int swetaAge =20;
	System.out.println(gazalaAge<swetaAge);
	System.out.println(gazalaAge!=swetaAge);
	System.out.println(gazalaAge<=swetaAge);
	System.out.println(gazalaAge>swetaAge);
	System.out.println(gazalaAge>=swetaAge);
	System.out.println(gazalaAge==swetaAge);
	boolean a=true;
	boolean b=false;
	//System.out.println(a>b);
	int c= 150;
	byte t=(byte)c;
	System.out.println(t);
}
}
