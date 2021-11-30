package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._192_linked_list2;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class LinkListApp2 {
    public static void main(String[] args) {
        LinkListX2 theList = new LinkListX2();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();
        Link f = theList.find(44);
        if (f != null)
            System.out.println("Found link with key " + f.iData);
        else {
            System.out.println("Can’t find link");
        }
        Link d = theList.delete(66);
        if (d != null) {
            System.out.println("Deleted link with key " + d.iData);
        }
        else {
            System.out.println("Can’t delete link");
        }
        theList.displayList();
    }
}
