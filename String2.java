public class String2 {
    public static void main(String[] args) {
        String s="grr*appp**hicsz*";
        System.out.println(removeAsterisks(s));
    }
    public static String removeAsterisks(String s){
        if(s==null ||s.isEmpty()){
            return "";
        }
        char[] c=s.toCharArray();
        int x=0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]!='*'){
                c[x++]=c[i];
            }
        }
        return new String(c,0,x);
    }
}
