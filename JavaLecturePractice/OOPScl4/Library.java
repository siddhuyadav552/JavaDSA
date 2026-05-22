interface LibraryOperations {
    void issueBook(Books book, Issuer user);

    void returnBook(Books book, Issuer user);
}

class Librarian implements LibraryOperations {
    private Books[] totalBooks = new Books[100];
    private int bookCount = 0;

    @Override
    public void issueBook(Books book, Issuer user) {
        if (user.issuedBooks >= 3) {
            System.out.println("Limit reached! Cannot issue more books.");
            return;
        }
        if (book.isAvailable != true) {
            System.out.println("Not available");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            if (totalBooks[i] == book) {
                user.issuedBooks++;
                System.out.println("Successfully: " + book.bookname + " Book Issued to " + user.name);
                book.isAvailable = false;
                return;
            }
        }
        System.out.println("Book not found in stock");
    }

    @Override
    public void returnBook(Books book, Issuer user) {
        if (book.isAvailable == false) {
            book.isAvailable = true;
            user.issuedBooks--;
            System.out.println(book.bookname + "Book successfully returned by " + user.name);
            return;
        } else {
            System.out.println("Book already available, Don't need more copies");
        }

    }

    public void addBookToStock(Books book) {

        if (bookCount < totalBooks.length && book.isAvailable == true) {
            totalBooks[bookCount] = book;
            bookCount++;
            System.out.println("Success " + book.bookname + " added at position " + (bookCount));
        } else {
            System.out.println("Error: Library Stock is full Or book already available, don't need more copies.");
        }

        System.out.println("Book added to stock.");
    }

    public void showAvailableBooks() {
        System.out.println("----- Available Books ------");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + " . " + totalBooks[i].bookname);
        }
    }

}

class Books {
    String bookname;
    String Subject;
    String Author;
    private int ISBNno;
    boolean isAvailable = true;

    public Books(String bookname, String Subject, String Author, int ISBNno) {
        this.bookname = bookname;
        this.Subject = Subject;
        this.Author = Author;
        this.ISBNno = ISBNno;
    }

    public void getDetails() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Subject: " + Subject);
        System.out.println("Author: " + Author);
        System.out.println("ISBNno: " + ISBNno);
    }

}

class Issuer {
    String name;
    int issuedBooks = 0;
    int ofClass;

    public Issuer(String Name, int ofClass) {
        this.name = Name;
        this.ofClass = ofClass;
    }

}

public class Library {
    public static void main(String args[]) {

        Books book1 = new Books("MathVerse", "Math", "Siddhartha", 1836636482);
        Books book2 = new Books("MathCalc", "Math", "Arjun", 18854322);
        Books book3 = new Books("MathPlanet", "Math", "Durga", 196358412);
        Books book4 = new Books("SciencePlanet", "Science", "Gokul", 156355682);
        Books book5 = new Books("BiologyPlanet", "Biology", "Gokul", 358985682);
        Books book6 = new Books("ChemistryPlanet", "Chemistry", "Gokul", 15698742);
        Books book7 = new Books("CSPlanet", "Computer Science", "Nakul", 2555682);
        Books book8 = new Books("YogaPlanet", "Yoga", "Gokul", 156523582);
        Books book9 = new Books("HindiPlanet", "Hindi", "Gokul", 152548622);

        Issuer user1 = new Issuer("Rohan", 10);
        Issuer user2 = new Issuer("Mohan", 12);
        Issuer user3 = new Issuer("Sohan", 11);
        Issuer user4 = new Issuer("Chintu", 9);
        Issuer user5 = new Issuer("Mintu", 10);
        Issuer user6 = new Issuer("Aman", 11);
        Issuer user7 = new Issuer("Priyansh", 9);
        Issuer user8 = new Issuer("Sonika", 10);
        Issuer user9 = new Issuer("Krishna", 12);

        Librarian admin = new Librarian();
        admin.addBookToStock(book1);
        admin.addBookToStock(book2);
        admin.addBookToStock(book3);
        admin.addBookToStock(book4);
        admin.addBookToStock(book5);
        admin.addBookToStock(book6);
        admin.addBookToStock(book7);
        admin.addBookToStock(book8);
        admin.addBookToStock(book9);


        admin.issueBook(book4, user1);
        admin.returnBook(book4, user1);
        admin.issueBook(book4, user2);

    }

}
