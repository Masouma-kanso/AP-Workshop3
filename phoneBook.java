import java.util.ArrayList;
import java.util.List;

public class phoneBook{
    private ArrayList<contact> contacts;

    public phoneBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(contact newContact){
        for (contact contact : contacts) {
            if (contact.getNumber().equals(newContact.getNumber())) {
                return false; // Contact already exists
            }
        }
        // Add the new contact to the list
        contacts.add(newContact);
        return true; // Contact added successfully
    }
    public boolean deleteContact(String firstName, String lastName) {
        for (phoneNumber contact : contacts) {
            if (contact.getNumber().equals(firstName + " " + lastName )) {
                contacts.remove(contact);
                System.out.println("Ok");
                return true; // Contact found and removed
            }
        }
        System.out.println("Not Found");
        return false; // Contact not found
    }
    public contact findContact(String firstName, String lastName) {
        for (contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }
    public contact[] findContacts(String group) {
        List<contact> matchingContacts = new ArrayList<>();
        for (contact contact : contacts) {
            if (contact.getGroup().equals(group)) {
                matchingContacts.add(contact);
            }
        }
        if (matchingContacts.isEmpty()) {
            return null;
        }
        return matchingContacts.toArray(new contact[0]);

    }
    public void printContacts() {
        System.out.println("Contacts:");
        for (contact contact : contacts) {
            System.out.printf("%s %s (%s)%n", contact.getFirstName(), contact.getLastName(), contact.getGroup());
        }
    }
}