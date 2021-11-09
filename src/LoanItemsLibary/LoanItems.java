package LoanItemsLibary;

public class LoanItems extends Application{
  String type;
  String title;

  public LoanItems(){
  }

  @Override
  public String toString() {
    return type+""+title+"\n";
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setType(String type) {
    this.type = type;
  }
}

