import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> myBookList = new ArrayList<>();
        myBookList.add(new ProgrammingBook("Core Java 1", 2500, "Bill Gates", "Java", "Core Java"));
        myBookList.add(new ProgrammingBook("Core Java 2", 2700, "Bill Gates", "Java", "Core Java"));
        myBookList.add(new ProgrammingBook("Master PHP 7", 1700, "Amazon", "PHP", "Coginiter"));
        myBookList.add(new ProgrammingBook("C# for Beginner", 2700, "Oreilly", "C#", "pure Code"));
        myBookList.add(new ProgrammingBook("Java Design Pattern", 3700, "facebook", "Java", "Design Pattern"));
        myBookList.add(new FictionBook("Inside the earth", 3150, "Google", "Science Fiction"));
        myBookList.add(new FictionBook("Frankkenstein", 3250, "Mary Shelly", "Science Fiction"));
        myBookList.add(new FictionBook("The Invisible Man", 2590, "Wells", "Science Fiction"));
        myBookList.add(new FictionBook("Ends Game", 1690, "Orons", "Science Fiction"));

//        double totalPrice= TotalPrice.totalPrice(myBookList);
//        System.out.println("Total Price is "+ totalPrice +" USD");
//
        Scanner in = new Scanner(System.in);
////        System.out.print("What is the book you're finding: ");
////        String findBook=in.nextLine();
////        Search.regularSearch(findBook,myBookList);
//
//        int countBook= Search.countBookLanguage("Java",myBookList);
//        System.out.println("There is "+countBook+" Java language Book");
//        System.out.println("before sort:");
//
//
//
//        for (int i=0;i<myBookList.size();i++){
//            System.out.println(myBookList.get(i).toString());
//        }
        System.out.println("after sort:");
        Sort.bubbleSortName(myBookList);

//        for (int i=0;i<myBookList.size();i++){
//            System.out.println(myBookList.get(i).toString());
//        }
        System.out.print("What is the book you're finding: ");
        String binarySearch = in.nextLine();
//
        int indexBinary = Search.binarySearch(myBookList, 0, myBookList.size(), binarySearch);
        if (indexBinary != -1) {
            System.out.println("the price of " + myBookList.get(indexBinary).getName() + " is: " + myBookList.get(indexBinary).getPrice());
        } else {
            System.out.println("can't find " + binarySearch);
        }

//        Book myBook=new ProgrammingBook();
//        ProgrammingBook myPro=(ProgrammingBook)myBook;
//        System.out.println(myPro.getLanguage());
//        //System.out.println(((ProgrammingBook) myBook).getLanguage());
//
//    }
//
//    B ab= new A();


    }
}

