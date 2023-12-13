import java.util.ArrayList;
import java.util.List;

class ContactsList {
    private List<Contact> contacts;

    public ContactsList() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    // Создание снимка текущего состояния списка контактов
    public ContactsListMemento createMemento() {
        return new ContactsListMemento(new ArrayList<>(contacts));
    }

    // Восстановление списка контактов из снимка
    public void restoreFromMemento(ContactsListMemento memento) {
        contacts = memento.getContacts();
    }
}
