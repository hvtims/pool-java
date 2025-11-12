import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        if (list1 == null || list1.length() == 0|| list2 == null|| list2.length() == 0){
            return false;
        }
        if (list1.equals(list2)){
            return true;
        }
        return false;
    }
}