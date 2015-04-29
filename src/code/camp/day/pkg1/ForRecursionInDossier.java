/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.camp.day.pkg1;

/**
 *
 * @author johnrayworth
 */
public class ForRecursionInDossier {

    public static void main(String[] args) {
        int [] arr = {12, 23, 34, 35, 88, 999, 1023};
        int result = recursiveBinarySearch(arr, 34);
    }

    
    private static int recursiveBinarySearch(int [] arr, int key){
        return recursiveBinarySearchPart2(arr, key, 0, arr.length-1); 
    }
    
    
    private static int recursiveBinarySearchPart2(int[] arr, int key, int low, int high) {
          //See way below for a nicer recursiveBinarySearch, which doen't require you the user of the method
        //to send a high and a low value, which is not necessary if.... well, look below for what is needed.
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] < key) {
            return recursiveBinarySearchPart2(arr, key, mid + 1, high);
        } else if (arr[mid] > key) {
            return recursiveBinarySearchPart2(arr, key, low, mid - 1);
        } else {
            return mid;
        }
    }

}
