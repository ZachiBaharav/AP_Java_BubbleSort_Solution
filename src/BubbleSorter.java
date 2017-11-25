
public class BubbleSorter {

    
    
    public void sort(int[] A)
    {
        
        
        // Bublle the largest to the last spot
        for (int ii=A.length; ii>0 ; --ii)
            for (int jj=0; jj<ii-1; ++jj )
                if (A[jj] > A[jj+1])
                {
                    // switch
                    int tmp = A[jj+1];
                    A[jj+1] = A[jj];
                    A[jj] = tmp;
                }
    }

    public void printArray(String msg, int[] A) {
        System.out.println(msg);
        System.out.print("[ ");
        for (int ii=0; ii<A.length-1 ; ++ii)
            System.out.print(A[ii] + " , " );
        System.out.println( A[A.length-1] + " ]; ");
    }
    
    public int[] randVector(int l) {
        int[] out = new int[l];
        for (int ii=0; ii<l ; ++ii)
            out[ii] = (int) (l*Math.random());
        return out;
    }
    
}
