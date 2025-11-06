// WAJP to print all the number upto 1000 which are divisible by 7 and end with 7.
class program5 
{
   public static void main(String[] args) {
    int i =1;
    while(i<=1000){
        if(i%7==0 && i%10==7){
            System.out.println(i);
        }
        i++;
    }
   } 
}
