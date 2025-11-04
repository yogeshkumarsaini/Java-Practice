package Array;

import java.util.Scanner;

public class MainController {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many student objects u wnat to create and store : ");
        int size = sc.nextInt();
        Student[] st = new Student[size];

        for(int i=0; i<size; i++){
            System.out.println("If u want to create object fill some details: ");
            System.out.println("Enter the id: ");
            int id = sc.nextInt();
            System.out.println("Enter the phone no: ");
            long phone = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the eamil:");
            String email = sc.nextLine();

            st[i] = new Student(name, id, email, phone);
            System.out.println(i++ +"Object is created");
        }
        //System.out.println(Arrays.toString(st));
        for(int i=0;i<st.length;i++){
            System.out.println("[" +st[i].name +","+st[i].id+","+st[i].phone+","+st[i].email+"]");
        }
    }
}
