import java.util.*;
class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		n=sc.nextInt();
		for(i=2;i<=n;i++){
            for(j=1;j<=i;j++){ 
			   if(i%j==0){if(n%i==0){n=n/i;System.out.print(i +" ");}}

			}   	
		}

	}
} 