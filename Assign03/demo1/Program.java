import java.util.*;
public class Program {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int l = sc.nextInt();
     int h = sc.nextInt();

     NumberCheck numcheck = new EvenCheck();
     NumberCheck oddcheck = new OddCheck();

     System.out.println("The total number of even numbers are " + Utility.summation(l, h, numcheck));

     System.out.println("The total number of odd numbers are " + Utility.oddsummation(l, h, oddcheck));
    }
}
