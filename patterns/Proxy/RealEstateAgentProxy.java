package patterns.Proxy;

    public class RealEstateAgentProxy implements RealEstateAgent {
        private RealEstateAgent realEstateAgent;

        public RealEstateAgentProxy() {
            realEstateAgent = new RealEstateAgentImpl();
        }

        @Override
        public void rentApartment(Student student) {
            if (student.getName().startsWith("P")) {
                System.out.println("The real estate agent had some issues in the past with students "
                        + "that have their names starting with the letter 'P' "
                        + "and now they refuse to rent apartments to anybody who's");
                System.out.println(student.toString() + " rented null");
            } else {
                realEstateAgent.rentApartment(student);
            }
        }
    }
