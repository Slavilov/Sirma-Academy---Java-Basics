import java.util.*;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public String getInfo() {
        return String.format("%s %s is %d years old", firstName, lastName, age);
    }
}

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) break;

            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];

            students.add(new Student(firstName, lastName, age, hometown));
        }

        String filterCity = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equalsIgnoreCase(filterCity)) {
                System.out.println(student.getInfo());
            }
        }
    }
}
