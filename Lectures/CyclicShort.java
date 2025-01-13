package Lectures;

import java.util.Arrays;

public class CyclicShort {
    public static void main(String[] args) {
        int[] list = {4,3,2,1};
        sort(list);
        System.out.println(Arrays.toString(list));

    }
    static void sort(int[] arr ){
        int i = 0 ;
        while ( i < arr.length){
            int correct = arr[i]-1 ;
            if ( arr[i] != arr[correct]){
                swap(arr , i ,correct);
            }else {
                i++;
            }
        }
    }
    static  void swap(int[] arr , int index ,int correct){
        int temp = arr[correct];
        arr[correct] = arr[index];
        arr[index] = temp;
    }
}
