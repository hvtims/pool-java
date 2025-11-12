import java.util.*;


public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        for (int i = list.size() -1 ; i > 0 ; i --){
            if (list.get(i) == value){
                return i;
            }
        }
        return 0;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        return list.indexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i ++){
            if (list.get(i) == value){
                lista.add(i);
            }
        }
        return lista;
    }
}