package Number;
public class AutomorphicNumberUpto100 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=100;i++){
            if(checkAutomorphic(i)){
                System.out.println("It is a Automorphic number: "+i);
                count++;
            }    
        }
        System.out.println("Total count of automorphic number upto 100 are: "+count);
    }
    public static boolean checkAutomorphic(int n){
        int sqr=n*n;
        while(n>0){
            if(n%10!=sqr%10)
                return false;
            n=n/10;
            sqr=sqr/10;
        }
        return true;
    }
}
