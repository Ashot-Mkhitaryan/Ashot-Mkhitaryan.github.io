package Task1;

public class Test {
    public static void main(String[] args) {

        Person person = new Person("EPH", "Abovyan ");
        Student student = new  Student("Poghos", "Erevan", "dfd", 2019, 520000);
        Staff staff = new Staff("Poghosuhi","Hrazdan","ahaaaa",7);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());


    }
}
