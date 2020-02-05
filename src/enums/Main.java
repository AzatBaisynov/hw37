package enums;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void makeRightArray(int[] arr) {
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
    }

    public static List<Integer> makeRightLinkedList(List<Integer> arr) {
        List<Integer> newList = new LinkedList<>();
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == 0){
                newList.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) != 0){
                newList.add(arr.get(i));
            }
        }
        return newList;
    }

    public static List<Integer> makeRightArrayList(List<Integer> arr) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == 0){
                newList.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) != 0){
                newList.add(arr.get(i));
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        Random rd = new Random();

        int[] array = new int[10];
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < array.length; i ++){
            array[i] = rd.nextInt(2 - 0) + 0;
            linkedList.add(rd.nextInt(2 - 0) + 0);
            arrayList.add(rd.nextInt(2-0)+0);
        }
        for (int i : array){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(linkedList);
        System.out.println(arrayList);
        System.out.println();

        makeRightArray(array);

        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(makeRightLinkedList(linkedList));
        System.out.println(makeRightArrayList(arrayList));

    }
}
