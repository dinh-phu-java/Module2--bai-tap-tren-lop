import java.util.ArrayList;
import java.util.Collection;

public interface TotalPrice {
      static double totalPrice(ArrayList<? extends Book> c){
        double total=0;
        for (int i=0;i<c.size();i++){
            total += c.get(i).getPrice();
        }
        return total;
    }
}
