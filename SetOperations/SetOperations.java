import java.util.*;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> seta = new HashSet<>(set1); 
        seta.addAll(set2);
        return seta;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> list1 = new ArrayList<>(set1);
        List<Integer> list2 = new ArrayList<>(set2);
        Set<Integer> sita = new HashSet<>();

        int n = Math.max(list1.size(), list2.size());

        for (int i = 0; i < n; i++) {
            if (i < list1.size() && set2.contains(list1.get(i))) {
                sita.add(list1.get(i));
            }
        }

        return sita;
    }
}