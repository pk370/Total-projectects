import org.w3c.dom.ls.LSOutput;
import simple.Student;

import java.io.*;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You
// can now see whitespace characters in your code.
class Main{
//    public static void main(String[] args) {
//          int a[]={0,2,0,4,2,0,3,0,8,0};
//          int first=0;
//          int last=a.length-1;
//          while(first<last){
//              if(a[first]==0){
//                  while(a[last]==0 && first<last){
//                      last--;
//                  }
//                  System.out.println(first+":"+a[first] +"  "+last+":" +a[last]);
//                  int temp=a[first];
//                  a[first]=a[last];
//                  a[last]=temp;
//              }
//              first++;
//          }
//          if(a[last]==0){
//              int temp=a[first];
//              a[first]=a[last];
//              a[last]=temp;
//          }
//        System.out.println(a[first]+"   "+a[last]);
//        System.out.println(Arrays.toString(a));
//    }
//        public static void main(String[] args) {
//            int a[]={2,3,7,4,3,8,5};
//             Map<Integer,Integer>map=new HashMap<>();
//             for(int i=0;i<a.length;i++){
//                 int remaining=10-a[i];
//                 if(map.containsKey(remaining)){
//                     System.out.println("the indexes are "+i+" and "+map.get(remaining));
//                 }
//                 map.put(a[i],i);
//            }
//        }
//        public static void main(String[] args) {
//            for(int i=9;i>=0;i--){
//                for(int j=i;j>=0;j--){
//                    System.out.print(j+" ");
//                }
//                System.out.println();
//            }
//        }

    //this is binary search
//        public static void main(String[] args) {
//            int target=10;
//            int a[]={4,5,6,7,8,9,10};
//            int start=0;
//            int last=a.length-1;
//            System.out.println("about to enter while loop");
//            System.out.println("*************************************************************************************************************************");
//            while(start<=last){
//                System.out.println("this is the start value:"+start+" and this is the last value: "+last+"********************");
//                int mid=(start+last)/2;
//                if(a[mid]>target){
//                    last=mid-1;
//                }
//                else if(a[mid]<target){
//                    start=mid+1;
//                }
//                else{
//                    System.out.println("the index of the target number is"+mid);
//                    break;
//                }
//            }
//        }
//
    //    binary search using recursion
//        public static void main(String[] args) {
//            int target=5;
//            int a[]={4,5,6,7,8,9,10};
//            int start=0;
//            int last=a.length-1;
//            int mid=(start+last)/2;
//            System.out.println(binarySearch(a,target,start,last,mid));
//        }
//        public static int binarySearch(int arr[],int target,int start,int last,int mid){
//            if(target>arr[mid]){
//                start=mid+1;
//                mid=(start+last)/2;
//                return binarySearch(arr,target,start,last,mid);
//            }
//            else if(target<arr[mid]){
//                last=mid-1;
//                mid=(start+last)/2;
//                return binarySearch(arr,target,start,last,mid);
//            }
//            return mid;
//
//        }

//    public static void main(String[] args) {
//        int arr[]={4,6,3,7,17};
//        int max=0;
//        for(int i=0;i<arr.length-1;i++){
//            System.out.println(i+" "+(i+1)+" "+max);
//            if(Math.abs(arr[i]-arr[i+1])>max){
//                max=Math.abs(arr[i]-arr[i+1]);
//            }
//        }
//        System.out.println(max);
//    }

    public static void main(String[] args) {
        String a="abc";
        String b=new String("abc");
        String c=null;
        System.out.println(a.equals(b));
    }
}


