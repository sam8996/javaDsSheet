package javaDsSheet;

import java.util.Scanner;

public class revesrearr {
    public static void reverse(int arr[],int n){
       int[] temp =new int[n];
        for (int i=0;i<n;i++){
             temp[i]=arr[n-i-1];
            }
            for(int i=0;i<n;i++){
                arr[i]= temp[i];
           }
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
reverse(arr, n);
for(int i=0;i<n;i++){
    System.out.println(arr[i]+ " ");
}
}

}
