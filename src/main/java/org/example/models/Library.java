package org.example.models;
import java.util.*;


public class Library {
    Scanner sc  = new Scanner(System.in);
    ArrayList<String> ab = new ArrayList<>();
    public void addBooks(String addedBooks){
        ab.add(addedBooks);

    }
    public void issueBooks(){

        System.out.println("Which book do you want?");
        String issued_Books = sc.nextLine();
        for(int j = 0 ; j<ab.size();j++){
            if(issued_Books.equals(ab.get(j))) {
                ab.remove(issued_Books);
                System.out.println("You have bought" + issued_Books);
            }
        }


    }
    public void returnBooks(){
        System.out.println("Enter the name of the book you want to enter");
        String returned_Books = sc.nextLine();
        ab.add(returned_Books);

    }
    public void showavialbleBooks(){
        for(int i =0 ; i<ab.size();i++){
            System.out.println(ab.get(i));
        }

    }

}


