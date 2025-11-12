import java.util.*;


public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        for (int i = list.size() -1 ; i > 0 ; i --){
            if (list.get(i).equals(value)){
                return i;
            }
        }
        return null;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null){
            return null;
        }
        return list.indexOf(value) != -1 ?list.indexOf(value): null ;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (list == null){
            return new ArrayList<>();
        }
        List<Integer> lista = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i ++){
            if (list.get(i).equals(value)){
                lista.add(i);
            }
        }
        return lista;
    }
}