import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {
    String[] fruits = new String[] { "strawberry", "mango", "avocado", "banana", "cashew" };

    List<String> fruits2 = new ArrayList<>();
    fruits2.add("lemon");
    fruits2.add("strawberry");
    fruits2.add("avocado");

    for (String fruit : fruits2) {
      if (Arrays.asList(fruits).contains(fruit)) {
        System.out.println("the " + fruit + " fruit is repeated.");
      }
    }
  }
}
