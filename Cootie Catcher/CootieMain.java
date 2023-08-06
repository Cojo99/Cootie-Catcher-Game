import java.util.*;

public class CootieMain
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      
      Cootie user = new Cootie();
      
      String question;
      String userColor = "";
      String playAgain = "";
      int userNumChoice1;
      boolean run = false;
      boolean again = false;
      boolean quit = false;
      
      do
      {
         System.out.println("Cootie Catcher Game");
         System.out.println("Ask a question: ");
            question = in.nextLine();
         
         //get user color choice
         do
         {
           
           System.out.println("Pick a color (red, blue, yellow, green): ");
              userColor = in.nextLine();
              
            if (!userColor.equalsIgnoreCase("red") && !userColor.equalsIgnoreCase("blue")
                    && !userColor.equalsIgnoreCase("yellow")
                    && !userColor.equalsIgnoreCase("green"))
            {
               run = true;
               System.out.println("Invalid input, try again.");
            }
            else
            {
               run = false;
            }  
            
         } while (run);
                      
         //ask user for number choice 1, assign to variable           
         userNumChoice1 = user.numOptions1(userColor);
         
         //get second number choice from user
         user.numOption2(userNumChoice1); 
         
         //print message
         user.messageList();
         
         //quit statement
         do
         {
            again = false;
            
            System.out.println("Would you like to (p)lay again or (q)uit?");
            playAgain = in.nextLine();
            
            if (playAgain.equalsIgnoreCase("p"))
            {
               again = false;
               quit = true;
            }
            else if (playAgain.equalsIgnoreCase("q"))
            {
               again = false;
            }
            else
            {
               again = true;
               System.out.println("Invalid choice. Choose again.");
            }
                  
         } while (again);    
                    
      } while (quit); 
   }
}