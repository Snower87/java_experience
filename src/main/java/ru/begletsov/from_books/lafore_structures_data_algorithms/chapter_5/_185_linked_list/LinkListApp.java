package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._185_linked_list;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class LinkListApp {
    public static void main(String[] args) {
        LinkListX theList = new LinkListX();
        theList.insertFirst(50);
        theList.insertFirst(40);
        theList.insertFirst(30);
        theList.insertFirst(20);
        theList.insertFirst(10);
        theList.insertFirst(0);

        theList.displayList();

        while (!theList.isEmpty())
        {
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted ");
            aLink.displayLinkX();
            System.out.println("");
        }
        theList.displayList();
    }
}
