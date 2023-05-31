package patterns.Observer;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student student1 = new Student("John");
        Student student2 = new Student("Alice");
        Student student3 = new Student("Bob");

        teacher.addObserver(student1);
        teacher.addObserver(student2);
        teacher.addObserver(student3);

        teacher.notifyStudents("Hello, class! Today we will learn about history.");

        teacher.removeObserver(student2);

        teacher.notifyStudents("Next, we'll discuss mathematics.");

        teacher.addObserver(student2);

        teacher.notifyStudents("Finally, we'll have a guest speaker.");
    }
}
