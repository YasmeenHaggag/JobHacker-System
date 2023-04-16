package com.week3;

public class twoSum {
    public static int[] twoSum(int arr[], int target){
        int arr2[]={0};
        for( int i=0;i< arr.length;i++){
            for(int  j=i+1;j<arr.length;j++){
                int complement=target-arr[i];
                if(arr[j]==complement)
                    return new int[] {i,j};
            }
        }
        return arr2;
    }
}
