import java.util.*;
import java.lang.*;
public class TaxProgram {
    public static Scanner kbReader = new Scanner(System.in);
    public static void main(String args[]){
        double income,fedTax,provTax;
        double dependents;

        System.out.print("Please enter your taxable income:");
        System.out.println();
        income=kbReader.nextDouble();

        System.out.print("Please enter your number of dependents:");
        dependents=kbReader.nextInt();
        System.out.println();

        fedTax = 0.0;
        provTax=0.0;

        if (income <= 29590){
            fedTax = (0.17 * income);
        }
        else if (income>=29590.01 && income<=59179.99){
            fedTax=((0.17*29590)+(0.26*(income-29590)));
        }

        else if (income>=59180){
            fedTax=((.17*29590)+(0.26*29590)+(.29*(income-59180)));
        }

        if ((0.425*fedTax)<(160.50+(328*dependents))){
            provTax=0;
        }
        else{
            provTax = ((0.425 * fedTax) - (160.50 + (328 * dependents)));
        }
        double totalTax = fedTax + provTax;

        System.out.println("Here is your tax breakdown:");
        System.out.println((String.format("%15s%10.2f","Income:",income)));
        System.out.println((String.format("%15s%10.2f","Dependents:",dependents)));
        System.out.println("----------------------------");
        System.out.println((String.format("%15s%10.2f","Federal Tax:",fedTax)));
        System.out.println((String.format("%15s%10.2f","Provincial Tax:",provTax)));
        System.out.println("============================");
        System.out.println((String.format("%15s%10.2f","Total Tax:",totalTax)));



    }


}
