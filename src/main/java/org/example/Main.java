package org.example;

import org.example.models.Library;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Library coustmer = new Library();
        coustmer.addBooks("A");
        coustmer.addBooks("B");
        coustmer.addBooks("C");
        //coustmer.issueBooks();
       // coustmer.returnBooks();
        coustmer.showavialbleBooks();

    }
}