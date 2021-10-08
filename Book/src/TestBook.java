import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book d1=new Book("War and Peace","Lev Tolstoy", 1300, 1867);
        Book d2=new Book("Harry Potter and the Chamber of Secrets","Joanne Rowling",251, 1998);
        Book d3=new Book("1984", "George Orwell");
        d3.setYear(1949);
        d3.setPages(328);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
