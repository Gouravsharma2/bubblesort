import java.util.*;
public class basicsorting {
  public static void bubblesort (int arr[]) {
    for(int turn = 0; turn<arr.length-1;turn++) {
      for (int j =0;j<arr.length-1-turn;j++) {
        if (arr [j]>arr [j+1]) {
          int temp = arr [j];
          arr[j] =arr [j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void printarr(int arr []) {
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i]+"");
    }
    System.out.println();
  }
  public static void main (String args []) {
    int arr[]={5,4,1,3,2,10,14,8,9,7,5,4};
    bubblesort(arr);
    printarr(arr);
  }
}