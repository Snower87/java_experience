package ru.begletsov.structure_of_data.linkedList.sergey_arkhipov;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList<Contact> contactList = new SingleLinkedList<>();

        contactList.addToEnd(new Contact(123, "Васильев Евстахий Борисович", "89028883835"));
        contactList.addToEnd(new Contact(251, "Коновалов Степан Петрович", "89042623893"));
        contactList.addToEnd(new Contact(332, "Калинин Артем Валерьевич", "89873859898"));
        contactList.addToEnd(new Contact(444, "Степанов Михаил Остапович", "89086664543"));
        contactList.addToEnd(new Contact(551, "Бендер Петр Иванович", "892430584789"));

        for (Object contact: contactList) {
            System.out.println(contact);
        }
        System.out.println("-------------------------------");
        contactList.reverse();
        for (Object contact: contactList) {
            System.out.println(contact);
        }
    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
