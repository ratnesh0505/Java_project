import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.cgpa, this.cgpa);
    }

    @Override
    public String toString() {
        return this.name + " " + this.cgpa;
    }
}

public class arrayDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name and cgpa of student " + (i + 1) + ": ");
            String[] input = scanner.nextLine().split(" ");
            students.add(new Student(input[0], Double.parseDouble(input[1])));
        }
        Collections.sort(students);
        System.out.println("Students sorted in descending order of cgpa: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Students eligible for placement: ");
        for (Student student : students) {
            if (student.getCgpa() >= 7.5) {
                System.out.println(student);
            }else{
                System.out.println("Students not applicable for placement " );
                System.out.println(student);

            
            }
        }
    }
}
        