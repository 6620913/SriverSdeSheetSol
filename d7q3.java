class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        int n = nums.length;
        if(n<3){
            return ans;
        }
        
        for(int i=0;i<n-2;i++){
            
            int l = i+1;
            int r = n-1;
            
            while(l<r){
                int t2 =nums[i]+ nums[l]+nums[r];
                
                if(t2==0){
                    List<Integer> a = new ArrayList<>();
                    
                    a.add(nums[i]);
                    a.add(nums[l]);
                    a.add(nums[r]);
                    ans.add(a);
                
                    
                    while(l<r&&nums[l]==a.get(1))
                        l++;
                    while(r>l&&nums[r]==a.get(2))
                        r--;
                    
                }
                else if(t2<0){
                    l++;
                }
                else{
                    
                    r--;
                    
                }
                
                
                
                
            }
            while(i+1<n&&nums[i]==nums[i+1]){
                i++;
            }
            
        
            
            
            
            
            
            
        }
        return ans;
        
        
        
        
    }
}
