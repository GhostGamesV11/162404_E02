import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Z1 {
    public static void main(String[] args){
        LocalTime[] LocalTime_niesort ={
                LocalTime.of(5, 30),
                LocalTime.of(6, 20),
                LocalTime.of(7, 10),
                LocalTime.of(11, 50),
                LocalTime.of(9, 40),

        };
        LocalTime[] LocalTime_sort ={
                LocalTime.of(5, 30),
                LocalTime.of(6, 20),
                LocalTime.of(7, 10),
                LocalTime.of(6, 20),
                LocalTime.of(5, 30),

        };
        Integer[] integers_niesort = {2,8,3,8,4,9};
        Integer[] integers_sort = {1,2,3,3,2,1};


        jestPalindromem(LocalTime_niesort);
        jestPalindromem(LocalTime_sort);
        jestPalindromem(integers_niesort);
        jestPalindromem(integers_sort);

    }
    public static <T extends Comparable<? super T>>ArrayList<T> jestPalindromem(T[] tab){
        ArrayList<T> show = new ArrayList<>(List.of(tab));
        int i = 0;
        int j = tab.length - 1;
        while (j>i){
            if (tab[i].compareTo(tab[j]) != 0){
                System.out.println("To nie jest palindrom");
                return show;
            }
            i++;
            j--;
        }
        System.out.println("To jest palindrom");
        return show;
    }
}
