package AnimalBoarding;

import java.util.Scanner;

class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size;
    System.out.println("Enter the number of size of array");
    size = sc.nextInt();
    int[] a = new int[size];
    System.out.println("Enter the array element");
    //For reading the element
    for (int i = 0; i < size; i++) {
      a[i] = sc.nextInt();
    }
    //For print the array element
    for (int i : a) {
      System.out.print(i + " ,");
    }
  }
}
