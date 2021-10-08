import java.lang.*;

public class Book {
    private String name;
    private String author;
    private int pages;
    private int year;

    public Book(String m, String n, int a, int b){
        name = m;
        author = n;
        pages = a;
        year = b;
}
    public Book(String m,String n){
        name = m;
        author = n;
        pages = 0;
        year = 0;
    }
    public Book(){
        name = "noname";
        author = "noauthor";
        pages = 0;
        year = 0;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String color){
        this.author = author;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }

    public int getYear(){
        return year;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name+", author of this book is "+this.author+", it has "+this.pages+" pages, year of publication is "+this.year+".";
    }
}

