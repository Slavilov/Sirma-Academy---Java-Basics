import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> grades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!grades.containsKey(name)) {
                grades.put(name, new ArrayList<Double>());
            }

            List<Double> gradeList = grades.get(name);
            gradeList.add(grade);
        }

        List<String> names = new ArrayList<>(grades.keySet());

        for (int i = 0; i < names.size(); i++) {
            String student = names.get(i);
            List<Double> studentGrades = grades.get(student);

            double sum = 0;
            for (int j = 0; j < studentGrades.size(); j++) {
                sum += studentGrades.get(j);
            }

            double average = sum / studentGrades.size();

            if (average >= 4.5) {
                System.out.printf("%s -> %.2f%n", student, average);
            }
        }
    }
}
