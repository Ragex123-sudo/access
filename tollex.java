package main;
import java.time.LocalDate;
import java.util.Scanner;
public class tollex
{
   
        void run()
        {
        String GREEN = "\u001B[32m";
       String RESET = "\u001B[0m";
       String BLUE="\u001B[34m";
       String RED="\u001B[31m";
        int n=0;
        int  command=0;
        String user_name;
        System.out.println(BLUE+"---------------------------------"+RESET);
        System.out.println(RED+"---   _     _   |   |   |-- -   -"+RESET);
        System.out.println(RED+" |  |   | |   | |   |   |--   x "+RESET);
        System.out.println(RED+" |    -     -   |__ |__ |__ -   -"+RESET);
        System.out.println(BLUE+"---------------------------------"+RESET);
        System.out.println(GREEN +"This the beta version of tollex "+RESET);
        System.out.println(GREEN+"Stay tuned at github ragex123-sudo for updates"+RESET);
        System.out.println(GREEN+"A project by Ragex-sudo  Copyright (c) 2026 All rights reserved 2026 "+RESET);
        try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Enter your user name");
         user_name=scanner.nextLine();
         System.out.println("Welcome"+user_name);
            System.out.println("PRESS 1 TO CONTINUE WITH TOOLLEX");
             n=scanner.nextInt();
             if(n==1)
             {
              System.out.println("Enter the specified number to perform the specific operation");
              System.out.println("124.Passco(password generator");
              System.out.println("121.Passco(password strength checker");
              System.out.println("123.Calculator");
              System.out.println("122.PASSCRACKER");
              System.out.println("120.Know current date");
              command=scanner.nextInt();
              if(command==124)
              {
                char c1;
        int a;
         System.out.println("---WELCOME TO PASSCO---");
        System.out.println("All rights reserved 2026 :P");
        System.out.println("DO YOU WANT TO CREATE A NEW PASSWORD");
        System.out.println("PRESS Y TO CONTINUE");
        System.out.println("PRESS N TO CHECK OUT OUR OTHER FEATURES");
        System.out.println("NOTE: Passco is developed using  java programming language and so be careful with entering your choice y and Y will treated differently");
        c1=scanner.next().charAt(0);// character input
        switch(c1)
        {
            case 'Y':
                System.out.println("8 character password or 6 character password");
                a=scanner.nextInt();
                if(a==8){
                         int min = 10;
                         int max = 50;
                         int randomNumber = (int)(Math.random() * (max - min + 1)) + min; // Formula for a general range
                         System.out.print(randomNumber);//2 characters
                        int min1 = 65;
                        int max1 = 90;
                         int randomNumber1 = (int)(Math.random() * (max1 - min1 + 1)) + min1; 
                         char ch=(char)randomNumber1;//1 characater
                        System.out.print(ch);
                         int min2 = 97;
                         int max2 = 122;
                         int randomNumber2 = (int)(Math.random() * (max2 - min2 + 1)) + min2; 
                         char ch1=(char)randomNumber2;
                         System.out.print(ch1);//1 character
                         int min3=32;
                         int max3=47;
                         int randomNumber3=(int)(Math.random()*(max3-min3+1))+min3;
                         char ch2=(char)randomNumber3;
                         System.out.print(ch2);//1 character
                         int min4 = 100;
                         int max4 = 500;
                         int randomNumber4 = (int)(Math.random() * (max4 - min4 + 1)) + min4; // Formula for a general range
                         System.out.println( randomNumber4);
                         System.out.print("THANKS FOR CHOOSING PASSCO");//3 character 
                         break;
                        }
                else if(a==6){
                         int min = 0;
                         int max = 9;
                         int randomNumber = (int)(Math.random() * (max - min + 1)) + min; // Formula for a general range
                         System.out.print(randomNumber);//1 characters
                        int min1 = 65;
                        int max1 = 90;
                         int randomNumber1 = (int)(Math.random() * (max1 - min1 + 1)) + min1; 
                         char ch=(char)randomNumber1;//1 characater
                        System.out.print(ch);
                         int min2 = 97;
                         int max2 = 122;
                         int randomNumber2 = (int)(Math.random() * (max2 - min2 + 1)) + min2; 
                         char ch1=(char)randomNumber2;
                         System.out.print(ch1);//1 character
                         int min3=32;
                         int max3=47;
                         int randomNumber3=(int)(Math.random()*(max3-min3+1))+min3;
                         char ch2=(char)randomNumber3;
                         System.out.print(ch2);//1 character
                         int min4 = 10;
                         int max4 = 50;
                         int randomNumber4 = (int)(Math.random() * (max4 - min4 + 1)) + min4; // Formula for a general range
                         System.out.println( randomNumber4);
                         System.out.print("THANKS FOR CHOOSING PASSCO");//2 character 
                         break;
                }
                else
                {
                    System.out.println("PASSCO CAN GENERATE ONLY 6 OR 8 CHARACTER PASSWORDS AS IT IS THE MINIMAL PASSWORD LENGTH FOR ALMOST ALL PLATFORMS");
                }
            case 'N':
                   System.out.println("Passco password checker ");
                   System.out.println("Enter a password and check its strength");
                   System.out.println("Hope you havve had a good time using Passco");
                   break;
              default:
                System.out.println("INVALID INPUT");
              }
            }
            if(command==121)
            {
               Scanner scanner1 = new Scanner(System.in);
      int c = 0;
      int x = 0;
      int y = 0;
      int z = 0;
      String s1 = "";
      System.out.println("----WElCOME TO PASSCO (THE PASSWORD STRENGTH CHECKER)---");
      System.out.println("This is the beta version of Passco");
      System.out.println("the words or paraphrases in your password may be overlooked");
      System.out.println("We hope to solve this bug as soon as possible");
      System.out.println("Enter your password");
      s1 = scanner1.nextLine();
      System.out.println(" VERIFICATION---press 1 to continue or else press 0 to leave PASSWORD STRENGTH CHECKER");
      int b = scanner1.nextInt();
      if (b == 1) {
         int l = s1.length();
         if (l >= 12) {
            ++c;
         } else {
            c = 0;
         }

         for(int i = 0; i < l; ++i) {
            if (s1.charAt(i) >= 'A' || s1.charAt(i) <= 'Z') {
               ++x;
            }

            if (s1.charAt(i) >= 'a' || s1.charAt(i) <= 'z') {
               ++y;
            }

            if (s1.charAt(i) >= '0' || s1.charAt(i) <= '9') {
               ++z;
            }
         }

         if (c == 1 && x >= 1 && y >= 1 && z >= 1) {
            System.out.println("YOUR PASSWORD IS STRONG");
         } else {
            System.out.println("YOUR PASSWORD IS WEAK!!");
            System.out.println("VISIT PASSCO TO GENERATE A STRONG PASSWORD");
         }
      } else if (b == 0) {
         System.out.println("Thanks for visiting");
         System.exit(0);
      } else if (b != 1 || b != 0) {
         System.out.println("INAVALID INPUT");
         System.exit(0);
      } 
            }
        }
         if (command==123)
        {
           Scanner sc = new Scanner(System.in);
      System.out.println("---Welcome to calcex---");
      System.out.println("---THE COMMAND LINE CALCULATOR---");
      System.out.println("---Operations---");
      System.out.println("Press 1 to perform basic arithmetic operations");
      System.out.println("Press 2 to perform complex operations");
      int s = sc.nextInt();
      switch (s) {
         case 1:
            int result = 0;
            System.out.println("PRESS 'A' TO PERFORM ADDITTION");
            System.out.println("PRESS 'S' TO PERFROM SUBSTRACTION");
            System.out.println("PRESS 'M' TO PERFORM MULTIPLICATION");
            System.out.println("PRESS 'D' TO PERFORM DIVISION");
            char ch = sc.next().charAt(0);
            switch (ch) {
               case 'A':
                  System.out.println("enter a number");
                  int number1 = sc.nextInt();
                  System.out.println("Enter another number");
                  int number2 = sc.nextInt();
                  System.out.println("Adding....");
                  result = number1 + number2;
                  System.out.println("THE RESULT IS " + result);
                  break;
               case 'D':
                  System.out.println("enter a number");
                  int number_1 = sc.nextInt();
                  System.out.println("Enter another number");
                  int number_2 = sc.nextInt();
                  System.out.println("Dividing....");
                  result = number_1 / number_2;
                  System.out.println("THE RESULT IS " + result);
                  break;
               case 'M':
                  System.out.println("enter a number");
                  int n1 = sc.nextInt();
                  System.out.println("Enter another number");
                  int n2 = sc.nextInt();
                  System.out.println("Multiplying....");
                  result = n1 * n2;
                  System.out.println("THE RESULT IS " + result);
                  break;
               case 'S':
                  System.out.println("enter a number");
                  int number__1 = sc.nextInt();
                  System.out.println("Enter another number");
                  int number__2 = sc.nextInt();
                  System.out.println("Subtracting....");
                  result = number__1 - number__2;
                  System.out.println("THE RESULT IS " + result);
                  break;
            }
         case 2:
            System.out.println("PRESS 'E' TO PERFORM EXPONENTIAL OPERATIONS");
            System.out.println("PRESS 's' TO PERFROM SQUARE ROOT ");
            System.out.println("PRESS 'c'  TO PERFORM CUBE ROOT");
            char ch1 = sc.next().charAt(0);
            switch (ch1) {
               case 'E':
                  System.out.println("Input the base");
                  double an = sc.nextDouble();
                  System.out.println("Input the power");
                  double b = sc.nextDouble();
                  double cn = Math.pow(an, b);
                  System.out.println("THE RESULT IS" + cn);
                  break;
               case 'c':
                  System.out.println("Input the number");
                  double a_n = sc.nextDouble();
                  double c_n = Math.cbrt(a_n);
                  System.out.println("THE RESULT IS" + c_n);
                  break;
               case 's':
                  System.out.println("Input the number");
                  double a1 = sc.nextDouble();
                  double c1 = Math.sqrt(a1);
                  System.out.println("THE RESULT IS" + c1);
            }
         default:
            System.out.println("INVALID INPUT");
            break;
        } 
        }
        if(command==122)
        {
          int counter=0;
        String password;
        int length;
        char ch;
        Scanner scanner_1=new Scanner(System.in);
        System.out.println("----PASSCRACK----");
        System.out.println("A project by Ragex123-sudo");
        System.out.println("Copyright(c) 2026.");
        System.out.println("All rights reserved..");
        System.out.println("PLEASE ENTER AN EXAMPLEARY PASSWORD");
        password=scanner_1.nextLine();
        length=password.length();
        for(int i=0;i<length;i++)
        {
          ch=password.charAt(i);
          if(ch>='A'&& ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'||ch>='!'&&ch<='/'||ch>=':'&&ch<='@'||ch>='['&&ch<='`'||ch>='{'&&ch<='`')//main checking line
          {
            counter=counter+1;
          }
        }
        if(counter==length)
        {
            System.out.println("CRACKED!");
        }
        else
        {
            System.out.println("NOT CRACKED!!");
        }
        }
        if(command==120)
        {
         LocalDate today = LocalDate.now(); // Create a LocalDate object for the current date
        System.out.println("Current date: " + today); // Display the current date (e.g., 2026-03-24)
        }
        else
        {
         System.out.println(RED+"INVALID INPUT"+RESET);
        }
    }
    }
    public static void main(String[] args) {
        tollex obj=new tollex();
        obj.run();
    }
}
