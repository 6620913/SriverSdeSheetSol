class Solution {
    public int trap(int[] height) {
      int lm =height[0];
    int rm =height[height.length-1];
        
        int l=0;
        int r = height.length-1;
        int ans =0;
        
        
        while(l<=r){
            
            if(lm<=rm){
                
                if(height[l]>=lm){
                    lm=height[l];
                    l++;
                }
                else{
                    ans = ans +lm-height[l];
                    l++;
                }
                
                
                
                
                
            }else{
                 if(height[r]>=rm){
                    rm=height[r];
                    r--;
                }
                else{
                    ans = ans +rm-height[r];
                    r--;
                }
                
                
                
                
            }
            
            
            
            
            
        }
        return ans;
        
    }
}
