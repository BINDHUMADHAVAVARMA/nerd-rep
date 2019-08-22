import java.util.*;
class Agecalculator{
	public static void main(String as[]){
		Scanner sc=new Scanner(System.in);
		int py,pm,pd,by,bm,bd,y,m,d;
		System.out.print("\n\ngive the present date,month,year :");
		pd=sc.nextInt();
		pm=sc.nextInt();
		py=sc.nextInt();
		System.out.print("give the birth date,month,year :");
		bd=sc.nextInt();
		bm=sc.nextInt();
		by=sc.nextInt();
		if(bd>pd)
			{pm=pm-1;
			pd=pd+30;}
	    if(bm>pm)
	    	{py=py-1;
	    		pm=pm+12;}
	    		System.out.print("your age is "+(py-by) +"years"+(pm-bm) +"months");
	    		System.out.print((pd-bd) +"days \n\n");

}}