package amdocs.testing.automation.Level1GenericPrograms;

public class ContactBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactBook book = new ContactBook();
        book.addContact("Alice", "alice@example.com");
        book.addContact("Bob", "bob@example.com");
        book.addContact("Cathrine", "cathrine@example.com");
        book.addContact("Jane", "cathrine@example.com");
 
        System.out.println("> Find contact");
        book.findEmailAddress("Alice");
        book.findEmailAddress("Jane");
        book.listAllContacts();
 
        System.out.println("> Remove contact");
        book.deleteContact("Alice");
        book.listAllContacts();
    }

	}
