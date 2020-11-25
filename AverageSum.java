import java.util.Scanner;

public class AverageSum {
	public static void main(String[] args){

	 
	   int[] mynum=new int[6];
	   int SUM =0;
	   int AVG = 0;
	   int size =5;
	   for ( int i =1; i<=5; i++ )
       {
		   System.out.println("Please Enter num "+i +" :");
		   Scanner userInput =new Scanner(System.in);
		   int number =userInput.nextInt();
		   mynum [i] = number;
		   SUM = SUM + mynum[i];
       }
	   
	   System.out.println("total SUM =  "+SUM);
	   AVG = SUM/size;
	   System.out.println("total AVG =  "+AVG);
		  
	}	
	}