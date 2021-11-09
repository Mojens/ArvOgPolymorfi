package AnimalBoarding;

public abstract class Animal extends Object {
  private String name;
  private String ownerName;

  public Animal() {
    System.out.println("Constructing an animal.");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void doAnimalStuff() {
    System.out.println("Animal doing stuff.");
  }

}

