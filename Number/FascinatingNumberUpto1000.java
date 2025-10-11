package Number;

public class FascinatingNumberUpto1000 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=1000;i++){
            if(checkFascinating(i)){
                System.out.println("It is a Fascinating Number: "+i);
                count++;
            }
        }
        System.out.println("Total count of Fascinating Number between 1 to 1000 are: "+count);
    }
    public static boolean checkFascinating(int n){
        String s=n+""+n*2+n*3;
        for(char c='1';c<='9';c++){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(c==s.charAt(i))
                    count++;
            }
            if(count==0 || count>1)
                return false;
        }
        return true;
    }
}
