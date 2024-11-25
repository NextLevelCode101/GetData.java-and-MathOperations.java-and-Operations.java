public class MathOperations
{

   public MathOperations()
   {
   }

   public double add(double fn, double sn)
   {
    return fn+sn;

   }
   public double subtract(double fn, double sn)
   {
      double firstTry = fn - sn;
      double secondTry = sn - fn;

      if (firstTry > secondTry)
         return firstTry;
      else
         return secondTry;

     }

      public double multiply(double fn, double sn){
         return fn*sn;
         }

         public double divide(double fn, double sn){
             double firstTry = fn / sn;
             double secondTry = sn / fn;

            if (firstTry > secondTry)
               return firstTry;
              else
                return secondTry;

           }

           public void print(double s, double d, double p,double q, double fn, double sn)
           {
            System.out.println("The sum of"+fn+" and "+sn+" is "+s);
            System.out.println("The positive difference of "+fn+" and "+sn+" is "+d);
            System.out.println("The product of "+fn+" and "+sn+" is "+p);
            System.out.println("The larger answer of the division of "+fn+" and "+sn+" is "+q);
            System.out.println("Program has successfully conculuded, GoodBye!");

           }

}
