import java.util.*;
import java.io.*;
public class Main
{
   public static String finalResult;
    
    public  char XOR(char a,char b){
        if(a==b){
            return '0';
        }
        
        else{
            return '1';
        }
        
    }
    
    public int BintoDec(String s){
        int x=Integer.parseInt(s);
        int dec=0,i=0;
        while(x!=0){
            int rem=x%10;
             x=x/10;
             dec=dec+rem*(int)Math.pow(2,i);
             i++;
        }
        
        return dec;
    }
    
    public void CRC(String input,String gen){
        Main m = new Main();
		
		int l=input.length();
		for(int i=0;i<gen.length()-1;i++){
		        input=input+"0";
		        
		    }
		    
	    String inputmain=input;
		    
		   
		while(input.length()>gen.length()){
		    
		    String v="";
		    int trail=0;
		    int y;
		
		    
		
		    while(input.charAt(trail)=='0'){
		            trail++;
		            
		            
		        }
		
		    for(int i=trail;i<gen.length()+trail;i++){
		    
		    v=v+m.XOR(input.charAt(i),gen.charAt(i-trail));
		    
		    }
		    
		    v=v+input.substring(gen.length()+trail,input.length());
		    input=v;
		    
		    
		   }
		   
		    int result=m.BintoDec(inputmain)+m.BintoDec(input);
		    
		    finalResult=Integer.toBinaryString(result);
		   
		   System.out.println("Message to be transmitted is "+finalResult);
		
		
    
        
    }
    
    public void recieve(String input,String gen){
        Main m = new Main();
        
        while(input.length()>gen.length()){
		    
		    String v="";
		    int trail=0;
		    int y;
		
		    
		
		    while(input.charAt(trail)=='0'){
		            trail++;
		            
		            
		        }
		
		    for(int i=trail;i<gen.length()+trail;i++){
		    
		    v=v+m.XOR(input.charAt(i),gen.charAt(i-trail));
		    
		    }
		    
		    v=v+input.substring(gen.length()+trail,input.length());
		    input=v;
		     //System.out.println(input);
		   }
		   
		  
		   
		   if(m.BintoDec(input)==0){
		       System.out.println("Data accepted");
		   }
		   
		   else{
		        System.out.println("Data not accepted");
		   }
        
    }
	public static void main(String[] args) {
	    Main main = new Main();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter message");
	    String input = sc.nextLine();
	    System.out.println("Enter CRC generator");
	    String gen= sc.nextLine();
	    
	    main.CRC(input,gen);
	    System.out.println("Enter reciever msg");
	    String recieve=sc.nextLine();
	    main.recieve(recieve,gen);
	}
}
