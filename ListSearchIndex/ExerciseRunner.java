import java.util.List;

public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(ListSearchIndex.findLastIndex(List.of(28, 4893, 438, 54857, 4374, 4893, 48394), 4893));
        System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89));
         System.out.println(ListSearchIndex.findAllIndexes(List.of(9, 13, 89, 8, 23, 1, 0, 89), 89).toString());
    }
}