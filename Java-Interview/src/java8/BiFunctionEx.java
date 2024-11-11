package java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionEx {
  public static void main(String[] args) {
	  // Define a BiFunction to calculate area
      BiFunction<Integer, Integer, Integer> calculateArea = (width, height) -> width * height;

      // Use the BiFunction to calculate the area of a rectangle
      int width = 5;
      int height = 10;
      int area = calculateArea.apply(width, height);

      System.out.println("Area of rectangle: " + area);
      
      // Define a BiPredicate to check if the first number is greater than the second
      BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;

      // Use the BiPredicate to compare numbers
      System.out.println(isGreater.test(10, 5)); // Output: true
      System.out.println(isGreater.test(3, 7));
      
      // Define a BiConsumer to log user actions
      BiConsumer<String, String> logAction = (user, action) -> 
          System.out.println("User: " + user + " performed action: " + action);

      // Use the BiConsumer to log user actions
      logAction.accept("Alice", "Login");
      logAction.accept("Bob", "Upload");
      
      // Define a BiOperator to concatenate two strings
      BiOperator<String> concatenate = (str, str1)-> str + str1;

      // Use the BiOperator to concatenate strings
      String result = concatenate.apply("Hello, ", "world!");
      System.out.println(result); // Output: Hello, world!
}
}
