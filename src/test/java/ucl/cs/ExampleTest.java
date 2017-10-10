package ucl.cs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class ExampleTest {

  @Test
  public void canAnswerTheUniversalQuestion() {
    assertThat(new Example().answer(), is(42));
  }

  @Test
  public void whenInitIsEmpty() {
    assertThat(new Example().list.isEmpty(), is(true));
  }

  @Test
  public void canAddItem() {
    Example example = new Example();
    int length = example.list.size();
    example.addItem("NewItem");
    assertThat(example.list.size(), is(length+1));
  }

  @Test
  public void canGetItem() {
    Example example = new Example();
    example.addItem("NewItem");
    assertThat(example.getItem("NewItem"), is("NewItem"));
  }

  @Test
  public void mostRecentIsFirst() {
    Example example = new Example();
    example.addItem("SecondItem");
    example.addItem("FirstItem");
    assertThat(example.list.get(0), is("FirstItem"));
  }

  @Test
  public void moveDuplicates() {
    Example example = new Example();
    example.addItem("SecondItem");
    example.addItem("FirstItem");
    example.addItem("SecondItem");
    assertThat(example.list.get(0), is("SecondItem"));
    assertThat(example.list.size(), is(2));
  }

}
