import java.io.*;
import java.util.ArrayList;

public class ProgrammingBook  extends Book implements Serializable{
    private String language;
    private String frameWork;
    private ArrayList<ProgrammingBook> programmingBooks=new ArrayList<>();
    public ProgrammingBook(){

    }
    public ProgrammingBook(String name,double price,String author,String language,String frameWork){
        super(name,price,author);
        this.language=language;
        this.frameWork=frameWork;
    }



    public void setLanguage(String language){
        this.language=language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void setFrameWork(String frameWork){
        this.frameWork=frameWork;
    }
    public String getFrameWork(){
        return this.frameWork;
    }

    public ArrayList<ProgrammingBook> generateBooks(){
        programmingBooks.add(new ProgrammingBook("Core Java 1", 2500, "Bill Gates", "Java", "Core Java"));
        programmingBooks.add(new ProgrammingBook("Core Java 2", 2700, "Bill Gates", "Java", "Core Java"));
        programmingBooks.add(new ProgrammingBook("Master PHP 7", 1700, "Amazon", "PHP", "Coginiter"));
        programmingBooks.add(new ProgrammingBook("C# for Beginner", 2700, "Oreilly", "C#", "pure Code"));
        programmingBooks.add(new ProgrammingBook("Java Design Pattern", 3700, "facebook", "Java", "Design Pattern"));
        return this.programmingBooks;
    }
    @Override
    public String toString(){
        return "[Book Name: "+getName()+" , Book Price: "+getPrice()+" ]";
    }

    public void writeProgrammingBook(String pathFile,ArrayList<ProgrammingBook> programmingBooks) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(pathFile,true);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        for (int i =0;i< programmingBooks.size();i++){
            objectOutputStream.writeObject(programmingBooks.get(i));
        }
        objectOutputStream.close();
    }

    public void readProgrammingBook(String pathFile) throws IOException, ClassNotFoundException, InterruptedException {
        FileInputStream fileInputStream=new FileInputStream(pathFile);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        ProgrammingBook myProgrammingBook;
        while((myProgrammingBook=(ProgrammingBook)objectInputStream.readObject())!=null){
            System.out.println(myProgrammingBook.toString());
            Thread.sleep(1000);
        }
    }
}
