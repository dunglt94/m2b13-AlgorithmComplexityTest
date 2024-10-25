import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        int[] frequentChars = new int[255];         // {1} : O(1)
        for (int i = 0; i < str.length(); i++) {    // {2} : O((1 + 1).n) = O(1.n) = O(n)
            int ascii = str.charAt(i);              // {3} : O(1)
            frequentChars[ascii]++;                 // {4} : O(1)
        }
        int max = 0;                                //{5} : O(1)
        char character = (char) 255;                //{6} : O(1)
        for (int j = 0; j < 255; j++) {             //{7} : O(C(1 + 1).255) = O (1.255) = O(255)
            if (frequentChars[j] > max) {           //{8}  : O(C)
                max = frequentChars[j];             //{9} : O(1)
                character = (char) j;               //{10}  : O(1)
            }
        }                                           //T(n) = O(n) + O(255) = O(n)
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
