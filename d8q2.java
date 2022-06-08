
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        	Arrays.sort(arr);
    	Arrays.sort(dep);
    	
    	int i =1;
    	int j =0;
    	int p =1;
    	int mp = 1;
    	
    	
    	while(i<n&&j<n){
    	    
    	    if(arr[i]<=dep[j]){
    	        p++;
    	        
    	       i++; 
    	        
    	    }
    	    else{
    	        p--;
    	        j++;
    	    }
    	    if(p>mp){
    	        mp=p;
    	    }
    	    
    	    
    	    
    	}
    	return mp;
        
    }
    
}
