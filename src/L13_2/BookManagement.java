package L13_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>(); // In-memory Storage
        boolean isCont = true;

        while (isCont) {
            System.out.println("==============Book Management===============");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve book");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Your option: ");
            int userOpt = scanner.nextInt();

            if (userOpt == 1) {
                addBook(bookList);
            } else if (userOpt == 2) {
                retrieveBook(bookList);
            } else if (userOpt == 0) {
                isCont = false;
            } else {
                System.out.println("Option not available!");
            }
        }
        System.out.println("See you next time!!!");


        // --------------------

    }

    private static void addBook(List<Book> bookList) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author Name: ");
        String authorName = scanner.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        // Save
        Book book = new Book(ISBN, title, authorName, year);
        bookList.add(book);

        // Save into File system
        String bookFilePath = System.getProperty("user.dir").concat("/book.txt");
        DataFactory.saveBookList(bookList, bookFilePath);

        List<Book> bookListFromFile = DataFactory.readBookList(bookFilePath);
        for (Book bookFromFile : bookListFromFile) {
            System.out.println(bookFromFile);
        }
    }

    private static void retrieveBook(List<Book> bookList) {
        // Retrieve | ISBN
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.print("Book ISBN to find: ");
        String toFindISBN = scanner.nextLine();
        Book foundBook = null;

        for (Book bookItem : bookList) {
            if (bookItem.getISBN().equals(toFindISBN)) {
                foundBook = bookItem;
                break;
            }
        }
        if (foundBook == null) {
            System.out.println("There is no book with ISBN: " + toFindISBN);
        } else {
            System.out.println(foundBook);
        }
    }


}
