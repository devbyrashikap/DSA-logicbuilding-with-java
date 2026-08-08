// Intersection of two array
public class prg1 {

	public static void main(String[] args) {
           int a[]= {1,3,5,7}; 
           int b[]= {3,5,6,7};
           int i,j;
           System.out.println("intersection");
           for(i=0; i<a.length; i++)
           {
        	   for(j=0; j<b.length; j++)
        	   {
        		if(a[i]==b[j])
        		{
        			System.out.println(a[i]+" ");
        			break;
        		}
        	   }
           }
	}

}
