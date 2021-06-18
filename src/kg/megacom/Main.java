package kg.megacom;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> bookList = new LinkedList<>();

        /*Collections.addAll(bookList, "Little Prince", "Alchemist", "11/22/63", "Diamond chariot", "Theory of everything");
        System.out.println(bookList);

        bookList.remove(4);
        System.out.println(bookList);

        bookList.set(3, "Theory of everything");
        System.out.println(bookList);
        System.out.println(bookList.get(3));*/

        bookList.clear();

        Collections.addAll(bookList, "Sherlock Holmes", "Harry Potter", "Martian");
        System.out.println(bookList);

        bookList.addLast("War and peace");
        bookList.addLast("War and peace");

        bookList.addFirst("Birdsong");
        bookList.addFirst("Birdsong");
        System.out.println(bookList);

        bookList.pollFirst();
        bookList.pollLast();
        System.out.println(bookList);
    }
}
