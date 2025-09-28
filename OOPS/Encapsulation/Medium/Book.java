package OOPS.Encapsulation.Medium;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setIsAvailable(boolean isAvailable){
        if(title == null || title.isBlank() || author == null || author.isBlank()){
            System.out.println("Enter valid Title and Author before making book available");
        } else {
            this.isAvailable = isAvailable;
        }
    }

    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public boolean getIsAvailable(){ return isAvailable; }

    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed!");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public void display(){
        System.out.println("Book Author: " + author);
        System.out.println("Book Title: " + title);
        System.out.println("Book Status: " + (isAvailable ? "Available" : "Unavailable"));
    }
}

class Test {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        b1.setAuthor("Aditya");
        b1.setTitle("Java TextBook");
        b1.setIsAvailable(true);
        b1.borrowBook();
        b1.display();

        System.out.println("------");

        b2.setAuthor("Akhil");
        b2.setTitle("Java OOPS");
        b2.setIsAvailable(true);
        b2.returnBook(); // should say "Book was not borrowed."
        b2.display();
    }
}
