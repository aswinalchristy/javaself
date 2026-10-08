class Book {
    String title;
    double price;
    static String libraryName = "City Central Library";

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Library: " + libraryName + ", Title: " + title + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 450.0);
        Book b2 = new Book("Data Structures", 550.0);
        b1.display();
        b2.display();
    }
}