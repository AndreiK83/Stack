package PhoneBook;

public class PhoneBook {
    private Person[] persons = new Person[20];

    public void addPerson(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons(){
        return this.persons;
    }
}