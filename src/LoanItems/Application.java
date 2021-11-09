package LoanItems;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How many loan items do you want to register? ");
    int amounRegister = Integer.parseInt(input.nextLine());
    LoanItems[] loanItems = new LoanItems[amounRegister];

    int counter = 0;
    for (int i = 0; i < loanItems.length; i++) {
      counter = counter + 1;
      System.out.println("ITEM no. " + counter);
      System.out.print("    Type (B or V): ");
      String type = input.nextLine();
      System.out.print("    Title: ");
      String title = input.nextLine();

      if (type.equalsIgnoreCase("b")) {
        loanItems[i] = new Book(type, title);
        loanItems[i].setTitle(title);
        loanItems[i].setType("Book");
      }
      if (type.equalsIgnoreCase("v")) {
        loanItems[i] = new Video(type, title);
        loanItems[i].setTitle(title);
        loanItems[i].setType("Video");
      }
    }
    System.out.println("ID" + "        " + "TYPE" + "        " + "TITLE");
    System.out.println("---------------------------");
    int counter1 = 0;
    for (LoanItems c : loanItems) {
      if (c != null) {
        counter1++;
        System.out.println(counter1 + "         " + c);
      } else if (c==null) {
        counter1++;
        System.out.println(counter1 + "        " + "The order is empty!");
      }
    }
  }
}






