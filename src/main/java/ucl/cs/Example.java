package ucl.cs;
import java.util.ArrayList;


public class Example {
  public ArrayList<String> list;

  public Example() {
    list = new ArrayList<String>();
  }

  public void addItem(String s) {
    int i = list.indexOf(s);
    if (i != -1) {
      list.remove(i);
    }
    list.add(0,s);
  }

  public String getItem(String s) {
    int i = list.indexOf(s);
    return list.get(i);
  }


  public int answer() {
    return 42;
  }

}