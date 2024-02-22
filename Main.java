import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        class UserInput {
            Scanner scanner = new Scanner(System.in);

            public int promptInt(String message) {
                System.out.println(message);
                String userInput = scanner.nextLine();

                int userInt = 0;
                boolean isInt = false;
                while (!isInt) {
                    try {
                        userInt = Integer.parseInt(userInput);
                        isInt = true;
                    } catch (NumberFormatException e) {
                        System.out.println(userInput + " is not a valid integer. " + message);
                        userInput = scanner.nextLine();
                    } finally {
                        System.out.println("This line is always executed.");
                    }
                }

                return userInt;
            }
        }
    }


    class User {
        Scanner scanner = new Scanner(System.in);

        public int promptDouble(String message) {
            System.out.println(message);
            String userInput = scanner.nextLine();

            int userInt = 0;
            boolean isInt = false;
            while (!isInt) {
                try {
                    userInt = Integer.parseInt(userInput);
                    isInt = true;
                } catch (NumberFormatException e) {
                    System.out.println(userInput + " is not a valid integer. " + message);
                    userInput = scanner.nextLine();
                } finally {
                    System.out.println("This line is always executed.");
                }
            }

            return userInt;
        }

    }
}
class User {
    Scanner scanner = new Scanner(System.in);

    public int promptString(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            } finally {
                System.out.println("This line is always executed.");
            }
        }

        return userInt;
    }
}
