/**
 * @(#)genPrefixTransposition.java
 *
 * genPrefixTransposition application
 *
 * @author 
 * @version 1.00 2013/1/28
 */

import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Vector;
import java.*;
 
public class NewGenPrefix {
    
    public static void prefixTransposition(LinkedList lst, int x, int y, int mode)
	{
		LinkedList temp = new LinkedList();
		for(int i = 0; i<x; i++)
		{
			temp.add(lst.get(i));
		}
		for(int i = 0; i<x; i++)
		{
			lst.remove(temp.get(i));
		}
		//lst.showList();
		int ind = 0;
		if(mode == 0){
			for(int j = y-x; j<y; j++)
			{
				lst.add(j,temp.get(ind));
				ind++;
			}
		}
		else
		{
			for(int j = y-x; j<y; j++)
			{
				lst.add(temp.get(ind));
				ind++;
			}
		}
		//temp.showList();
	}   
    
    public static void main(String[] argv) {
    	
    	// TODO, add your application code
    	try
            {
	          if (true)
	          {
	            Long initial = Long.valueOf(System.currentTimeMillis());
	           	LinkedList list = new LinkedList();
	            String[] args = null;
	            if (args == null) {
	              File fileReader = new File("test.txt");
	              FileReader reader = new FileReader(fileReader);
	              BufferedReader freader = new BufferedReader(reader);
	              String line = null;
	              String total = "";
	              while ((line = freader.readLine()) != null) {
	                total = total + " " + line;
	              }
			//	System.out.println("File = "+total);
	              freader.close();
	              reader.close();
	    
	              StringTokenizer parser = new StringTokenizer(total);
	              args = new String[parser.countTokens()];
	              int i = 0;
	              while (parser.hasMoreTokens()) {
	                args[i] = parser.nextToken();
	                i++;
	              }
	            }
	    		
	    		//System.out.println("Arg length = "+args.length);
	    		
	            int[] array = null;
	    
	            if (args.length == 2) {
	              int a = Integer.parseInt(args[0]);
	              int b = Integer.parseInt(args[1]);
	              if ((mdc(a + 1, b) != 1) || (a < b))
	              {
					System.out.println("Here");
	                System.out.println("Error In Input");
					System.exit(0);
	              }
	    			
	              array = new int[a];
	              int x = b;
	              int i = 0;
	              int c = 1;
	              while (c <= a) {
	                array[i] = x;
	                c++;
	                if (c * b <= a)
	                  x = c * b;
	                else {
	                  x = c * b % (a + 1);
	                }
	                i++;
	              }
	            }
	            else if (args.length > 2) {
	              array = new int[args.length];
	              for (int i = 0; i < args.length; i++)
	              {
	                array[i] = Integer.parseInt(args[i]);
	                list.add(Integer.parseInt(args[i]));
	              }
	            }
	            else {
	              System.out.println("Error In Input");
	              System.exit(0);
	            }
	            
	            int[] validation = (int[])array.clone();
	            Arrays.sort(validation);
	            for (int i = 1; i < validation.length; i++) {
	              if (validation[(i - 1)] != i) {
	                System.out.println("Error In Input");
	                System.exit(0);
	              }
	            }
				
	            int n = array.length;
	            int not = 0;
	            
	            /*System.out.print("Main Permutation:");
	            for(int t = 0 ; t< array.length ; t++)
	    		{
	    			System.out.print(array[t]+" ");
	    		}
	    		System.out.println();
	            */
	            Long mid2 = Long.valueOf(System.currentTimeMillis());
	    		
	    		//System.out.println("Time before while = "+(mid2-initial));
	            
	            Long totaltime = (Long)0.0;
	            int c =1;
	            while (true)
	            {
	            	int x=0, y=0, lefs = (int)list.get(0), flag=1;
	    			int pi=1;
	    			
	    			Long t1 = Long.valueOf(System.currentTimeMillis());
	    			
	    	
	    			for (pi=1; pi< n ; pi++)
	    			{
	    				if(flag == 1)
	    				{
	    					int p = (int)list.get(pi);
	    					if( p == lefs+1)
	    					{
	    						lefs = (int)list.get(pi);
	    					}
	    					else
	    					{
	    						x = pi;
	    						flag = 0;
	    					}
	    				}
	    				else
	    				{
	    					if (lefs == n)
	    						break;
	    					int q = (int)list.get(pi);
	    					if ( q == lefs+1)
	    					{    					
	    						y = pi;
	    						break;
	    					}
	    				}
	    			}
	    				
	    			//System.out.println("x="+x+",y="+y+",lefs="+lefs);
	    			if (pi == n)     // Identity permutation
	    			{
	    					break;
	    			}
	    			Long t0 = Long.valueOf(System.currentTimeMillis());
	    			totaltime = totaltime+(t0-t1); 
	    			if(lefs < n)
	    			{
	    				prefixTransposition(list, x, y, 0);
					
	    			}
	    			else{
	    				prefixTransposition(list, x, n+1, 1);
						
	    			}
	    			
	    			
	    		
	    			
	    			/*for(int t = 0 ; t< n ; t++)
	    			{
	    				System.out.print(list.get(t)+" ");
	    			}
	    			System.out.println();
	    			*/
	    			
	    			not++;
	            }
	            System.out.println("\n***Prefix Transposition Using Linked List***\n-------------------------------------------------\n");
	    	
				System.out.println("Input Size : "+n+" | No of Prefix Transpositions required : "+not);
				
	            Long end = Long.valueOf(System.currentTimeMillis());
	            float time = (float)(end.longValue() - initial.longValue() - totaltime);
	            System.out.println("Identity checking Time = "+totaltime);
	            System.out.println("Total Time = "+time);
				
				
				
				System.gc();
			} else {
	            System.out.println("File Selection Error");
	          }
			
    }
		catch (IOException ex)
	    {
			System.out.println("Not Here");
	    }
    }
    
    private static int mdc(int a, int b) {
                while (a != b) {
                  if (a > b)
                    a -= b;
                  else {
                    b -= a;
                  }
                }
                return a;
              }
}
