import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public interface Search {
    public static int binarySearch(ArrayList<Book> c, int l,int r,String x){
        Sort.bubbleSortName(c);
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (c.get(mid).getName().equals(x) )
                return mid;

            if(c.get(mid).getName().compareTo(x) > 0 )
                return binarySearch(c,l,mid-1,x);

            return binarySearch(c,mid+1,r,x);

        }

        // Trong trường hợp không tìm thấy
        return -1;
    }
     public static void regularSearch(String bookName,ArrayList<? extends Book> c) {
         int findIndex=-1;
        for(int i =0;i<c.size();i++){
            if(c.get(i).getName().equals(bookName)){
                findIndex=i;
            }
        }
        if(findIndex!=-1){
            System.out.println("The price of "+c.get(findIndex).getName()+" book is "+c.get(findIndex).getPrice());
        }else{
            System.out.println("can't find the book: "+bookName);
        }
    }
    public static int countBookLanguage(String bookLanguage,ArrayList<? extends Book> c){
         int countBook=0;
         for(int i=0;i<c.size();i++){
             if(c.get(i) instanceof ProgrammingBook){
                 ProgrammingBook proBook=(ProgrammingBook)c.get(i);
                 if(proBook.getLanguage().equals("Java")){
                     countBook++;
                 }
             }
         }
         return countBook;
    }
}
