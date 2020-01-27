import java.util.*;

public class ProgrammingExample12 {
    public static Scanner kbReader= new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter Subtotal");
        double subtotal=kbReader.nextDouble();
        System.out.println("Enter TIp %");
        double tippercent=kbReader.nextDouble();
        double grTotal=subtotal+(tippercent*subtotal);
        System.out.println("Total - %.2f",grTotal);
    }
}
