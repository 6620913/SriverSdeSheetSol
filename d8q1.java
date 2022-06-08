

class meeting{
    
    int start;
    int end;
    int pos;
    
    meeting(int start, int end, int pos){
        
        this.start = start;
        this.end = end;
        this.pos = pos;
        
        
    }
    
}

class meetingComparator implements Comparator<meeting>{
    
    @Override
    public int  compare(meeting o1,meeting o2){
        
        if (o1.end <o2.end){
            return -1;
        }else if(o1.end>o2.end){
            return 1;
        }
        else if(o1.pos<o2.pos){
            return -1;
        }
        else{
            return 1;
        }
    }
}


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        ArrayList<meeting> m = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            meeting t = new meeting(start[i],end[i],i+1);
            m.add(t);
        }
        meetingComparator mc = new meetingComparator();
        Collections.sort(m,mc);
        
        int c =0;
        
        int limit = -1;
        
        for(int i=0;i<m.size();i++){
            if(m.get(i).start>limit){
                c++;
                limit=m.get(i).end;
            }
        }
        
        
        
        return c;
        
        
        
        
        
        
        
    }
}

