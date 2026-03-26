import java.io.*;
import java.util.Random;
class guessgame
{
    public static void main(String[] args)
    {
        try
        {
        DataInputStream x= new DataInputStream(System.in);
        int n;
        Random r = new Random();

        n=r.nextInt(100) + 1;
        int a=-1;
        int guess=0;
        System.out.println("welcome to my guessing game");

        while(a!=n)
         {
            System.out.println("guessing the number");
            a=Integer.parseInt(x.readLine());
            guess++;
       

        if(a>n)
        {
            System.out.println("plz Enter the lower number");
        }
        else if(a<n){
            System.out.println("plz enter the Higer number");
        }
        else
        {
            System.out.println("Congratulations You guessed the correct number=="+n);
            System.out.println("you have Enter  attempts == "+guess);
        }
    }
    }
    
    catch(Exception e){
        System.out.println("not run");
    }
    }
}