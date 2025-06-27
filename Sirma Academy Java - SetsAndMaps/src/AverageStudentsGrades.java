import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            double grade = Double.parseDouble(parts[1]);

            if (!studentGrades.containsKey(name)) {
                studentGrades.put(name, new ArrayList<Double>());
            }

            List<Double> gradesList = studentGrades.get(name);
            gradesList.add(grade);
        }

        List<String> keys = new ArrayList<>(studentGrades.keySet());

        for (int i = 0; i < keys.size(); i++) {
            String student = keys.get(i);
            List<Double> grades = studentGrades.get(student);
            double sum = 0;

            System.out.print(student + " -> ");

            for (int j = 0; j < grades.size(); j++) {
                double grade = grades.get(j);
                System.out.printf("%.2f ", grade);
                sum += grade;
            }

            double average = sum / grades.size();
            System.out.printf("(avg: %.2f)%n", average);
        }
    }
}
