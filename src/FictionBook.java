import java.io.*;
import java.util.ArrayList;

public class FictionBook extends Book implements Serializable {
    private String category;
    private ArrayList<FictionBook> fictionBooks=new ArrayList<>();

    public FictionBook(){

    }

    public FictionBook(String name,double price,String author,String category){
        super(name,price,author);
        this.category=category;
    }

    @Override
    public String toString(){
        return "[Book Name: "+getName()+" , Book Price: "+getPrice()+" ]";
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<FictionBook> generateBooks(){
        fictionBooks.add( new FictionBook("Inside the earth", 3150, "Google", "Science Fiction"));
        fictionBooks.add( new FictionBook("Frankkenstein", 3250, "Mary Shelly", "Science Fiction"));
        fictionBooks.add( new FictionBook("The Invisible Man", 2590, "Wells", "Science Fiction"));
        fictionBooks.add( new FictionBook("Ends Game", 1690, "Orons", "Science Fiction"));
        return fictionBooks;
    }

    public void writeFictionBook(String pathFile,ArrayList<FictionBook> fictionBooks) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(pathFile,true);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        for (int i =0;i< fictionBooks.size();i++){
            objectOutputStream.writeObject(fictionBooks.get(i));
        }
        objectOutputStream.close();
    }

    public void readFictionBook(String pathFile) throws IOException, ClassNotFoundException, InterruptedException {

        FileInputStream fileInputStream=new FileInputStream(pathFile);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        FictionBook myFicBook;
        while((myFicBook=(FictionBook) objectInputStream.readObject())!=null){
            System.out.println(myFicBook.toString());
            Thread.sleep(1000);
        }

    }
}
