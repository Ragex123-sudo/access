package main;
import java.util.Scanner;
public class conv {
     Scanner sc=new Scanner(System.in);
    void primary()
    {
        String input;
         System.out.println("Commands:");
        System.out.println("convo$binary_primary to convert a normal number to binary number");
        System.out.println("conovo$octal_primary to convert a normal number to octal number");
        System.out.println("convo$hexadecimal_primary to convert a normal number to hexadecimal number");
        System.out.println("Type your command");
        System.out.print(">>");
        input=sc.nextLine();
        if(input.equals("convo$binary_primary"))
        {
                String binaryString;
                int number;
                System.out.println("Please enter the number ");
                System.out.print(">>");
                number=sc.nextInt();
                binaryString=Integer.toBinaryString(number);
                System.out.println("The number in binary is "+binaryString);
                System.exit(0);
        }
         else if(input.equals("convo$octal_primary"))
        {
            String octalString;
            int number;
            System.out.println("Enter your number");
            System.out.print(">>");
            number=sc.nextInt();
            octalString=Integer.toOctalString(number);
            System.out.println("The number in octal is "+octalString);
            System.exit(0);

        }        
         else if(input.equals("convo$hexadecimal_primary"));      
        {
            String hexString;
            int number;
            System.out.println("Enter your number");
            System.out.print(">>");
            number=sc.nextInt();
            hexString=Integer.toHexString(number);
            System.out.println("The number in octal is "+hexString);
            System.exit(0);

        }
    }
    void secondary()
    {
        Scanner sc=new Scanner(System.in);
        String type;
        System.out.println("Type convo$s.avrg to access average currency converison");
        System.out.println("Type convo$s.accu to access accurate currency conversion");
        type=sc.nextLine();
        if(type.equals("convo$s.avrg"))
        {
            int idk;
            System.out.println("Select from the following conversions");
            System.out.println("1.inr to usd or usd to inr ");
            System.out.println("2.inr to pounds or pounds to inr ");
            System.out.println("3.usd to pound or pounds to usd ");
            idk=sc.nextInt();
            switch(idk)
            {
                case 1:
                    int id;
                    System.out.println("inr to usd type 1 or usd to inr type 2");
                    id=sc.nextInt();
                    switch(id)
                    {
                        case 1:
                            float in,op;
                            System.out.println("Enter the amount in inr ");
                            in=sc.nextFloat();
                            op=0.0106f*in;
                            System.out.println("The amount is"+op);
                            System.exit(0);
                        case 2:
                            float in1,op1;
                            System.out.println("Enter the amount in usd");
                            in1=sc.nextFloat();
                            op1=in1/0.0106f;
                            System.out.println("The amount is "+op1);
                            System.exit(0);
                        default:
                            System.out.println("INVALID INPUT");
                            System.exit(0);
                    }
                    break;
                case 2:
                    int id1;
                    System.out.println("inr to pound type 1 or pound to inr type 2 ");
                    id1=sc.nextInt();
                    switch (id1) {
                        case 1:
                            float in,op;
                            System.out.println("Enter the amount in inr");
                            in=sc.nextFloat();
                            op=in/100.0f;
                            System.out.println("The amount is "+op);
                            System.exit(0);
                        case 2:
                            float in1,op1;
                            System.out.println("Enter the amount in pound");
                            in1=sc.nextFloat();
                            op1=in1*100.00f;
                            System.out.println("The amount is "+op1);
                            System.exit(0);
                        default:
                            System.out.println("INVALID INPUT!");
                            System.exit(0);
                    }
                    break;
                case 3:
                    int id3;
                    System.out.println("usd to pound type 1 or pound to usd type 2 ");
                    id3=sc.nextInt();
                    switch (id3) {
                        case 1:
                            float in,op;
                            System.out.println("Enter the amount in usd");
                            in=sc.nextFloat();
                            op=in/1.32f;
                            System.out.println("The amount is "+op);
                            System.exit(0);
                        case 2:
                            float in1,op1;
                            System.out.println("Enter the amount in pound");
                            in1=sc.nextFloat();
                            op1=in1*1.32f;
                            System.out.println("The amount is "+op1);
                            System.exit(0);
                        default:
                            System.out.println("INVALID INPUT!");
                            System.exit(0);
                    }
            }
        }
    }
    void main()
    {
        conv obj=new conv();
        Scanner sc=new Scanner(System.in);
        String input2;
        String convo_type;
        System.out.println("---WELCOME TO CONVO---");
        System.out.println("The ultimate compact convertor");
        System.out.println("Type Primary_run to access computer conversions");
        System.out.println("Type secondary_run to access currency conversion");
        convo_type=sc.nextLine();
        if(convo_type.equals("Primary_run"))
        {
          obj.primary();
        }
        if(convo_type.equals("secondary_run"))
        {
            obj.secondary();
        }
     }
     public static void main(String[] args) {
        conv ob=new conv();
        ob.main();
     }
    }