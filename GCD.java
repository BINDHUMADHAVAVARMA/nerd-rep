import java.util.*;
class GCD{
	public static void main(String zashv[]){
		Scanner sc=new Scanner(System.in);
		int n[],i,j=0,n1[],n2[],c[],l,m;
		n=new int[2];
		n[0]=sc.nextInt();
		n[1]=sc.nextInt();
		n1=new int[30];
        for(i=1;i<=n[0];i++){
        	if(n[0]%i==0){n1[j]=i;j++;}
        }
        int k=0;
        n2=new int[30];
        for(i=1;i<=n[1];i++){
        	if(n[1]%i==0){n2[k]=i;k++;}
        }
        c=new int[30];
        int a=0;
        for(i=0;i<j;i++){
        	for(l=0;l<k;l++){
        		if(n1[i]==n2[l]){c[a]=n1[i];a++;}
        	}
        }
        m=c[0];
        for(i=0;i<a;i++){
        	if(m<c[i]){m=c[i];}
        }
       System.out.print("GCD is "+m);



	}
}