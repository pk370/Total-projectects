import java.sql.Connection;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
        static String alphaNumSort(int N, String s) {
            List<Character> characters = new ArrayList<>();
            List<Integer> transformedValues = new ArrayList<>();

            // Step 1: Transform the ASCII values based on the given conditions
            for (int i = 0; i < N; i++) {
                char c = s.charAt(i);
                int asciiValue = (int) c;
                if (asciiValue % 2 == 0) {
                    transformedValues.add(asciiValue + 20);
                } else {
                    transformedValues.add(asciiValue * 2);
                }
                characters.add(c);
            }

            // Step 2: Sort the characters based on their transformed ASCII values
            List<Integer> sortedIndices = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                sortedIndices.add(i);
            }
            Collections.sort(sortedIndices, new Comparator<Integer>() {
                public int compare(Integer i1, Integer i2) {
                    return transformedValues.get(i1) - transformedValues.get(i2);
                }
            });

            // Step 3: Construct the result string based on the sorted order
            System.out.println(sortedIndices);
            System.out.println(transformedValues);
            System.out.println(characters);
            StringBuilder result = new StringBuilder();
            for (int index : sortedIndices) {
                result.append(characters.get(index));
            }

            return result.toString();
        }

        // Non-editable part starts here
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            System.out.println(alphaNumSort(N, s));
        }
        // Non-editable part ends here

}
