import java.util.Random;

public class RandomCode {
  public static void main(String[] args) {
    Random r = new Random();
    int i = r.nextInt(10);
    System.out.println("The generated code is: " + i);
  }
}
