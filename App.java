public class App {
  public static void main(String[] args) {
    Book book1 = new Book("Harry Potter and the Chamber of Secrets", "harry.jpg", "J.K. Rowling");
    book1.showBookInfo();

    Book book2 = new Book("The Lord of the Rings", "lotr.jpg", "Tolkien");
    book2.showBookInfo();
  }
}