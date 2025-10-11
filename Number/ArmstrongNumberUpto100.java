package Number;

public class ArmstrongNumberUpto100 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0; i<=100; i++){
            if(checkArmstrong(i)==i){
                System.out.println("It is a Armstrong Number: "+i);
                count++;
            }  
        }
        System.out.println("Total count of Armstrong Number between 1 to 100 are: "+count);
    }
    public static int checkArmstrong(int n){
        int a=n;
        int count=0;
        while(n>0){
            int rem = n%10;
            count++;
            n=n/10;
        }
        int sum=0;
        while(a>0){
            int rem = a%10;
            sum=sum+(int)(Math.pow(rem, count));
            a=a/10;
        }
        return sum;
    }
}
