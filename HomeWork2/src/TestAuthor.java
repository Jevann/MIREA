package author;
public class TestAuthor {
    public static void main(String[] args) {
        author.Author auth1 = new author.Author("Ivan Popov", "Mail@somewhere.com", 'm');
        auth1.setEmail("ivPopov@somewhere.com");
        System.out.println(auth1.toString());
    }
}
