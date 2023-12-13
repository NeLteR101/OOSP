import java.util.List;

class ContactsListMemento {
    private List<Contact> contacts;

    public ContactsListMemento(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}