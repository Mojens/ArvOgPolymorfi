package AnimalBoarding;

import java.util.Scanner;

public class AnimalBoarding {
  public static void main(String[] args) {
    Animal animals[] = new Animal[20];
/*
    Cat c = new Cat();
    c.setName("c");
    Dog d = new Dog();
    d.setName("d");
    String s = new String("Text");
    Scanner scn = new Scanner(System.in);
*/
    animals[0] = new Cat();
    animals[0].setName("0");
/*
    animals[1] = new Cat();
    animals[1].setName("1");
    animals[2] = new Dog();
    animals[2].setName("2");
    animals[3] = new Rabbit();
    animals[3].setName("3");
    animals[4] = c;
    animals[4].setName("c");
    animals[12] = d;
    animals[12].setName("d");
*/
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] != null) {
        /*
        System.out.println("Animal # " + i + " is called " + animals[i].getName() + " and is a " +
            animals[i].getClass().getName());
        */

        // animals[i].doAnimalStuff();



        String animalType = "";
        if (animals[i] instanceof Cat) {
          animalType = "Kat";
          ((Cat) animals[i]).scratch();
        }
        else if (animals[i] instanceof Dog) {
          animalType = "Hund";
          Dog newDog = ((Dog) animals[i]);
          newDog.bark();
          newDog.setName("New name");

        }
        else if (animals[i] instanceof Rabbit) {
          animalType = "Kanin";
          ((Rabbit) animals[i]).jump();
        }
        System.out.println("Animal # " + i + " is called " + animals[i].getName() + " and is a " +
            animalType + "\n");

      }
    }
  }
}

