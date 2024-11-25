public class Operations{
  public static void main(String [] args){

     GetData gd = new GetData();
     MathOperations mo = new MathOperations();

     double firstNum = gd.getDouble();
     double secondNum = gd.getDouble();

     double sum = mo.add (firstNum, secondNum);
     double difference = mo. subtract(firstNum, secondNum);
     double product = mo.multiply(firstNum, secondNum);
     double quotient = mo.divide(firstNum, secondNum);

     mo.print(sum, difference, product, quotient, firstNum, secondNum);


     }
 }
