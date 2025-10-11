package Number;
public class StrongNumberUpto100 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=100; i++){
            if(checkStrong(i)==i){
                System.out.println("It is a strong number: "+i);
                count++;
            }
        }
        System.out.println("Total count of the strong number between 1 to 100 are: "+count);
    }
    public static int checkStrong(int n){
        int b;
        int fact=1;
        int sum=0;
        while(n!=0){
            b=n%10;
            for(int i=1; i<=b;i++)
                fact=fact*i;
            sum=sum+fact;
            n=n/10;
            fact=1;
        }
        return sum;
    }
}
