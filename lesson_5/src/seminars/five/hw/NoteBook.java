package seminars.five.hw;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    List<Contact> contacts  = new ArrayList<>();

    void contactAdd(Contact contact){
        contacts.add(contact);
    }

    void delContact(String name) {

    }

    void editContact(int n, Contact contact){

    }
    Contact getContactsContact(int n){
        return contacts.get(n);
    }
}
