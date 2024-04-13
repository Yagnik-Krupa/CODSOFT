package java_task;
    import java.util.Scanner;
    public class StudentGradeCalculator 
    {

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        int totalScore = 0;
        int numSubjects = 0;
        int subjectScore;
        double averagePercentage;
        char grade;

        System.out.println("Enter the number of subjects:");
        numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) 
        {

            System.out.println("Enter the marks obtained in subject " + i + " (out of 100):");
            subjectScore = scanner.nextInt();

            totalScore += subjectScore;

        }

        averagePercentage = (double) totalScore / numSubjects;

        if (averagePercentage >= 90) 
        {
            grade = 'A';
        } else if (averagePercentage >= 80)
         {
            grade = 'B';
        } else if (averagePercentage >= 70) 
        {
            grade = 'C';
        } else if (averagePercentage >= 60) 
        {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + totalScore);
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();

    }

}