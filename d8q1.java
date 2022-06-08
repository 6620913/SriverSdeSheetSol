
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
        
        int s=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>s){
                s=arr[i].deadline;
            }
        }
        
        
        int[] jn = new int[s];
        for(int j=0;j<s;j++){
            jn[j]=-1;
        }
        
        int max = 0;
        int jd =0;
        for(int i=0;i<n;i++){
            
            for(int j=arr[i].deadline-1;j>=0;j--){
                
                if(jn[j]==-1){
                    jn[j]=arr[i].id;
                    jd++;
                    max = max+arr[i].profit;
                    break;
                }
                
                
                
            }
            
            
            
            
            
        }
        
        
        
        
        
        
        int[] ans =new int[2];
        ans[0]=jd;
        ans[1]=max;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
