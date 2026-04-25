package main;
import java.util.Scanner;
public class access
{
    void cmd()
    {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Type help to view all available commands(it is one time command make sure not to make any mistake)");
     String cmd=scanner.nextLine();
     if(cmd.equals("help"))
     {
        System.out.println("Here is the list of the commands");
     }
    }
    public static void main(String[] args) 
    {
        int repeat=0;
        Scanner sc=new Scanner(System.in);
         while(repeat==0)
            {
        String user_id;
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
