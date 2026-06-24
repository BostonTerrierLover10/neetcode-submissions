class Solution {
    public int trap(int[] height) {
        int result = 0;

        for(int i = 1; i < height.length - 1; i++){
            
            int left = height[i];
            for(int j = 0; j < i; j++){
                left = Math.max(left, height[j]);
            }
                
                int right = height[i];
                for(int k = i + 1; k < height.length; k++){
                    right = Math.max(right, height[k]);
                }

                result += Math.min(left, right) - height[i];
            
            
        }
        return result;
    }
}
