/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;


public class Algorithm {
    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    
                }
            }
        }
    }
    
    public int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, right);
        }
        
    }

    public int linearSearch(int[] arr, int target){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
  
}