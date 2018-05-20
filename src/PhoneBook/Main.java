package PhoneBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneBook phoneBook = new PhoneBook();

        Person[] persons = new Person[20];

        Person person1 = new Person();
        person1.setName("teo");
        person1.setPhoneNumber("0723568974");

        Person person2 = new Person();
        person2.setName("vlad");
        person2.setPhoneNumber("0735698741");

        Person person3 = new Person();
        person3.setName("mirela");
        person3.setPhoneNumber("0742354125");

        persons[1] = person1;
        persons[2] = person2;
        persons[3] = person3;

        phoneBook.addPerson(persons);

        findPhoneNumberByName("MIRELA", phoneBook);
        //findPhoneNumberByName("VLAD", phoneBook);
        //findPhoneNumberByName("TEO", phoneBook);

    }

    public static void findPhoneNumberByName(String name, PhoneBook phoneBook) {

        for (int i = 0; i < 20; i++) {
            Person person = phoneBook.getPersons()[i];

            if (person != null && person.getName().equals(name)) {
                System.out.println(person.getPhoneNumber());
            }
        }
    }
}
