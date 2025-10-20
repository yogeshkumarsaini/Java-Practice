public class String1{
    public static void main(String[] args) {        
        String s="Ni@te_sh$";
        String a=getReverse(s);
        System.out.println(a);
    }
    public static String getReverse(String s){
       char[] x=s.toCharArray();
       int left=0;
       int right=x.length-1;

       while(left<right){
        if(!Character.isLetter(x[left])){
            left++;
        }
        else if(!Character.isLetterOrDigit(x[right])){
            right--;
        }
        else{
            char temp=x[left];
            x[left]=x[right];
            x[right]=temp;
            left++;
            right--;
        }
       }

     return new String(x);
    }
}