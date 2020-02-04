public class Main {
    public static void main(String[] args) {

        Product p = new Product();
        p.setCode("testcode");
        p.setDescription("product is about ....");
        p.setPrice(19.99);
        System.out.println(p.toString());

        Book b = new Book();
        b.setAuthor("warren buffet");
        b.setPages(350);
        b.setCode("bookcode");
        b.setDescription("book is about ....");
        b.setPrice(11.56);
        System.out.println(b.toString());

        Software s = new Software();
        s.setProgrammer("Bill Gates");
        s.setOs("Windows 7");
        s.setPlatform("desktop pc");
        s.setCode("softwarecode");
        s.setDescription("software is about ..... ");
        s.setPrice(999.99);
        System.out.println(s.toString());

    }
}
