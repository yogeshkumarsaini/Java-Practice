package Array;

import java.util.Scanner;

public class Array32 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 1 for char Array: ");
        System.out.println("Enter 2 for double Array");
        System.out.println("Enter 3 for String Array");

        int choice= sc.nextInt();
        switch(choice){
            case 1:
            DisplayArray(CreateCharArray());
            break;
            case 2:
            DisplayArray(CreateDoubleArray());
            break;
            case 3:
            DisplayArray(CreateStringArray());
            break;
            default:
            System.out.println("Enter the valid choice! ");
        }
        

    }


    public static char[] CreateCharArray(){
        System.out.println("Enter the Size of Char type Array");
        int size=sc.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.next().charAt(0);
        }
        return arr;
    }


    public static double[] CreateDoubleArray(){
        System.out.println("Enter the Size of Double type Array");
        int size=sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    
    public static String[] CreateStringArray(){
        System.out.println("Enter the Size of String type Array");
        int size=sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.toString();
        }
        return arr;
    }
    public static void DisplayArray(char[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void DisplayArray(double[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void DisplayArray(String[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
