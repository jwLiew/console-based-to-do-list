import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        ArrayList<String> tasks = new ArrayList<>();

        do {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();  // Clear invalid input
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Add Task
                    System.out.print("Enter a new task: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    break;
                case 2:
                    // View Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No task available");
                    } else {
                        System.out.println("Your To-Do List:");
                        for (int i=0; i<tasks.size(); i++) {
                            System.out.println((i +1) + "- " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    // Remove Task
                    for (int i=0; i<tasks.size(); i++) {
                        System.out.println((i +1) + "- " + tasks.get(i));
                    }
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.print("Enter task number to delete: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Invalid input. Please enter a number: ");
                            scanner.next();  // Clear invalid input
                        }
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();

                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number. Please try again.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-4.");
            }

        } while (option != 4);

    }
}