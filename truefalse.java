package javaDsSheet;

public class truefalse {
    class Solution {
        public static  boolean containsDuplicate(int arr[] ,int n){
           
          for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                return true;
            }
        }
    }

    return false;

     }
        
        public static void main(String[] args) {
            int n=4;
            int arr[]= {1,2,3,4};
           boolean result = containsDuplicate (arr,n);
           if(result){
            System.out.println("true");
           }else{
            System.out.println("false");
           }
        }
    }
}
    