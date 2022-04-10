
import java.util.Scanner;

import static java.lang.System.exit;

class check
{
    double dip;
    double wit;
    public double result;

    void input()
    {
        System.out.println("enter the initial balnce");
        Scanner sc=new Scanner(System.in);
        result=sc.nextDouble();
    }

    void diposit()
    {
        System.out.println("Enter the amount you want to diposit");

        Scanner tc=new Scanner(System.in);
        dip=tc.nextDouble();

        result=result+dip;
        System.out.println("net balance = "+result);
    }

    void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw :");
        Scanner mc = new Scanner(System.in);
        wit= mc.nextDouble();
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

class interest extends check
{
    double re;
    String m;
    void input2()
    {
        System.out.println("Enter your bank Name in capital ie. 'SBI','AXIS' etc. : ");
        Scanner tc=new Scanner(System.in);
        m=tc.nextLine();


        if(m.equals("SBI"))
        {
            re=result *(4/100);
            System.out.println("The interest percentage is 4% ");
            System.out.println("The total interest amount will be : "+re);

            System.out.println("Now,the total balnce after getting the interst is = "+(result+re));
        }
        else if(m.equals("AXIS"))
        {
            re=result*(4.5/100);
            System.out.println("The interest percentage is 4.5% ");
            System.out.println("The total interest amount will be : "+re);

            System.out.println("Now,the total balnce after getting the interst is = "+(result+re));
        }

        else if(m.equals("ICICI"))
        {
            re=result*(6/100);
            System.out.println("The interest percentage is 6% ");
            System.out.println("The total interest amount will be : "+re);

            System.out.println("Now,the total balnce after getting the interst is = "+(result+re));

        }
        else
        {
            re=result*(3.8/100);
            System.out.println("The interest percentage is 3.8% ");
            System.out.println("The total interest amount will be : "+re);

            System.out.println("Now,the total balnce after getting the interst is = "+(result+re));
        }
    }

}
public class BANK {
    public static void main(String args[]) {
        int i = 1;
        int ch;
        interest obj = new interest();
        System.out.println("enter 1 to eneter the initial balance");
        System.out.println("enter 2 to diposite");
        System.out.println("enter 3 to withdraw");
        System.out.println("enter 4 to show  the balance of the user");
        System.out.println("enter 0 to end banking");
        System.out.println("Want to know about the current interest rate , press '101' ");
        while (i == 1) {
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
                case 101:
                    obj.input2();
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