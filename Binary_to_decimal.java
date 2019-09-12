import java.util.*;
class Binary_to_decimal{
	public static void main(String asdc[]){
		Scanner sc=new Scanner(System.in);
		int a,i=0,r=0,count0=0,count1=0;
		double sum=0;
		a=sc.nextInt();
		while(a>0)
		{
			r=a%10;
			if(r==1){count1++;}
			if(r==0){count0++;}
			sum=sum+(r*Math.pow(2,i));
			i++;
			a=a/10;
		}
		if(count0==count1){System.out.print(sum);}
		else if(count0!=count1){System.out.print("zeroes="+count0 +"  ones= "+count1);}
	}
}