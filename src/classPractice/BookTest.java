package classPractice;
class Author{
    private String name;
    private int age;
    private String nation;

    public Author(String name, int age, String nation){
        this.name=name;
        this.age=age;
        this.nation=nation;
    }
    public String toString(){
        return "Author [name = "+this.name+", age = "+this.age+", nation = "+nation+"]";
    }
}
class Publisher{
    private String name;
    private String nation;

    public Publisher(String name, String nation){
        this.name=name;
        this.nation=nation;
    }
    public String toString(){
        return "Publisher [name = "+this.name+", nation = "+this.nation+"]";
    }
}
class Book{
    private String title;
    private int page;
    private Author author;
    private Publisher publisher;

    public Book(String title, int page, Author author, Publisher publisher){
        this.title=title;
        this.page=page;
        this.author=author;
        this.publisher=publisher;
    }
    public String toString(){
        return "Book [title = "+this.title+", \nauthor = "+author+", \npublisher = "+publisher+", \npage = "+page+"]";
    }
}
public class BookTest {
    public static void main(String[] args) {
        Author author=new Author("Pawllo Coellyo", 75, "Brazil");
        Publisher publisher=new Publisher("문학동네", "Korea");
        Book b=new Book("연금술사", 284, author, publisher);
        System.out.println(b);
    }
}
