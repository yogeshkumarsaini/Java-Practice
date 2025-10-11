package Number;

public class PrimNumberUpto100 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            if(checkPrime(i)){
                System.out.println("It is a prime number: "+i);
                count++;
            }
        }
        System.out.println("Total count of prime number between 1 to 100 are: "+count);
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
