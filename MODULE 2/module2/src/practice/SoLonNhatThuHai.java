package practice;

import java.util.*;

public class SoLonNhatThuHai {
    public static void main(String[] args) {
//        int arr[] = {8,3,8,8,6,5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = arr.length - 1; i < arr.length ; i--) {
//            if (arr[i] != arr[i-1]){
//                System.out.println("soln" + arr[i - 1]);
//                break;
//            }
//        }
//        }
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(8);
//        arr.add(1);
//        arr.add(6);
//        int
        int arr[] = {8,4,8,8,6,6,7,1};
        List<Integer> integerSet = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            integerSet.add(arr[i]);
        }
        int n =0;
        Collections.sort(integerSet);
        Collections.reverse(integerSet);
        System.out.println(integerSet);
        for (int i = 0; i < integerSet.size() ; i++) {
            if (integerSet.get(i) != integerSet.get(i+1)){
               n = integerSet.get(i+1);
                System.out.println(n);
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i]){
                System.out.println(i);
            }
        }
    }
}
