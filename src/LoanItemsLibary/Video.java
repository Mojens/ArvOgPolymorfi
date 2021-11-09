package LoanItemsLibary;

public class Video extends LoanItems{
  String type;
  String title;
  public Video(String type, String title){
    this.type = type;
    this.title = title;
  }

  @Override
  public String toString() {
    return type+"       "+title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setType(String type) {
    this.type = type;
  }
}

