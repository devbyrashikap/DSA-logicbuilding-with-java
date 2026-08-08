// merge two array 
package DAY1;

public class prg2 {
    

	public static void main(String[] args) {
     int a[]= {1,4,5,6};
     int b[]= {2,8,3,7};
     int result[]=new int[a.length + b.length];
     int i,j,k=0;
     int temp;
     for(i=0; i<a.length; i++)
     {
    	 result [k]=a[i];
    	 k++;
     }
     
    	 for(j=0; j<b.length; j++)
    	 {
    		 result [k]=b[j];
    		 k++; 
    	 }
    for(i=0; i<result.length-1; i++)
    {
    	for(j=i; j<result.length; j++)
    	{
    		if(result[i]>result[j])
    		{
    			temp=result[i];
    			result[i]=result[j];
    			result[j]=temp;
    			
    		}
    	}
    }
    System.out.println("sorted merge array");
    for(Integer X: result) {
    	System.out.println(X+" ");
    }
	}

}


