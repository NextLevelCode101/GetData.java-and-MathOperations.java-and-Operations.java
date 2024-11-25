import java.util.Scanner;

public class GetData{

   Scanner kb = new Scanner(System.in);

   public GetData(){

   }

   public int getInt(){
      System.out.println("Please enter an integer");

      return kb.nextInt();


      }

      public double getDouble(){
        System.out.println("Please enter a double");
        return kb.nextDouble();

        }
   }
