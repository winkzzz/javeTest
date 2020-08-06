package ph.mobile.training.encapsulation;

public class Person_Output {
    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(23);
        person.setName("Winky Dionisio");
        person.setSalary(32000.00);
        System.out.println(person);

    }
}
