import java.util.Arrays;
public class SortArgs {
    public static void sort(String[] args) {
        int[] ghdr = new int[args.length];
        for (int i = 0 ; i< args.length ; i ++){
            ghdr[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(ghdr);
        for (int i = 0 ; i < args.length ; i ++){
            args[i] = String.valueOf(ghdr[i]);
        }
        String res = String.join(" " , args);
        System.out.println(res);


    }
}