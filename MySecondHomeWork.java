package qa.intro2;

import java.util.Scanner;

public class MySecondHomeWork {
    public static void main(String[] args) {
     // First task
          System.out.println("What is your name?");
          String Name = "My name is Zlatina";
                  System.out.println(Name);
                  System.out.println(Name.replace("My name is", "You are so beautiful") + "!");
     // Second task
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Are you sure?");
               String Answer = Scanner.nextLine();
               System.out.println("Do you like me?");
               String SecondAnswer = Scanner.nextLine();
                      System.out.println(Answer.equals(SecondAnswer));

     //     Third task
        String[] splited = Name.split(" ");
        System.out.println(splited.length);

      // Fourth task

        System.out.println(Answer + " " + SecondAnswer);



    }
}
