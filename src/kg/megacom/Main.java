package kg.megacom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> bookList = new ArrayList<>();

        Collections.addAll(bookList, "Little Prince", "Alchemist", "11/22/63", "Diamond chariot", "Theory of everything");
        System.out.println(bookList);

        bookList.remove(4);
        System.out.println(bookList);

        bookList.set(3, "Theory of everything");
        System.out.println(bookList);
        System.out.println(bookList.get(3));

        bookList.clear();

        Collections.addAll(bookList, "Sherlock Holmes", "Harry Potter", "Martian");
        System.out.println(bookList);
    }
}
