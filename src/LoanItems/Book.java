package LoanItems;

public class Book extends LoanItems{
  String type;
  String title;
  public Book(String type, String title){
    super();
    this.type = type;
    this.title = title;
  }

  @Override
  public String toString() {
    return type+"        "+title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setType(String type) {
    this.type = type;
  }
}


