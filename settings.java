package main;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class settings {
    static String colour ()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Available colours are::green,blue,red,orange");
      System.out.println("Enter the colour want to use");
      String input=sc.nextLine();
      if(input.equals("green"))
      {
        return "\u001B[32m";
      }
      else if (input.equals("blue"))
      {
        return "\u001B[34m";
      }
      else if (input.equals("red"))
      {
        return "\u001B[31m";
      }
      else if (input.equals("yellow"))
      {
        return "\u001B[33m";
      }
      else
      {
        return "Invalid colour input";
      }
    }
    void load()
    {
        System.out.println("The process takes some time");
        int n=1;
           // Uses the absolute, complete path to the Java factory
        com.sun.management.OperatingSystemMXBean os = 
            (com.sun.management.OperatingSystemMXBean) java.lang.management.ManagementFactory.getOperatingSystemMXBean();

        while (n<=20) {
    double load = os.getProcessCpuLoad() * 100;

    // Only print if the value is 0 or higher
    if (load >= 0) {
        System.out.printf("CPU Load: %.1f%%\n", load);
    } else {
        System.out.println("CPU Load: Calculating...");
    }

    try {
        Thread.sleep(1000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    }
    void about()
    {
        System.out.println("access version~~1.10.0(beta)");
        System.out.println("A terminal emulator project by Ragex123-sudo");
        
   }
   void network()
   {
        ProcessBuilder processBuilder = new ProcessBuilder("netstat", "-a", "-n");

        try {
            // Start the process
            Process process = processBuilder.start();

            // Read the output from the command
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                System.out.println("Fetching active connections...\n");
                
                while ((line = reader.readLine()) != null) {
                    // Print each line of the netstat output
                    System.out.println(line);
                }
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.out.println("\nProcess exited with error code: " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
   }
    static String main1()
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("--SETTINGS--");
            System.out.println("1.to change the colour of the main logo");
            System.out.println("2.To check cpu load");
            System.out.println("3.To check about");
            System.out.println("4.To check network establishment");
            int c=sc.nextInt();
            switch (c) {
                case 1:
                    String colour;
                       colour=colour();
                       return colour;
                case 2:
                       settings obj=new settings();
                       obj.load();
                case 3:
                  settings ob=new settings();
                  ob.about();
                case 4:
                    settings ob1=new settings();
                    ob1.network();
                default:
                    return "Error (:";
                    
            }
    }
        public static void main(String[] args) {
            settings ob=new settings();
           main1();
        }
}
