public class prime3{
public static void main(String args[]){
int y,prime=1,z;

for(z=2;z<1001;z++)
 { if(z%2==0){System.out.print(z); System.out.print(" is an even ");}
   if (z%2==1){System.out.print(z); System.out.print(" is an odd ");}
   for(y=2;y<z;y++)
          { if(z%y==0){ prime=0;break;}}
if(prime==1){System.out.println("prime number");}
if(prime==0){System.out.println("composite number");}
}}}