import java.util.*;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
            if (list == null) {
            return null;
        }
        List<Integer> lista = new ArrayList<>(list);
        Collections.sort(lista); 
        return lista;
    }

     public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> lista = new ArrayList<>(list); 
        Collections.sort(lista, Collections.reverseOrder());
        return lista;
    }
}