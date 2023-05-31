package patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        RealEstateAgent agent = new RealEstateAgentProxy();
        Student student1 = new Student("Popescu", 330);
        Student student2 = new Student("Smith", 500);

        agent.rentApartment(student1);
        agent.rentApartment(student2);
    }
}
