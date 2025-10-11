package Number;

public class PerfectNumberUpto100 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=100; i++){
            if(checkPerfect(i)==i)
            {
                System.out.println("It is a perfect number: "+i);
                count++;
            }
        }
        System.out.println("Total count of perfect number between 1 to 100 are: "+count);
    }
    public static int checkPerfect(int n){
        int sum=0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0)
                sum=sum+i;
        }
        return sum;
    }
}
