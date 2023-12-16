package hw3;

public class Program {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(new Contact("Ivanov Ivan","8(999)8887766", "ivanov_ivan@mail.ru"));
        phonebook.addContact(new Contact("Petrov Petr","8(999)7776655", "petrov_petr@mail.ru"));
        phonebook.addContact(new Contact("Sidorov Sergey","8(999)6665544", "sidorov_sergey@mail.ru"));

        SerializeObjectToFile serializeObjectToFile = new SerializeObjectToFile();
        serializeObjectToFile.writeObjectToFile(phonebook);
        serializeObjectToFile.readObjectFromFile(serializeObjectToFile.getPath());
    }
}