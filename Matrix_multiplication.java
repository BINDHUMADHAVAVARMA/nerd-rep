import java.util.*;
class Matrix_multiplication{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int a[][],b[][],c[][],i,j,l=0,sum=0,r=0,m=0,k=0;
        a=new int[3][3];
        b=new int[3][3];
        c=new int[3][3];
        for(i=0;i<3;i++){
        	for(j=0;j<3;j++){a[i][j]=sc.nextInt();}
        }
        for(i=0;i<3;i++){
        	for(j=0;j<3;j++){b[i][j]=sc.nextInt();}
        }
    for(i=0;i<3;i++){
    	for(j=0;j<3;j++){sum=0;for(k=0;k<3;k++){r=a[i][k]*b[k][j];sum=sum+r;}
    	System.out.print(sum +" ");}
       System.out.println(" ");}



	}
}
