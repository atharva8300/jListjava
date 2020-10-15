import java.util.*;

public class Disp7 {
   public static void main(String[] args) throws Exception {
           Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
           // Add the necessary code in the below space 
     int a=1,b=1,c=1,d=1,e=1,f=1,g=1;
     switch(n)
     {
       case 0:g=0;
       		break;
       case 1:a=0;d=0;e=0;f=0;g=0;
       		break;
       case 2:f=0;c=0;
       		break;
       case 3:f=0;e=0;
       		break;
       case 4:a=0;e=0;d=0;
       		break;
       case 5:b=0;e=0;
       		break;
       case 6:b=0;
       		break;
       case 7:d=0;e=0;f=0;g=0;
       		break;
       case 9:e=0;
       		break;
     }
     if(a==1)
       System.out.print(" _ ");
     else
       System.out.print("   ");
     if(f==1)
       System.out.print("\n|");
     else
       System.out.print("\n ");
     if(g==1)
       System.out.print("_");
     else
       System.out.print(" ");
     if(b==1)
       System.out.print("|");
     else
       System.out.print(" ");
     if(e==1)
       System.out.print("\n|");
     else
       System.out.print("\n ");
      if(d==1)
       System.out.print("_");
     else
       System.out.print(" ");
     if(c==1)
       System.out.print("|");
   }
}
