import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        phoneBook phoneBook = new phoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            switch (parts[0]) {
                case "contacts":
                    if (parts[1].equals("-a")) {
                        System.out.print("Please enter contact's group: ");
                        String group = scanner.nextLine();
                        System.out.print("Please enter contact's first name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Please enter contact's last name: ");
                        String lastName = scanner.nextLine();
                        System.out.print("Please enter contact's email: ");
                        String email = scanner.nextLine();
                        System.out.print("Please enter contact's country code: ");
                        String countryCode = scanner.nextLine();
                        System.out.print("Please enter contact's phone number: ");
                        String number= scanner.nextLine();
                        System.out.print("Please enter contact's zip code: ");
                        String zipCode = scanner.nextLine();
                        System.out.print("Please enter contact's country: ");
                        String country = scanner.nextLine();
                        System.out.print("Please enter contact's city: ");
                        String city = scanner.nextLine();

                        contact contact = new contact();
                        contact.setGroup(group);
                        contact.setFirstName(firstName);
                        contact.setLastName(lastName);
                        contact.setEmail(email);
                        contact.setphoneNumber(new phoneNumber(countryCode, number));
                        contact.setaddress(new address (zipCode, country, city));

                        if (phoneBook.addContact(contact)) {
                            System.out.println("Contact saved!");
                        } else {
                            System.out.println("Contact already exists.");
                        }
                    } else if (parts[1].equals("-r")) {
                        String firstName = parts[2];
                        String lastName = parts[3];
                        if (phoneBook.deleteContact(firstName, lastName)) {
                            System.out.println("Contact deleted successfully.");
                        } else {
                            System.out.println("Contact not found.");
                        }
                    }
                    break;
                case "show":
                    if (parts[1].equals("-g")) {
                        String group = parts[2];
                        contact[] contacts = phoneBook.findContacts(group);
                        if (contacts == null) {
                            System.out.println("No contacts found in the group.");
                        } else {
                            System.out.println("Contacts in the group \"" + group + "\":");
                            for (contact c : contacts) {
                                System.out.println(c);
                                System.out.println();
                            }
                        }
                    } else if (parts[1].equals("-c")) {
                        String firstName = parts[2];
                        String lastName = parts[3];
                        contact contact = phoneBook.findContact(firstName, lastName);
                        if (contact == null) {
                            System.out.println("Contact not found.");
                        } else {
                            System.out.println(contact);
                        }
                    } else {
                        phoneBook.printContacts();
                    }
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
