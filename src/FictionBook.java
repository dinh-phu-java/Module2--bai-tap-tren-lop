public class FictionBook extends Book {
    private String category;

    public FictionBook(String name,double price,String author,String category){
        super(name,price,author);
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
