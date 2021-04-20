package UTS;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

class QueuePalindrome {

    public static void main(String[] args) {

        System.out.print("Input kata : ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Kata diatas merupakan kata palindrome.");
        else
            System.out.println("Kata diatas bukan kata palindrome.");

    }
}
