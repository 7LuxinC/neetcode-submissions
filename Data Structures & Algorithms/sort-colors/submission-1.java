public class Solution {
    public void sortColors(int[] nums) {
        mergedSort(nums, 0, nums.length - 1); 
    }

    private void mergedSort(int[] nums, int low, int high){
        if(low >= high) return; 

        int mid = low + (high - low) / 2; 

        mergedSort(nums, low, mid); 
        mergedSort(nums, mid + 1, high ); 
        merge(nums, low, mid, high); 
    }

    private void merge(int[] nums, int low, int mid, int high){
        int[] merged = new int[high - low + 1]; 

        int l = low, r = mid + 1; 
        int k = 0; 

        while(l <= mid && r <= high){
            if(nums[l] < nums[r]) merged[k++] = nums[l++]; 
            else merged[k++] = nums[r++]; 
        }


        while(l <= mid) merged[k++] =  nums[l++]; 

        while(r <= high ) merged[k++] = nums[r++]; 

        for(int i =0, j = low; i< merged.length; i++,j++){
            nums[j] = merged[i];
        }
    }
}