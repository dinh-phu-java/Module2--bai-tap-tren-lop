import java.util.ArrayList;

public interface Sort {
    public static void bubbleSort(ArrayList<Book> c){

        for(int i=0;i<c.size();i++){
            for(int j=c.size()-1;j>i;j--){
                if(c.get(j).getPrice() > c.get(j-1).getPrice()){
                    swap(c,j,j-1);
                }
            }
        }
    }

public static void insertSort(ArrayList<Book> c){
        for(int i =0;i<c.size();i++){
            Book bookTemp=c.get(i);
            int j=i;
            while(j>0 && c.get(j-1).getPrice() < bookTemp.getPrice()){
                c.set(j,c.get(j-1));
                j--;
            }
            c.set(j,bookTemp);

        }
}
    public static void bubbleSortName(ArrayList<Book> c){
        for(int i=0;i<c.size();i++){
            for(int j=c.size()-1;j>i;j--){
                if(c.get(j).getName().compareTo(c.get(j-1).getName()) < 0){
                    swap(c,j,j-1);
                }
            }
        }
    }
public static void selectionSort(ArrayList<Book> c){
    for(int i=0; i<c.size(); i++) {
        int minArr = i;
        for(int j=i+1; j<c.size(); j++) {
            if(c.get(minArr).getPrice() < c.get(j).getPrice() ) {
                minArr = j;
            }
        }
        if(i!=minArr)
            swap(c, minArr, i);
    }

}
    public static void swap(ArrayList<Book> c, int a,int b){
        Book bookTemp= c.get(a);
        c.set(a,c.get(b));
        c.set(b,bookTemp);
    }
}
