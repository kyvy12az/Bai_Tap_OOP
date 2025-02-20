package Bai2_2;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
        Author author2 = new Author("Stephen King", "stephenking@example.com", 'M');
        Author[] authors = {author1, author2};

        Book book = new Book("Best Sellers Collection", authors, 29.99, 100);

        System.out.println(book);  // Kiểm tra toString()
        System.out.println("Author Names: " + book.getAuthorNames());  // Kiểm tra danh sách tác giả
    }
}
