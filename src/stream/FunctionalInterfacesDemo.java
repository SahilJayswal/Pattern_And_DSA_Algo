package stream;

import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        // Supplier
        Supplier<String> supplier = () -> "Java";
        
        // Consumer
        Consumer<String> consumer = lang -> System.out.println("Learning " + lang);
        
        // Predicate
        Predicate<String> predicate = lang -> lang.startsWith("J");
        
        // Function
        Function<String, Integer> function = String::length;

        // Demo
        String value = supplier.get();   // "Java"
        if (predicate.test(value)) {
            consumer.accept(value);      // "Learning Java"
            System.out.println("Length: " + function.apply(value)); // 4
        }
    }
}
