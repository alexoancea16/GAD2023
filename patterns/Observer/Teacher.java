package patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private List<Observer> students;

    public Teacher() {
        students = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        students.add(observer);
    }

    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    public void notifyStudents(String message) {
        for (Observer student : students) {
            student.update(message);
        }
    }
}
