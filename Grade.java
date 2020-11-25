
import javax.swing.JOptionPane;

public class Grade { 

       public static void main(String[] args) {
                     
     String input= JOptionPane.showInputDialog("Please Enter your Score :");
     int score = Integer.parseInt(input);
                   
      if (score >= 0 && score <50){
      JOptionPane.showMessageDialog(null,"Your Grade is :F");}
     
      else if (score >= 50 && score <65)
      JOptionPane.showMessageDialog(null,"Your Grade is :D");
      
      else if (score >=65 && score <75)
      JOptionPane.showMessageDialog(null,"Your Grade is : C");
      
      else if (score >=75 && score <85)
      JOptionPane.showMessageDialog(null,"Your Grade is : B");
      
      else if (score >=85 && score <=100)
      JOptionPane.showMessageDialog(null,"Your Grade is : A");
      
      else 
      JOptionPane.showMessageDialog(null,"Please Enter a valid Score");
      
    	  
      }
      }
