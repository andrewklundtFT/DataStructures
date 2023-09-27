import java.util.Scanner;
import java.util.HashMap;


public class App {
    public static void main(String[] args) throws Exception {
        boolean izGettinRunnted = true;
        int inputInt;
        String userID;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> student = new HashMap<String, String>();
        while (izGettinRunnted) {
            System.out.println("1 - Add student\n2 - Find student\n3 - Delete student\n4 - Show all Students\n5 - Exit");
            inputInt = Integer.parseInt(scanner.nextLine());
            switch (inputInt) {
                case 1:
                    System.out.println("id?");
                    userID = scanner.nextLine();
                    System.out.println("name?");
                    student.put(userID, scanner.nextLine());
                    break;
                case 2:
                    System.out.println("id?");
                    System.out.println(student.get(scanner.nextLine()));;
                    break;
                case 3:
                    System.out.println("id?");
                    student.remove(scanner.nextLine());
                    break;
                case 4:
                    for (String a : student.keySet()) {
                        System.out.println(student.get((a)));
                    }
                    break;
                case 5:
                    izGettinRunnted = false;
                    break;
            }
        }

    }

}
