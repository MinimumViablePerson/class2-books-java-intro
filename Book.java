public class Book {
  public String title;
  public String cover;
  public String author;

  public Book(String title, String cover, String author) {
    this.title = title;
    this.cover = cover;
    this.author = author;
  }

  void showBookInfo() {
    System.out.printf("This book is called %s by %s. You can find the cover of this book here: %s.\n", this.title,
        this.author, this.cover);
  }
}
