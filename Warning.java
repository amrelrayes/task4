import java.util.Scanner;

public class Warning {
	public static void main(String[] args){

	 
	   int[] myNum=new int[6];
	   for ( int i =1; i<=5;i++ )
       {
		   System.out.println("Please Enter num "+i +" :");
		   Scanner userInput =new Scanner(System.in);
		   int num =userInput.nextInt();
		   
		   {   if (num==0)
			   System.out.println("Warning Zero is an invalid Entry !!");
		   continue;
		   }
			 
		
       }
	}
}