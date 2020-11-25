import java.util.Scanner;

public class WelcomeNames {
	public static void main(String[] args){

	 
	   String[] names=new String[11];
	   
	   for ( int i =1; i<=10; i++ )
       {
		   Scanner userInput =new Scanner(System.in);
		   System.out.println("Please Enter Name "+i +" :");
		   String Name =userInput.next();
		   names [i] = Name;
		  
       }
       for ( int i =0; i<= 9; i++ )
       {
    	  
    	   System.out.println("Welcome "+names[i]);
       }
      
       }
       
}
