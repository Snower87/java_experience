package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5;

public class Link {
    public int iData;
    public Link next;

    public Link(int iData) {
        this.iData = iData;
    }

    public void displayLinkX() {
        System.out.println("{" + iData + "}");
    }
}
