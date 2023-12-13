import java.util.List;

class ContactsManagementApp {
    public static void main(String[] args) {
        ContactsList contactsList = new ContactsList();

        // Добавление контактов
        contactsList.addContact(new Contact("Иван Петров", "88005553535"));
        contactsList.addContact(new Contact("Илья Васильев", "89507509245"));
        System.out.println("Contacts list before backup:");
        printContacts(contactsList.getContacts());

        // Создание снимка текущего состояния
        ContactsListMemento memento = contactsList.createMemento();

        // Удаление контакта
        Contact contactToRemove = contactsList.getContacts().get(0);
        contactsList.removeContact(contactToRemove);
        System.out.println("Contacts list after removal:");
        printContacts(contactsList.getContacts());

        // Восстановление списка контактов из снимка
        contactsList.restoreFromMemento(memento);
        System.out.println("Contacts list after restoration:");
        printContacts(contactsList.getContacts());
    }

    public static void printContacts(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
        System.out.println();
    }
}