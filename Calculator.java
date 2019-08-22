import java.util.*;
class Calculator{
	public static void main(String args[]){
		float a,b,c,d;
		System.out.println("\n          CALCULATOR\n          ^^^^^^^^^^\n1)addition\n2)subtraction\n3)multiplication\n4)division");
		System.out.print("give the option:");
		Scanner sc=new Scanner(System.in);
		d=sc.nextFloat();
		System.out.print("give the numbers:");
		a=sc.nextFloat();
		b=sc.nextFloat();
	if(d==1){	
		c=a+b;
		System.out.print("the sum of "+a);
		System.out.print(" and "+b);
		System.out.println(" is "+c);}
	if(d==2){
		c=a-b;
	    System.out.print("the difference of "+a);
	    System.out.print(" and "+b);
	    System.out.println(" is "+c);
	}	
	if(d==3){
		c=a*b;
		System.out.print("the product of "+a);
		System.out.print(" and "+b);
		System.out.println(" is "+c);
	}
    if(d==4){
    	c=a/b;
    	System.out.print("the answer obtained on dividing "+a);
    	System.out.print(" and "+b);
    	System.out.println(" is "+c);
    }
}
}