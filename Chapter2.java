import java.util.*;
public class Chapter2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Question 1:"); q1(sc); //Sum of the digits
        System.out.println("Question 2:"); q2(sc); //Minutes to years and days
        System.out.println("Question 3:"); q3(sc); //Finding gratuity
        System.out.println("Question 4:"); q4(sc); //Compound value
        System.out.println("Question 5:"); q5(sc); //BMI
        System.out.println("Question 6:"); q6(sc); //Cost of a trip
        System.out.println("Question 7:"); q7(sc); //Counting minimum number of coins required
    }

    public static void q1(Scanner sc){
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum =0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println("The Sum of digits: "+sum);
    }

    public static void q2(Scanner sc){
        System.out.println("Enter the number of minutes: ");
        long n=sc.nextInt();
        long days=n/1440L;
        long years=days/365;
        System.out.println(years + " Years "+days%365 + " Days");
    }

    public static void q3(Scanner sc){
        System.out.println("Enter the Subtotal and the gratuity rate(in %): ");
        double total=sc.nextDouble();
        double g_rate=sc.nextDouble();
        double gratuity=total*g_rate/100.0;
        System.out.println("Gratuity: " + gratuity + "\nTotal:" + (total+gratuity));
    }

    public static void q4(Scanner sc){
        System.out.println("Enter the monthly amount and the rate of interest: ");
        double amt=sc.nextDouble();
        double roi=(sc.nextDouble()/1200.0);
        System.out.println("Enter the number of months: ");
        int Months=sc.nextInt();
        double finalValue=amt * ((Math.pow(1 + roi, Months) - 1) / roi);
        System.out.println("The value after " + Months +" Months: "+finalValue);
    }

    public static void q5(Scanner sc){
        System.out.print("Enter the weight(in kg): ");
        double weight=sc.nextDouble();
        System.out.print("Enter the height(in m): ");
        double height = sc.nextDouble();
        System.out.println("The BMI is: "+(weight/(height*height)));
    }

    public static void q6(Scanner sc){
        System.out.println("Enter the distance covered(in Km): ");
        double dis=sc.nextDouble();
        System.out.println("Fuel Efficiency of the Car(Km/Litre): ");
        double eff=sc.nextDouble();
        System.out.println("Price of petrol(per Litre): ");
        double price=sc.nextDouble();
        System.out.println("The cost of entire trip: " + (dis/eff)*price);
    }

    public static void q7(Scanner sc){
        System.out.print("Enter the amount in Dollars: ");
        double dollars=sc.nextDouble();
        int cents=(int)((dollars-(Math.floor(dollars)))*100);
        int quarters=cents/25;
        cents%=25;
        int dimes=cents/10;
        int pennies=cents%10;
        System.out.println("The given figure in lowest number of coins:");
        System.out.println("\n$" + (int)Math.floor(dollars));
        System.out.println(quarters +" Quarters");
        System.out.println(dimes+" Dimes\t" + pennies + " Pennies");
    }

}
