package Number;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random r1=new Random();
		int x=r1.nextInt();
		int y=r1.nextInt(100);
		int a=40;
		int b=70;
		int z=r1.nextInt(b-a+1)+a;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
    }
}
