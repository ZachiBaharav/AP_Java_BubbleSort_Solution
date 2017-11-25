

/*
Visualization
https://www.youtube.com/watch?v=lyZQPjUT5B4

Talk about:

  space requirements: One temp, using inplace array
  Time requirements: O(N^2)
  Best/worst case: Random, descendent, ascendent, large/small data set
  Loop invariants
 */


public class Main {
    
    
    public static void main(String[] args)
    {
        
        // First try
        int[] A = {3,0,1,8,7,2,5,4,6,9};
        BubbleSorter b = new BubbleSorter();
        b.printArray("Before",A);

        b.sort(A);
        
        b.printArray("After",A);
        
        
        // Run on multiple randomly generated arrays
        System.out.println("\n\n**** Multiple randomly generated arrays.\n\n");
        int l = 10;
        int NTIME = 5;
        int[] a;
        for (int nTime=0; nTime<NTIME ; ++nTime) {
            a = b.randVector(l);
            b.printArray("Before",a);
            b.sort(a);
            b.printArray("After",a);
        }
        
        // Average
        System.out.println("\n\n******* Calculate average time.\n\n");
        
        l = 100;
        NTIME = 10;
        //measuring elapsed time using System.nanoTime
        long startTime = System.nanoTime();

        for (int nTime=0; nTime<NTIME ; ++nTime) {
            a = b.randVector(l);
            b.sort(a);
        }
        long elapsedTime = System.nanoTime() - startTime;
      
        System.out.println(" Avg. time to sort length " + l +" vector: "
                + (elapsedTime/1000000 ) /NTIME + "[milliSecond]");
        System.out.println(" Avg. time to sort length " + l +" vector: "
                + (elapsedTime/1000 ) /NTIME + "[microSecond]");
        
        
        // Over length
        System.out.println("\n\n******* Calculate average time for diffferent lengths!.\n\n");

        for (int ll = 100; ll < 3000; ll += 100) {
            l = ll;
            NTIME = 300;
            //measuring elapsed time using System.nanoTime
            startTime = System.nanoTime();

            for (int nTime = 0; nTime < NTIME; ++nTime) {
                a = b.randVector(l);
                b.sort(a);
            }
            elapsedTime = System.nanoTime() - startTime;

            System.out.println(ll + " , " + (elapsedTime / 1000) / NTIME);

        }
        
        // Save these (copy) into qq.csv file
        // import into excell.
        // Another column is   "=A1^2/800"  (or whatever the scaling seems to be): Compare to quadratic
        // Another column is   "=A1"  : Compare to linear
        // Insert Scatter plot with the 4 columns.
        

        
        
    }

}
