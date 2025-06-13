import java.util.Scanner;
public class class_quiz2 extends javax.swing.JFrame {

    public class_quiz2() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")           
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1003, 569));
        setMinimumSize(new java.awt.Dimension(1003, 569));
        getContentPane().setLayout(null);

        pack();
        setLocationRelativeTo(null);
    }                             

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option:");
        System.out.println("1. Input/Output on Console");
        System.out.println("2. Input/Output on GUI");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            runConsoleVersion();
        } else if (choice == 2) {
            swing_quiz.main(null); // Run GUI version
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

    private static void runConsoleVersion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n== Console Version ==");

        System.out.print("Enter student code: ");
        String code = sc.next();

        System.out.print("Enter student name: ");
        sc.nextLine(); // consume newline
        String name = sc.nextLine();

        System.out.print("Enter midterm score: ");
        double midterm = sc.nextDouble();

        System.out.print("Enter final score: ");
        double finalScore = sc.nextDouble();

        double avg = (midterm + finalScore) / 2.0;
        String grade = (avg >= 50) ? "Pass" : "Fail";

        System.out.println("\n--- Result ---");
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + avg);
        System.out.println("Grade: " + grade);
    }
                
}
