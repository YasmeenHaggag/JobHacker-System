package com.week3;

public class TwoSum {
    /*public static int[] TwoSum(int arr[], int target){
        int arr2[]={0};
        for( int i=0;i< arr.length;i++){
            for(int  j=i+1;j<arr.length;j++){
                int complement=target-arr[i];
                if(arr[j]==complement)
                    return new int[] {i,j};
            }
        }
        return arr2;
    }*/
    public static int[] TwoSum(int arr[], int target) {
        int left,right=0;
        for ( left = 0; left < arr.length - 1; left++) {
            for (right = left + 1; right < arr.length; right++) {
                if (arr[left] + arr[right] == target)
                    break;
            }
        }
        return new int[]{left, right};
    }
}

