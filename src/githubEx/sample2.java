package githubEx;

public class sample2 {

	public static void main(String[] args) {
		
		int ar[]= {30,20,30,10,50,25,30};
		int temp;
           int size = ar.length;
           for(int i=0;i<=size-1;i++)
           {
        	for(int j=i+1;j<=size-1;j++) 
        	{
        		if(ar[i]>ar[j]) 
        		{
        			
        			temp=ar[i];
        			ar[i]=ar[j];
        			ar[j]=temp;
        			
        			
        		}
        	
        	
        	}
       
           
           
           }
           System.out.println("second largest no"+ar[size-5]);
	}

}
