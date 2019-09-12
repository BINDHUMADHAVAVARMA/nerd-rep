import java.util.*;
class Denomination{
	public static void main(String sd[]){
		int a,tt,fh,th,oh,f,tw,te,o;
		Scanner sc=new Scanner (System.in);
		System.out.print("Give the amount : ");
		a=sc.nextInt();
        tt=a/2000;
        a=a-(2000*tt);
        fh=a/500;
        a=a-(500*fh);
        th=a/200;
        a=a-(200*th);
        oh=a/100;
        a=a-(100*oh);
        f=a/50;
        a=a-(50*f);
        tw=a/20;
        a=a-(20*tw);
        te=a/10;
        a=a-(10*te);
        o=a;
        System.out.println("Denomination");
       if(tt>0)System.out.println("2000 x "+tt);
       if(fh>0)System.out.println("500 x "+fh);
       if(th>0)System.out.println("200 x "+th);
       if(oh>0)System.out.println("100 x "+oh);
       if(f>0)System.out.println("50 x "+f);
       if(tw>0)System.out.println("20 x "+tw);
       if(te>0)System.out.println("10 x "+te);
       if(o>0)System.out.println("1 x "+o);
	}
	
}