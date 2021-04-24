package com.company;
import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter a number according to following guidelines");
        System.out.println("0-Stone,1-Paper,2-Scissor");
        a=sc.nextInt(3);
        b=r.nextInt(3);

        System.out.println("computer selected :"+b);
        if(a==0&&b==1)
        {
            System.out.println("You loose");
        }
        else if(a==0&&b==2)
        {
            System.out.println("You Win");
        }
        else if(a==1 &&b==0)
        {
            System.out.println("You Win");
        }
        else if(a==1&&b==2)
        {
            System.out.println("You loose");
        }
        else if(a==2&&b==0)
        {
            System.out.println("You loose");
        }
        else if(a==2 &&b==1)
        {
            System.out.println("You win");
        }
        else{
            System.out.println("Match draw");
        }
    }

}
