package java8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		// Define a Predicate to filter names that start with 'A'
		Predicate<String> startsWithA = name -> name.startsWith("A");

		// Use the Predicate to filter the list
		List<String> filteredNames = names.stream().filter(startsWithA).collect(Collectors.toList());

		System.out.println(filteredNames); // Output: [Alice]
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Define a Function to square a number
		Function<Integer, Integer> square = num -> num * num;

		// Use the Function to transform the list
		List<Integer> squaredNumbers = numbers.stream().map(square).collect(Collectors.toList());

		System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
	}
}

 class Consu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me");

        // Define a Consumer to handle the button click event
        Consumer<ActionEvent> buttonClickHandler = event -> System.out.println("Button clicked!");

        // Register the event handler
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClickHandler.accept(e);
            }
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}