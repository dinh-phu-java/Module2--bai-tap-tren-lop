import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Path pbPath= Paths.get("ProgrammingBook.dat");
        Path fbPath= Paths.get("FictionBook.dat");

            ProgrammingBook myProgrammingBook= new ProgrammingBook();
            FictionBook myFictionBook=new FictionBook();

            ArrayList<ProgrammingBook> programmingBookList= myProgrammingBook.generateBooks();
            ArrayList<FictionBook> fictionBookList=myFictionBook.generateBooks();

            Thread writePB= new Thread(){
                @Override
                public void run(){
                    try {
                        myProgrammingBook.writeProgrammingBook(String.valueOf(pbPath),programmingBookList);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread writeFB=new Thread(){
                @Override
                public void run(){
                    try {
                        myFictionBook.writeFictionBook(String.valueOf(fbPath),fictionBookList);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };


            if (Files.exists(pbPath) && Files.exists(fbPath)){
                // read file
                System.out.println("alo");
                try {
                    writeFB.start();

                    writePB.start();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }else{
                System.err.println("File not exist");
            }

    }
}

