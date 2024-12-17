package javaDsSheet;
import java.util.Arrays;


public class chocolatedist {


    public static int mindif(int arr[],int m) {
            Arrays.sort(arr);
          
            int mindiff= Integer.MAX_VALUE;
            for(int i=0;i<arr.length-m;i++){
                int diff= arr[ i+m-1]-arr[i];
                if(diff<mindiff){
                    mindiff=diff;

                }
                // System.out.println(mindiff);
            }
        
            return mindiff;
          
          }
        


    
    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};
      int   m=3;
      mindif(arr,m);
      System.out.println(mindif(arr, m));
    }
    
}
