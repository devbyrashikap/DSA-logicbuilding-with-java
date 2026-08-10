//merge two sorted array in a sorted form
package DAY1;

public class prg4 {
    

	public static void main(String[] args) {
         int a[]= {1,4,6};
         int b[]= {2,5,9};
         int result []=new int[a.length+b.length];
         int i=0,j=0,k=0;
         while(i<a.length && j<b.length)
         {
        	 if(a[i]<=b[j])
        	 {
         result [k]=a[i];
        	 k++;
        	 i++;
         }
        	 else
        	 {
        	 result [k]=b[j];
        	 k++;
         j++; 
        	 }
         }
         while(i<a.length)
         {
        	 result [k]=a.length;
        	 k++;
        	 i++;
         }
         while(j<b.length)
         {
        	 result [k]=b.length;
        	 k++;
        	 j++;
         }
         System.out.println("merge array");
         for(Integer X:result)
         {
        	 System.out.println(X+ "  ");
         }
	}

}



