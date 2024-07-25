class Solution {
    public int[] sortArray(int[] nums) {

        int n=nums.length;
        mergesort(nums,0,n-1);
        return nums;
    }
    static void  merge(int[] nums,int start,int mid,int end)
    {
        int i,j,k;
        int n1=mid-start+1;
        int n2=end-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for( i=0;i<n1;i++)
        {
            L[i]=nums[start+i];
        }
        for(j=0;j<n2;j++)
        {
            R[j]=nums[mid+j+1];
        }
        i=0;
        j=0;
        k=start;
        while(i<n1&&j<n2)
        {
            if(L[i]<R[j])
            {
                nums[k]=L[i];
                i++;
            }
            else
            {
                nums[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            nums[k]=L[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            nums[k]=R[j];
            k++;
            j++;
        }
    }
    static void mergesort(int[] nums,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergesort(nums,start,mid);
            mergesort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
}