public class prime2{
public static void main(String args[]){
int x,y,prime,z;
x=0;
prime=1;
if(x==0) System.out.println("0 is invalid");
x=x+1;
if(x==1){ System.out.println("1 is neither prime nor composite");}
for(x=2;x<101;x=x+1)
 { if(x%2==0){System.out.print(x); System.out.print(" is an even ");}
   if (x%2==1){System.out.print(x); System.out.print(" is an odd ");}
    for(y=2;y<x;y=y+1)
         {  if(x%y==0)prime=0;}
if(prime==1){System.out.println("prime number");}
if(prime==0){System.out.println("composite number");}
}}}