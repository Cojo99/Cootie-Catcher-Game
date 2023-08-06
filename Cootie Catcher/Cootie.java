import java.util.*;

public class Cootie
{
   Scanner in = new Scanner (System.in);
   
   //initialize class variable
   private String color;
   private String userColorNum;
   private int length;
   private int numChoice1;
   private int numChoice2;
   private int messageNum;   
   private int messageLine;
      
   //setter for color choice method
   public void setMakeChoice()
   {
      this.color = color;
   }
   //getter for color choice
   public String getMakeChoice(String color)
   {
      return color;
   }
   //show user number choices after selecting color
   public int numOptions1 (String color)
   {
      length = color.length();
      boolean run = false;
      do
      {
         //try catch to check for valid user input
         try
         {
            run = false;
            if (length % 2 == 0)
            {
               System.out.println("Choose a number(1, 2, 5, 6): ");
               numChoice1 = in.nextInt();

               if (numChoice1!=1 && numChoice1!=2 && numChoice1!=5 && numChoice1!=6)
               {
                  run = true;
                  System.out.println("Invalid choice.");                 
               }
            }
            else if (length % 2 != 0)
            {
               System.out.println("Choose a number(3, 4, 7, 8): ");
               numChoice1 = in.nextInt();

               if (numChoice1!=3 && numChoice1!=4 && numChoice1!=7 && numChoice1!=8)
               {
                  run = true;
                  System.out.println("Invalid choice. ");                  
               }
            }

         } catch (Exception e)
            {
               run = true;
               System.out.println("Invalid input, try again. " + e.getMessage());               
               //flush buffer
               in.nextLine();
            }

      } while(run);
       
       return numChoice1;
   }
      
   //method for getting second number
   public void numOption2 (int numChoice1)
   {
      boolean choice = false;
      
      do
      {
         choice = false;
         //check for valid user input
         try
         {
            if (numChoice1 == 1 || numChoice1 == 4 || numChoice1 == 5 || numChoice1 == 8)
            {
               System.out.println("Please choose another number (3, 4, 7, or 8): ");
               numChoice2 = in.nextInt();
                   
               if (numChoice2 != 3 && numChoice2 != 4 && numChoice2 != 7 && numChoice2 != 8)
               {
                  choice = true;
                  System.out.println("Invalid choice.");
               }         
            }
            else if (numChoice1 == 2 || numChoice1 == 3 || numChoice1 == 6 || numChoice1 == 7)
            {
               System.out.println("Please choose another number (1, 2, 5, or 6): ");
               numChoice2 = in.nextInt();
               
               if (numChoice2 != 1 && numChoice2 != 2 && numChoice2 != 5 && numChoice2 != 6)
               {
                  choice = true;
                  System.out.println("Invalid choice.");
               }
            }
         } 
         catch (Exception e)
         {
            choice = true;
            System.out.println("Invalid choice. Try again.");
            in.nextLine();
         }            
              
      } while (choice);
   }
   
   //create messages arrayList and pick message
   public void messageList()
   {
      ArrayList<String> messages = new ArrayList<String>();
         messages.add("Highly unlikely");
         messages.add("Somewhat unlikely");
         messages.add("Ask your pet, they will know");
         messages.add("It's quite possible...");
         messages.add("Likely, but be patient");
         messages.add("Yeah...not going to happen");
         messages.add("Highly probable");
         messages.add("Unclear, ask in a week.");
         
         numChoice2 = numChoice2 - 1;
         
         System.out.println(messages.get(numChoice2));
   }
   
}