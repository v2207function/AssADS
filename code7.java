import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        generatePermutations("", input);
    }

    static void generatePermutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(
                        prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1)
                );
            }
        }
    }
}
