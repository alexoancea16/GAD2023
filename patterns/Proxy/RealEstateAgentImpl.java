package patterns.Proxy;

public class RealEstateAgentImpl implements RealEstateAgent {
    @Override
    public void rentApartment(Student student) {
        // Logic for renting the apartment to the student
        System.out.println("Apartment rented to " + student.toString());
    }
}
