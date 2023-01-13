class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1=nums1.length;
        int size2=nums2.length;
        int i=0,j=0,k=0;
        int [] mergeArray= new int[size1+size2];

        while(i<size1 && j<size2)
        {
            if(nums1[i]<nums2[j])
            {
                mergeArray[k++]=nums1[i++];
            }else{
                mergeArray[k++]=nums2[j++];
            }
        }
        while(i<size1)
        {
            mergeArray[k++]=nums1[i++];

        }
        while(j<size2)
        {
            mergeArray[k++]=nums2[j++];
        }

        int midIndex= (mergeArray.length)/2;

        if((mergeArray.length)%2==1){
            return mergeArray[(int)midIndex];
        }else{
            double median= (double) (mergeArray[midIndex-1]+mergeArray[midIndex])/2;
            return median;
        }
    }
}
