import java.util.*;
import java.io.*;
import static java.lang.Math.sqrt;

public class MyClass {
    public static Scanner kbReader= new Scanner(System.in);
    public static Scanner kbReaderStr=new Scanner(System.in);
    public static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if (x%i==0){
                return false;
            }

        }
        return true;

    }
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int i ; numbers){
            if (i>max){
                max=i;
            }
        return max;



        }
    }
    public static void main(String[] args){

        System.out.println("Menu");
        System.out.println("1-Conversion");
        System.out.println("2-Greatest of 2");
        System.out.println("3-Greatest of 3");
        System.out.println("4-User and Pass");
        System.out.println("5-Read Negatives");
        System.out.println("6-Print to 10");
        System.out.println("7-Prime");
        System.out.println("8-Array");

        int userSelect = kbReader.nextInt();

        if (userSelect==1) {
            //Unit Conversion Km - Miles
            System.out.println("Enter Kilometers");
            float kmUnit = kbReader.nextInt();
            System.out.println("Miles:" + (kmUnit * 1.6));
        }

        else if (userSelect==2) {
            //GreatestNumber
            System.out.println("Enter First Number");
            float firstNum = kbReader.nextFloat();
            System.out.println("Enter Second Number");
            float secondNum = kbReader.nextFloat();

            if (firstNum > secondNum) {
                System.out.println(firstNum);
            }
            else if (firstNum == secondNum) {
                System.out.println("Equal");
            }
            else {
                System.out.println(secondNum);
            }
        }

        else if  (userSelect==3){
            System.out.println("Enter Three Numbers;");
            float inOne=kbReader.nextFloat();
            float inTwo=kbReader.nextFloat();
            float inThree=kbReader.nextFloat();

            if ((inOne > inTwo) && (inOne>inThree)){
                System.out.println("First Number Greatest");
                System.out.println(inOne);
            }

            else if ((inTwo>inThree) && (inTwo>inOne)){
                System.out.println("Second Number Greatest");
                System.out.println(inTwo);
            }
            else{
                System.out.println("Third Number Greatest");
                System.out.println(inThree);
            }
        }
        else if (userSelect==4){
            //User and Pass
            String userName=kbReaderStr.nextLine();
            String userPass=kbReaderStr.nextLine();
            if ((userName.equals("dave")) && (userPass.equals("12345"))){
                System.out.println("Welcome");
            }
        }

        else if (userSelect==5){
            int numInput=kbReader.nextInt();
            int posCount=0;
            while (numInput>0){
                posCount++;
                numInput=kbReader.nextInt();

            }

            System.out.println(posCount);
        }

        else if (userSelect==6){
            for(int i=1; i<11;i++) {
                System.out.println(i);
            }
        }

        else if(userSelect ==7) {
            boolean isPrime = true;
            int numTest = kbReader.nextInt();
            for (int i = 2; i < numTest; i++) {
                if (numTest % i == 0) {
                    isPrime = false;
                }
            }
            System.out.println(isPrime);

        }

        else if (userSelect ==8) {
            Random rand = new Random();
            int size=100;
            int[] numbers=new int[size];
            for (int i=0; i<numbers.length;i++){
                numbers[i]=rand.nextInt(101);
            }
            int total=0;
            for (int x:numbers){
                total+=x;
            }
            System.out.println((double)total/numbers.length);
        }

        else if (userSelect==9){
            for(int i =0; i<10; i++){
                if(isPrime(i)){
                    System.out.print(i+"is Prime");
                }
            }
        }
        else if (userSelect == 10) {
            int[] nums = {1,2,3,4,5,6,0};
            System.out.println(max(nums));
        }
    }
}
