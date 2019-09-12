import java.util.*;
class Binary_to_Octal{
	public static void main(String asdc[]){
		Scanner sc=new Scanner(System.in);
		int a,i=0,r=0,n;
		double sum=0,sumo=0;
		n=sc.nextInt();
		a=n;
		while(a>0)
		{
			r=a%10;
			sum=sum+(r*Math.pow(2,i));
			i++;
			a=a/10;
		}
		int sum1=(int)sum;
		i=0;
		
		while((sum1/8)>0){
			r=sum1%8;
			sumo=sumo+(r*Math.pow(10,i));
			sum1=sum1/8;
			i++;
		}
		sumo=sumo+(sum1*Math.pow(10,i));
		int sumo1=(int)sumo;
		
		System.out.print(sumo1);
	}
}