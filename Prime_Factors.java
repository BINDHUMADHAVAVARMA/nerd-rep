import java.util.*;
class Prime_Factors{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		n=sc.nextInt();
		for(i=2;i<=n;i++){
			int flag=0;
           		 for(j=2;j<=i/2;j++){ 										//every number is divisible by 1...start with j=2						
			   if(i%j==0)
			   {
				   flag=1;
				   break;										//if a number has no factor within half of itself ...its prime
			}  
			if(flag==0)
				System.out.println(i);
		}

	}
} 
