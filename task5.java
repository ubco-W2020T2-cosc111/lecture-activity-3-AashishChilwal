import java.util.Scanner;
public class task5 {
    public static void main(String []args){
        Scanner Calc = new Scanner(System.in);  
  System.out.print("Enter the number of meters you ran: ");  
  int meter= Calc.nextInt();  
  System.out.print("Enter the time taken (in sec): ");  
  int second= Calc.nextInt();  
  int average=meter/second;  
  System.out.println("You ran " +average+" m/s !");  
       }
}
