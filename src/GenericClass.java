// import java.util.*;



public class GenericClass {
    
    public static<T extends Comparable<T>> T max_array (T[] list) {
        T list1=list[0];

        for (T t : list){
            if(list1.compareTo(t)<0){
               list1=t;
            }
        }
        return list1;
    }

public static void main(String[] args) {
    

    Integer[] arr_i={2,8,30,3,4};
    Double[] arr_d={2.7,3.8,5.5,6.7,9.7};

    System.out.println(max_array(arr_i));
    System.out.println(max_array(arr_d));
}
}

