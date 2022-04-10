package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

class check
{
    int dip;
    int wit;
    int result;
    
    void input()
    {
        System.out.println("enter the initial balnce");
        Scanner sc=new Scanner(System.in);
        result=sc.nextInt();
    }
    
    void diposit()
    {
        System.out.println("Enter the amount you want to diposit");
        
        Scanner tc=new Scanner(System.in);
        dip=tc.nextInt();
        
        result=result+dip;
        System.out.println("net balance = "+result);
    }
    
    void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw :");
        Scanner mc = new Scanner(System.in);
        wit= mc.nextInt();
        if(wit>result)
        {
            System.out.println("insufficient balance");
        }
        else {
            result=result-wit;
            System.out.println("net balance = " + result);
        }
    }
    
    void op()
    {
        System.out.println("the current balnce in your account is = "+result);
    }
}

class NewExample2
{
    public static void   main(String args[])
    {
        int i=1;
        int ch;
        check obj=new check();
        System.out.println("enter 1 to eneter the initial balance");
        System.out.println("enter 2 to diposite");
        System.out.println("enter 3 to withdraw");
        System.out.println("enter 4 to show  the balance of the user");
        System.out.println("enter 0 to end banking");
        while(i==1)
        {
               Scanner nc = new Scanner(System.in);
               System.out.println("enter your choice:");
               ch = nc.nextInt();
               switch (ch) {

                   case 1:
                       obj.input();
                       break;
                   case 2:
                       obj.diposit();
                       break;
                   case 3:
                       obj.withdraw();
                       break;
                   case 4:
                       obj.op();
                       break;
                   case 0:
                       exit(0);
                   default:
                       System.out.println("You have entered a wrong choiice.Please try again later");
                       break;
               }
        }
    }
}