package patterns.Proxy;

public class Student {
    private String name;
    private double money;

    public Student(String name, double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student(name='" + name + "', money=" + money + ")";
    }

    public String getName() {
        return "Da";
    }
}
