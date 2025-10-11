package Number;

public class HappyNumberUpto100 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            if(checkHappy(i)){
                System.out.println("It is a Happy number: "+i);
            }
        }
    }
    public static boolean checkHappy(int n){
        while(n>9){
            int sum =0;
            while(n>0){
                int rem=n%10;
                sum = sum+rem*rem;
                n=n/10;
            }
            n=sum;
        }
        return n==1 || n==7;
    }
}
