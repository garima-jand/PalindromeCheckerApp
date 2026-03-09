import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker App (UC6)!");
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Create a queue and a stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome!");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}