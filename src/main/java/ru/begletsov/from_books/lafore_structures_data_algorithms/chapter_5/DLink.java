package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5;

public class DLink {
    public int iData;
    public Link next;
    public Link previous;

    public DLink(int iData) {
        this.iData = iData;
    }

    public void displayLinkX() {
        System.out.println("{" + iData + "}");
    }
}
