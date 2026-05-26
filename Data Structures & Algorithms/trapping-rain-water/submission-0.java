class Solution {
    public int trap(int[] height) {
        int left = 1;
        int right = height.length-2;

        int maxl = height[left-1];
        int maxr = height[right+1];

        int water = 0;

        while(left<=right)
        {
            if(maxr<=maxl)
            {
                water+=Math.max(0,maxr-height[right]);
                maxr=Math.max(maxr,height[right]);
                right--;
            }
            else
            {
                water+=Math.max(0,maxl-height[left]);
                maxl=Math.max(maxl,height[left]);
                left++;
            }
        }

        return water;
    }
}
