// WAJP to print all the number upto 200 which areend with 7.
class program3 
{
 public static void main(String[] args)
 {
    int i=1;
    while(i<=200)
    {
        if(i%10==7)
        {
            System.out.println(i);
        }
        i++;
    }
 }   
}
