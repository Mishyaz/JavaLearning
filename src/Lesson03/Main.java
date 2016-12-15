package Lesson03;

import ru.javaVebinar.webapp.model.Contact;
import ru.javaVebinar.webapp.model.ContactType;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact(ContactType.PHONE,"123456789");
        System.out.println("contact.getValue() = " + contact.getValue());
    }
}
