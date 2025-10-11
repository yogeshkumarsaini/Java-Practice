package Number;

public class DissariumNUmberUpto100 {
    public static void main(String[] args) {
        System.out.println("Dissarium Number between 1 to 100 are-");
        for(int i=1;i<=100;i++){
            if(checkDissarium(i)==i){
                System.out.println("It ia a dissarium number: "+i);
            }
            
        }
    }
    public static int checkDissarium(int n){
        int a=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int p=0;
        while(a>0){
            int rem = a%10;
            p=p+(int)(Math.pow(rem, count));
            a=a/10;
            count--;
        }
        return p;
    }
}
