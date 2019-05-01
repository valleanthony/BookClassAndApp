package com.company;
/*
Importing libs
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Scanner;

//Start of class
public class BookDB  extends  Book{


    //Empty constructor
    public BookDB() {
    }

    /*
        Initializing objects {BOOKS}
         */
    Scanner keyboard = new Scanner(System.in);

    Book b1 = new Book("Head First Java","Kathy Sierra and Bert Bates","Easy To read Java Workbook",47.50,3,true);
    Book b2 = new Book("Thinking in java","Bruce Eckel","Details about Java under the hood",20.00,2,true);
    Book b3 = new Book("OCP: Oracle Certified Profesional Java SE", "Jeanne Boyarsky","Everything you need to know in one place",45,5,true);
    Book b4 = new Book("Automate the boring stuff with Python","Al Sweigart","Fun with python",10.50,2,true);
    Book b5 = new Book("The Makers guide to the Zombie Apocalypse", "Simon Monk","Defend your base with simple circuts, Arduino and Raspberry Pi",16.50,7,true);
    Book b6 = new Book("Raspberry Pi Projects for the evil genius","Donald Norris", "A dozen fiendishly fun projects for the rasberry pi!",14.75,5, true);







    /*
      GUI to test and return the objects.
       */
    public void BookDB(){
        /*
         Adding objects into the Hashmap - <SKU (String), Books(Objects)>
        */
        HashMap<String, Book> mymap = new HashMap<String, Book>();
        mymap.put("Java1001",b1);
        mymap.put("Java1002",b2);
        mymap.put("Orcl003",b3);
        mymap.put("Python1004",b4);
        mymap.put("Zombie1005",b5);
        mymap.put("Rasp1006",b6);



        System.out.println("Please enter the SKU:");
        String skuInput = keyboard.nextLine();


        for (String key:mymap.keySet()){
            if(skuInput.equalsIgnoreCase(key)){
                System.out.println("I found the book " + mymap.get(skuInput).getBookTitle()+ " with a price of $" + mymap.get(skuInput).getPrice()+ " and it is in "+ mymap.get(skuInput).bookInStock() );
                break;
            }

            else{

            }

        }




    }



}
