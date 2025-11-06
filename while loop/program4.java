// WAJP to print all the number upto 200 which are divisible by 7 or end with 7.
class program4
{
  public static void main(String[] args)
  {
    int i=1;
    while(i<=200)
    {
        if(i%7==0 || i%10==7)
        {
            System.out.println(i);
        }
        i++;
    }
  }  
}
