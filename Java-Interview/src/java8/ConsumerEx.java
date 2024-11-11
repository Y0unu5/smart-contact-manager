package java8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ConsumerEx {
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

		Random random = new Random();

		// Define a Supplier to generate random numbers
		Supplier<Integer> randomNumberSupplier = () -> random.nextInt(100); // Random number between 0 and 99

		// Generate and print random numbers
		System.out.println(randomNumberSupplier.get()); // Output: (Random number)
		System.out.println(randomNumberSupplier.get()); // Output: (Another random number)
		
		 // Define UnaryOperators for string manipulation
        UnaryOperator<String> toUpperCase = str -> str.toUpperCase();
        UnaryOperator<String> addExclamation = str -> str + "!";

        // Chain the operations
        Function<String, String> combinedOperation = toUpperCase.andThen(addExclamation);

        // Apply the combined operation
        String result = combinedOperation.apply("hello");
        System.out.println(result); // Output: HELLO!
	}
}
