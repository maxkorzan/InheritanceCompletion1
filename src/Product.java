public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable
    private Book book;
    private Software software;


    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public Software getSoftware() {
        return software;
    }
    public void setSoftware(Software software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    private double getFormattedPrice(double price) {
        this.price = price;
        return price;
        // Use the NumberFormat class to format the price to 2 decimal places
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}