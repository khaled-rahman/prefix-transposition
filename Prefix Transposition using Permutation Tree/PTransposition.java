/*
 * @(#)PrefixTransposition.java
 *
 * PrefixTransposition application
 *
 * @author 
 * @version 1.00 2013/1/26
 */
package PTransposition.resources;
 
//import interfacepermutationtree.dataStructure.No;
//import interfacepermutationtree.dataStructure.Permutation;
//import interfacepermutationtree.dataStructure.PermutationTree;

import PermutationTreeStructure.*;
import DataStructure.*;


import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.*;

public class PTransposition {
    
    public static void main(String[] argv) {
    	
    	// TODO, add your application code
    	No no = new No();
    
    	try
            {
	          if (true)
	          {
	          	no.initial = Long.valueOf(System.currentTimeMillis());
	            //Long initial = Long.valueOf(System.currentTimeMillis());
	           	Long checkBuild = Long.valueOf(System.currentTimeMillis());
	            String[] args = null;
	            if (args == null) {
	              File fileReader = new File("realtest10.txt");
	              FileReader reader = new FileReader(fileReader);
	              BufferedReader leitor = new BufferedReader(reader);
	              String linha = null;
	              String total = "";
	              while ((linha = leitor.readLine()) != null) {
	                total = total + " " + linha;
	              }
			//	System.out.println("File = "+total);
	              leitor.close();
	              reader.close();
	    
	              StringTokenizer parser = new StringTokenizer(total);
	              args = new String[parser.countTokens()];
	              int i = 0;
	              while (parser.hasMoreTokens()) {
	                args[i] = parser.nextToken();
	                i++;
	              }
	            }
	    		
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
	                array[i] = Integer.parseInt(args[i]);
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
				
		 	
	            PermutationTree permutationTree = new PermutationTree();
	            No tree = permutationTree.build(array);
	            //Long middle = Long.valueOf(System.currentTimeMillis());
	    		int n = array.length;
	    		int not=0;
	    		Long checkAfterBuild = Long.valueOf(System.currentTimeMillis());
	    		//System.out.println(no.initial.longValue());
	    		//System.out.println(checkBuild.longValue());
	    		//System.out.println(checkAfterBuild.longValue());
	    		no.initial=no.initial.longValue()+checkAfterBuild.longValue() - checkBuild.longValue();	
	    		
	    		//float middle = (float)(checkAfterBuild.longValue()-checkBuild.longValue());
	    		//System.out.println("middle="+middle);
	    		Long totaltime = (Long)0.0;
	    		while (true)
	    		{
	    			No leaf = tree.s_left;
	    			int x=0, y=0, lefs = leaf.value, flag=1;
	    			int pi=2;
	    			
	    			Long loop1 = Long.valueOf(System.currentTimeMillis());
	  	
	    			Long t1 = Long.valueOf(System.currentTimeMillis());
	    			for(pi=2; pi<= n; pi++)
	    			{
	    				leaf = leaf.s_right;
	    				
	    				if(flag == 1)
	    				{
	    						
	    					if(leaf.value == lefs+1)
	    					{
	    						lefs = leaf.value;
	    						
	    					}
	    					else{
	    						x = pi;
	    						flag = 0;
	    					}
	    				}
	    				else
	    				{
	    					if (lefs == n)
	    						break;
	    					
	    					if ( leaf.value == lefs+1)
	    					{
	    					
	    						y = pi;
	    						break;
	    					}
	    				}
	    			}//this loop takes more time than in generalImplementation due to tree structure. 
	    			//System.out.println("x="+x+",y="+y);
	    			Long t0 = Long.valueOf(System.currentTimeMillis());
	    			//Long loop2 = Long.valueOf(System.currentTimeMillis());
	  				//no.initial = no.initial.longValue() + (loop2 - loop1);	
	    			if (pi == n+1)     // Identity permutation
	    			{
	    					break;
	    			}
	    			totaltime = totaltime+(t0-t1); 
	    		
	    			if(lefs < n)
	    			{
	    				
	    				tree = prefixTranspos(permutationTree, tree, x, y);
	    				
					
					
	    			}
	    			else{
	    				tree = prefixTranspos(permutationTree, tree, x, n+1);
						
	    			}
	    			
	    			
	    			
	    			not++;	
	    		}
	    		System.out.println("\n***Prefix Transposition Using Permutation Tree***\n------------------------------------------------------\n");
	    		System.out.println("Input Size : "+n+" | No of Prefix Transpositions required : "+not);
	    	
   			/*	
   			 	No leaf2 =tree.s_left;
				int a = n;
   			  	while(a-->0)
			 	{
			 		System.out.print(leaf2.value +" ");
			 		leaf2 = leaf2.s_right;
			 	}
			 	System.out.println();*/
	
	            Long end = Long.valueOf(System.currentTimeMillis());
	            float time = (float)(end.longValue() - no.initial.longValue()-totaltime);
	            System.out.println("Identity Checking Time = "+totaltime);
	            System.out.println("Total Time = "+Math.abs(time));
				//System.out.println("Total Time = "+totaltime);
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
	
	private static No prefixTranspos(PermutationTree pt, No tree, int i, int j)
	{
		ArrayList t1t2 = new ArrayList();
		ArrayList t3t4 = new ArrayList();
		t1t2 = pt.split(tree ,i);
		t3t4 = pt.split((No)t1t2.get(t1t2.size()-2),j-i+1);
		
		return (No)pt.join( (No)pt.join((No)t3t4.get(t3t4.size()-1),(No)t1t2.get(t1t2.size()-1)) ,(No)t3t4.get(t3t4.size()-2));
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

