package javaDsSheet;

import java.util.Scanner;
public class arrays1 {


public static int min(int arr[], int n) {
    int mini =Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]<mini){
            mini=arr[i];
        }
    } return mini;
} 

public static int max(int arr[], int n) {
    int max =Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    } return max;
} 



   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter size of arr");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the arr elemnts");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    int minimum =min(arr, n);
    int maximum =max(arr, n);

    

    System.out.println("minimum value is" + minimum);
    System.out.println("maximum value is" + maximum);


    
   } 
}
