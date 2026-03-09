import java.util.Scanner;
import java.util.Stack;

class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker App (UC5)!");
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Create a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}