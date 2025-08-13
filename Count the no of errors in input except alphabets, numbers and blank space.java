import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int errorCount = 0;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != ' ') {
                errorCount++;
            }
        }
        System.out.println(errorCount);
    }
}
