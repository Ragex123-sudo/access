package main;
import java.util.Scanner;
public class access
{
       String user_id;
    void cmd()
    {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Type help to view all available commands(it is one time command make sure not to make any mistake)");
     String cmd=scanner.nextLine();
     if(cmd.equals("help"))
     {
        System.out.println("Here is the list of the commands");
        System.out.println("0.set$run");
        System.out.println("1.tol$run");
        System.out.println("2.con$run");
        System.out.println("3.gam$run");
     }
     System.out.println("Enter your command");
     cmd=scanner.nextLine();
     if(cmd.equals("tol$run"))
     {
      tollex obj=new tollex();
      obj.run();
     }
     else if(cmd.equals("set$run"))
     {
      String reset="\u001B[0m";
      settings ob=new settings();
      String maincolour=ob.main1();
      System.out.println(maincolour+"HEllo"+reset);
     }
     else if (cmd.equals("con$run"))
     {
      conv ob=new conv();
      ob.main();
     }
     else if(cmd.equals("gam$run"))
     {
        gam ob=new gam();
        ob.main1();
     }
    }
    public static void main(String[] args) 
    {
        int repeat=0;
        Scanner sc=new Scanner(System.in);
         while(repeat==0)
            {
        String user_id;
        System.out.println("Welcome to acess!");
        System.out.println("Enter your user name");
        user_id=sc.nextLine();
       int passcode= (int)(Math.random() * (500 - 100 + 1) + 100);
       System.out.println("Your passcode is "+passcode);
       System.out.println("Enter the passcode which is being displayed");
       int check=sc.nextInt();
       if(check==passcode)
       {
        System.out.println(user_id+" WELCOME");
        System.out.println("You are loged in !");
        repeat=1;
        access ob=new access();
        ob.cmd();
       }
       else{
        System.out.println("Wrong passcode!  Try again");
        repeat=0;
       }
    }
  }
}
