public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int n=arr.length;
        int y=0,count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                y=arr[i]+arr[j];
                if(y==x)
                {
                    count++;
                }
            }
        }
    
        return count;
        
    }
}