            
package PermutationTreeStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import DataStructure.No;
import DataStructure.*;
            
import java.util.ArrayList;
import java.util.LinkedList;

public class PermutationTree
{

	No no = new No();
  public No build(int[] array)
  {
    try
    {
  
      Integer k = Integer.valueOf(array.length);
      ArrayList u = new ArrayList();
      ArrayList vi = new ArrayList();
      ArrayList v = new ArrayList();
      u.add(null);
      vi.add(null);
      for (int i = 0; i < array.length; i++) {
        u.add(new No(array[i]));
        ((No)u.get(u.size() - 1)).height = 0;
        ((No)u.get(u.size() - 1)).numberDescendants = 1;
		
      }


	  int left_right=1; 
      while (k.intValue() > 1) {
        for (int i = 1; i <= Math.floor(k.intValue() / 2); i++) {
          vi.add(new No(0));

          ((No)vi.get(vi.size() - 1)).c_left = ((No)u.get(2 * i - 1));
          ((No)u.get(2 * i - 1)).parent = ((No)vi.get(vi.size() - 1));

          ((No)vi.get(vi.size() - 1)).c_right = ((No)u.get(2 * i));
          ((No)u.get(2 * i)).parent = ((No)vi.get(vi.size() - 1));
          
          
          if (left_right == 1)
          {
          	((No)vi.get(vi.size() - 1)).s_left = ((No)u.get(2 * i - 1)); // s_left left sibling unnecessary
          	((No)vi.get(vi.size() - 1)).s_right = ((No)u.get(2 * i));
          	
          	((No)u.get(2 * i - 1)).s_right = ((No)u.get(2 * i)); 
          	((No)u.get(2 * i)).s_left = ((No)u.get(2 * i - 1));// s_left left sibling unnecessary
          	
          }
          else{
          	
          	((No)vi.get(vi.size() - 1)).s_left = ((No)u.get(2 * i - 1)).s_left;// s_left left sibling unnecessary
          	((No)vi.get(vi.size() - 1)).s_right = ((No)u.get(2 * i)).s_right;
          	
          	((No)u.get(2 * i - 1)).s_right.s_right = ((No)u.get(2 * i)).s_left;
          	((No)u.get(2 * i)).s_left.s_left = ((No)u.get(2 * i - 1)).s_right;    // s_left left sibling unnecessary     	
          }
          
		  
          		
			
          if (((No)u.get(2 * i - 1)).value > ((No)u.get(2 * i)).value)
            ((No)vi.get(vi.size() - 1)).value = ((No)u.get(2 * i - 1)).value;
          else {
            ((No)vi.get(vi.size() - 1)).value = ((No)u.get(2 * i)).value;
          }

          if (((No)u.get(2 * i - 1)).height >= ((No)u.get(2 * i)).height)
            ((No)vi.get(vi.size() - 1)).height = (((No)u.get(2 * i - 1)).height + 1);
          else {
            ((No)vi.get(vi.size() - 1)).height = (((No)u.get(2 * i)).height + 1);
          }

          ((No)vi.get(vi.size() - 1)).numberDescendants = (((No)u.get(2 * i - 1)).numberDescendants + ((No)u.get(2 * i)).numberDescendants);


        }

        if (k.intValue() % 2 != 0) {
          v.add(null);
          v.add(new No(0));
          ((No)v.get(v.size() - 1)).c_left = ((No)vi.get((int)Math.floor(k.intValue() / 2)));// s_left left sibling unnecessary
          ((No)vi.get((int)Math.floor(k.intValue() / 2))).parent = ((No)v.get(v.size() - 1));

          ((No)v.get(v.size() - 1)).c_right = ((No)u.get(k.intValue()));
          ((No)u.get(k.intValue())).parent = ((No)v.get(v.size() - 1));
          
          if (left_right == 1)
          {
          	((No)v.get(v.size() - 1)).s_left = ((No)vi.get((int)Math.floor(k.intValue() / 2))).s_left;
          	((No)v.get(v.size() - 1)).s_right = ((No)u.get(k.intValue()));
          	
          	((No)vi.get((int)Math.floor(k.intValue() / 2))).s_right.s_right = ((No)u.get(k.intValue()));
          	((No)u.get(k.intValue())).s_left = ((No)vi.get((int)Math.floor(k.intValue() / 2))).s_right;
          }
          else
          {
          	((No)v.get(v.size() - 1)).s_left = ((No)vi.get((int)Math.floor(k.intValue() / 2))).s_left;
          	((No)v.get(v.size() - 1)).s_right = ((No)u.get(k.intValue())).s_right;
          	
          	((No)vi.get((int)Math.floor(k.intValue() / 2))).s_right.s_right = ((No)u.get(k.intValue())).s_left;
          	((No)u.get(k.intValue())).s_left.s_left = ((No)vi.get((int)Math.floor(k.intValue() / 2))).s_right;
          }
          
          

          if (((No)vi.get((int)Math.floor(k.intValue() / 2))).value > ((No)u.get(k.intValue())).value) {
            ((No)v.get(v.size() - 1)).value = ((No)vi.get((int)Math.floor(k.intValue() / 2))).value;
          }
          else {
            ((No)v.get(v.size() - 1)).value = ((No)u.get(k.intValue())).value;
          }

          if (((No)vi.get((int)Math.floor(k.intValue() / 2))).height >= ((No)u.get(k.intValue())).height) {
            ((No)v.get(v.size() - 1)).height = (((No)vi.get((int)Math.floor(k.intValue() / 2))).height + 1);
          }
          else {
            ((No)v.get(v.size() - 1)).height = (((No)u.get(k.intValue())).height + 1);
          }

          ((No)v.get(v.size() - 1)).numberDescendants = (((No)vi.get((int)Math.floor(k.intValue() / 2))).numberDescendants + ((No)u.get(k.intValue())).numberDescendants);

         }

        u = (ArrayList)vi.clone();

        if (k.intValue() % 2 != 0) {
          u.remove(u.size() - 1);
          u.add(v.get(1));
        }

        vi.clear();
        v.clear();
        vi.add(null);
        k = Integer.valueOf((int)Math.floor(k.intValue() / 2));
        left_right++;
      }

      return (No)u.get(1);
    } catch (Exception e) {
      System.exit(0);
    }
    return null;
  }

  public No join(No tree1, No tree2) {
    No t = new No(0);

    No t1 = new No(0);

    No t2 = new No(0);

    if (tree1 == null) {
      return tree2;
    }
    if (tree2 == null) {
      return tree1;
    }
	Long join1 = Long.valueOf(System.currentTimeMillis());
	
    if (Math.abs(tree1.height - tree2.height) <= 1)
    {
      t.c_left = tree1;
      t.c_right = tree2;
      
      
     //---------------------------------- 
      if(tree1.height == 0)
      {
      	t.s_left = tree1;
      	if(tree2.height == 0)
      	{
      		tree1.s_right = tree2;
      	}
   		else{
   			tree1.s_right = tree2.s_left;
   		}
      	
      }
      else{
      	t.s_left = tree1.s_left;
      	if(tree2.height == 0)
      	{
      		tree1.s_right.s_right = tree2;
      	}
   		else{
   			tree1.s_right.s_right = tree2.s_left;
   		}
      }
      
      if(tree2.height == 0)
      {
      	t.s_right = tree2;
      	if(tree1.height == 0)
      	{
      		tree2.s_left = tree1;
      	}
      	else{
      		tree2.s_left = tree1.s_right;
      	}
      }
      else{
      	t.s_right= tree2.s_right;
      	if(tree1.height == 0)
      	{
      		tree2.s_left.s_left = tree1;
      	}
      	else{
      		tree2.s_left.s_left = tree1.s_right;
      	}
      }
//-----------------------

      if (tree1.height >= tree2.height)
        t.height = tree1.height + 1;
      else {
        t.height = tree2.height + 1;
      }

      if (tree1.value > tree2.value)
        t.value = tree1.value;
      else {
        t.value = tree2.value;
      }

      t.numberDescendants = (t.c_right.numberDescendants + t.c_left.numberDescendants);

      t.c_left.parent = t;
      t.c_right.parent = t;

	  Long join2 = Long.valueOf(System.currentTimeMillis());
	  //no.initial = no.initial.longValue() + (join2 - join1);		
      return t;
    }

    if (tree1.height - tree2.height == 2)
    {
      if (tree1.c_left.height >= tree1.c_right.height)
      {
        t1.c_left = tree1.c_right;
        t1.c_right = tree2;
        
        //---------------
        t1.s_left = (tree1.c_right.height == 0) ? tree1.c_right : tree1.c_right.s_left;
        t1.s_right = (tree2.height == 0) ? tree2 : tree2.s_right;
        
        if(tree1.c_right.height == 0)
        {
        	tree1.c_right.s_right = (tree2.height == 0) ? tree2 : tree2.s_left;
        }
        else{
        	tree1.c_right.s_right.s_right = (tree2.height == 0) ? tree2 : tree2.s_left;
        }
        
        if(tree2.height == 0)
        {
        	tree2.s_left = (tree1.c_right.height == 0) ? tree1.c_right : tree1.c_right.s_right;
        }
        else{
        	tree2.s_left.s_left = (tree1.c_right.height == 0) ? tree1.c_right : tree1.c_right.s_right;
        }

//----------		

        if (t1.c_left.height >= t1.c_right.height)
          t1.height = (t1.c_left.height + 1);
        else {
          t1.height = (t1.c_right.height + 1);
        }

        if (t1.c_left.value >= t1.c_right.value)
          t1.value = t1.c_left.value;
        else {
          t1.value = t1.c_right.value;
        }

        t1.numberDescendants = (t1.c_right.numberDescendants + t1.c_left.numberDescendants);


        t1.c_left.parent = t1;
        t1.c_right.parent = t1;
        

        t.c_left = tree1.c_left;
        t.c_right = t1;
        
        //----------------
        t.s_left = tree1.c_left.s_left;
        t.s_right = t1.s_right;
        
        tree1.c_left.s_right.s_right = t1.s_left;
        t1.s_left.s_left = tree1.c_left.s_right;
        
        //--------------

        if (t.c_left.height >= t.c_right.height)
          t.height = (t.c_left.height + 1);
        else {
          t.height = (t.c_right.height + 1);
        }

        if (t.c_left.value > t.c_right.value)
          t.value = t.c_left.value;
        else {
          t.value = t.c_right.value;
        }

        t.numberDescendants = (t.c_left.numberDescendants + t.c_right.numberDescendants);

        t.c_left.parent = t;
        t.c_right.parent = t;
        
        Long join2 = Long.valueOf(System.currentTimeMillis());
	  	//no.initial = no.initial.longValue() + (join2 - join1);

        return t;
      }

      t1.c_left = tree1.c_left;
      t1.c_right = tree1.c_right.c_left;
      
      //--------------
      t1.s_left = (tree1.c_left.height == 0) ? tree1.c_left : tree1.c_left.s_left;
      t1.s_right = (tree1.c_right.c_left.height == 0) ? tree1.c_right.c_left : tree1.c_right.c_left.s_right;
      
      if(tree1.c_left.height == 0)
      {
      	tree1.c_left.s_right = (tree1.c_right.c_left.height == 0) ? tree1.c_right.c_left : tree1.c_right.c_left.s_left;
      }
      else{
      	
      	tree1.c_left.s_right.s_right = (tree1.c_right.c_left.height == 0) ? tree1.c_right.c_left : tree1.c_right.c_left.s_left;      
      }
      
      if (tree1.c_right.c_left.height == 0)
      {
      	tree1.c_right.c_left.s_left = (tree1.c_left.height == 0) ? tree1.c_left : tree1.c_left.s_right;
      }
      else{
      	
      	tree1.c_right.c_left.s_left.s_left = (tree1.c_left.height == 0) ? tree1.c_left : tree1.c_left.s_right;            	
      }
      
      //-------------

      if (t1.c_left.height >= t1.c_right.height)
        t1.height = (t1.c_left.height + 1);
      else {
        t1.height = (t1.c_right.height + 1);
      }

      if (t1.c_left.value >= t1.c_right.value)
        t1.value = t1.c_left.value;
      else {
        t1.value = t1.c_right.value;
      }

      t1.numberDescendants = (t1.c_left.numberDescendants + t1.c_right.numberDescendants);


      t1.c_left.parent = t1;
      t1.c_right.parent = t1;

      t2.c_left = tree1.c_right.c_right;
      t2.c_right = tree2;
      
      //--------------
      
      t2.s_left = (tree1.c_right.c_right.height == 0) ? tree1.c_right.c_right : tree1.c_right.c_right.s_left;
      t2.s_right = (tree2.height == 0) ? tree2 : tree2.s_right;
      
      if( t2.c_left.height == 0)
      {
      	t2.c_left.s_right = (t2.c_right.height == 0) ? t2.c_right : t2.c_right.s_left; 
      }
      else{
      	t2.c_left.s_right.s_right = (t2.c_right.height == 0) ? t2.c_right : t2.c_right.s_left; 
      }
      
      if(t2.c_right.height == 0)
      {
      	t2.c_right.s_left = (t2.c_left.height == 0) ? t2.c_left : t2.c_left.s_right;
      }
      else{
      	t2.c_right.s_left.s_left = (t2.c_left.height == 0) ? t2.c_left : t2.c_left.s_right;
      }
      //--------------

      if (t2.c_left.height >= t2.c_right.height)
        t2.height = (t2.c_left.height + 1);
      else {
        t2.height = (t2.c_right.height + 1);
      }

      if (t2.c_left.value >= t2.c_right.value)
        t2.value = t2.c_left.value;
      else {
        t2.value = t2.c_right.value;
      }

      t2.numberDescendants = (t2.c_left.numberDescendants + t2.c_right.numberDescendants);

    

      t2.c_left.parent = t2;
      t2.c_right.parent = t2;

      t.c_left = t1;
      t.c_right = t2;
      
      //--------
      t.s_left = t.c_left.s_left;
      t.s_right = t.c_right.s_right;
      
      t.c_left.s_right.s_right = t.c_right.s_left;
      t.c_right.s_left.s_left = t.c_left.s_right;
      //-----------

      if (t.c_left.height >= t.c_right.height)
        t.height = (t.c_left.height + 1);
      else {
        t.height = (t.c_right.height + 1);
      }

      if (t.c_left.value >= t.c_right.value)
        t.value = t.c_left.value;
      else {
        t.value = t.c_right.value;
      }

      t.numberDescendants = (t.c_right.numberDescendants + t.c_left.numberDescendants);


      t.c_left.parent = t;
      t.c_right.parent = t;
      
      Long join2 = Long.valueOf(System.currentTimeMillis());
	  //no.initial = no.initial.longValue() + (join2 - join1);

      return t;
    }

    if (tree2.height - tree1.height == 2)
    {
      if (tree2.c_left.height < tree2.c_right.height)
      {
        t1.c_left = tree1;
        t1.c_right = tree2.c_left;
        
        //---------------
        t1.s_left = (t1.c_left.height == 0) ? t1.c_left : t1.c_left.s_left;
        t1.s_right = (t1.c_right.height == 0) ? t1.c_right : t1.c_right.s_right;
        
        if( t1.c_left.height == 0)
        {
        	t1.c_left.s_right = (t1.c_right.height == 0) ? t1.c_right : t1.c_right.s_left;
        }
        else{
        	t1.c_left.s_right.s_right = (t1.c_right.height == 0) ? t1.c_right : t1.c_right.s_left;
        } 
        
        if (t1.c_right.height == 0)
        {
        	t1.c_right.s_left = (t1.c_left.height == 0) ? t1.c_left : t1.c_left.s_right;
        }
        else
        {
        	t1.c_right.s_left.s_left = (t1.c_left.height == 0) ? t1.c_left : t1.c_left.s_right;
        }	
        //---------------------

        if (t1.c_left.height >= t1.c_right.height)
          t1.height = (t1.c_left.height + 1);
        else {
          t1.height = (t1.c_right.height + 1);
        }

        if (t1.c_left.value >= t1.c_right.value)
          t1.value = t1.c_left.value;
        else {
          t1.value = t1.c_right.value;
        }

        t1.numberDescendants = (t1.c_left.numberDescendants + t1.c_right.numberDescendants);


        t1.c_left.parent = t1;
        t1.c_right.parent = t1;

        t.c_right = tree2.c_right;
        t.c_left = t1;
        
        //--------------
        t.s_left = t.c_left.s_left;
        t.s_right = t.c_right.s_right;
        
        t.c_left.s_right.s_right = t.c_right.s_left;
        t.c_right.s_left.s_left = t.c_left.s_right;
        //----------------

        if (t.c_left.height >= t.c_right.height)
          t.height = (t.c_left.height + 1);
        else {
          t.height = (t.c_right.height + 1);
        }

        if (t.c_left.value >= t.c_right.value)
          t.value = t.c_left.value;
        else {
          t.value = t.c_right.value;
        }

        t.numberDescendants = (t.c_right.numberDescendants + t.c_left.numberDescendants);


        t.c_left.parent = t;
        t.c_right.parent = t;
        
        Long join2 = Long.valueOf(System.currentTimeMillis());
	    //no.initial = no.initial.longValue() + (join2 - join1);

        return t;
      }

      if (tree2.c_left.height >= tree2.c_right.height)
      {
        t1.c_left = tree1;
        t1.c_right = tree2.c_left.c_left;
        
        //--------------
        t1.s_left = (t1.c_left.height == 0) ? t1.c_left : t1.c_left.s_left;
        t1.s_right = (t1.c_right.height == 0) ? t1.c_right : t1.c_right.s_right;
        
        if(t1.c_left.height == 0)
        {
        	t1.c_left.s_right = (t1.c_right.height == 0) ? t1.c_right : t1.c_right.s_left;
        }
        else
        {
        	t1.c_left.s_right.s_right = (t1.c_right.height == 0) ? t1.c_right : t1.c_right.s_left;
        }
        
        if(t1.c_right.height == 0)
        {
        	t1.c_right.s_left = (t1.c_left.height == 0) ? t1.c_left : t1.c_left.s_right;
        }
        else{
        	t1.c_right.s_left.s_left = (t1.c_left.height == 0) ? t1.c_left : t1.c_left.s_right;
        }
        
        //----------

        if (t1.c_left.height >= t1.c_right.height)
          t1.height = (t1.c_left.height + 1);
        else {
          t1.height = (t1.c_right.height + 1);
        }

        if (t1.c_left.value >= t1.c_right.value)
          t1.value = t1.c_left.value;
        else {
          t1.value = t1.c_right.value;
        }

        t1.numberDescendants = (t1.c_left.numberDescendants + t1.c_right.numberDescendants);


        t1.c_left.parent = t1;
        t1.c_right.parent = t1;

        t2.c_left = tree2.c_left.c_right;
        t2.c_right = tree2.c_right;
        
        //--------------
        t2.s_left = (t2.c_left.height == 0) ? t2.c_left : t2.c_left.s_left;
        t2.s_right = (t2.c_right.height == 0) ? t2.c_right : t2.c_right.s_right;
        
        if(t2.c_left.height == 0)
        {
        	t2.c_left.s_right = (t2.c_right.height == 0) ? t2.c_right : t2.c_right.s_left;
        }
        else
        {
        	t2.c_left.s_right.s_right = (t2.c_right.height == 0) ? t2.c_right : t2.c_right.s_left;
        }
        
        if(t2.c_right.height == 0)
        {
        	t2.c_right.s_left = (t2.c_left.height == 0) ? t2.c_left : t2.c_left.s_right;
        }
        else{
        	t2.c_right.s_left.s_left = (t2.c_left.height == 0) ? t2.c_left : t2.c_left.s_right;
        }
        
        //----------

        if (t2.c_left.height >= t2.c_right.height)
          t2.height = (t2.c_left.height + 1);
        else {
          t2.height = (t2.c_right.height + 1);
        }

        if (t2.c_left.value > t2.c_right.value)
          t2.value = t2.c_left.value;
        else {
          t2.value = t2.c_right.value;
        }

        t2.numberDescendants = (t2.c_left.numberDescendants + t2.c_right.numberDescendants);


        t2.c_left.parent = t2;
        t2.c_right.parent = t2;

        t.c_left = t1;
        t.c_right = t2;
        
         //--------------
        t.s_left = t.c_left.s_left;
        t.s_right = t.c_right.s_right;
        
        t.c_left.s_right.s_right = t.c_right.s_left;
        t.c_right.s_left.s_left = t.c_left.s_right;
        //----------------

        if (t.c_left.height >= t.c_right.height)
          t.height = (t.c_left.height + 1);
        else {
          t.height = (t.c_right.height + 1);
        }

        if (t.c_left.value > t.c_right.value)
          t.value = t.c_left.value;
        else {
          t.value = t.c_right.value;
        }

        t.numberDescendants = (t.c_right.numberDescendants + t.c_left.numberDescendants);


        t.c_left.parent = t;
        t.c_right.parent = t;
        
        Long join2 = Long.valueOf(System.currentTimeMillis());
	    //no.initial = no.initial.longValue() + (join2 - join1);

        return t;
      }

    }
      Long join2 = Long.valueOf(System.currentTimeMillis());
	  //no.initial = no.initial.longValue() + (join2 - join1);


    if (tree1.height - tree2.height > 2) {
    
      t = join(tree1.c_left, join(tree1.c_right, tree2));
      return t;
    }

    if (tree2.height - tree1.height > 2) {
      
      t = join(join(tree1, tree2.c_left), tree2.c_right);
      return t;
    }
    
    return null;
  }

  public ArrayList<No> split(No tree, int m) {
    ArrayList splittedTree = new ArrayList();
    ArrayList path = getpath(tree, m); // to get path of given value from tree.
    Long split1 = Long.valueOf(System.currentTimeMillis());
    if (path == null) {
      splittedTree.add(null);
      splittedTree.add(tree);
      return splittedTree;
    }
    No vo = (No)path.get(path.size() - 1);
    No vk = (No)path.get(0);
    No tr = vo;
    No tl = null;
    for (int i = path.size() - 2; i >= 0; i--) {
      if (((No)path.get(i)).c_left == path.get(i + 1)) {
        No treeParametro = ((No)path.get(i)).c_right;
        tr = join(tr, treeParametro);
      }
      if (((No)path.get(i)).c_right == path.get(i + 1)) {
        No treeParametro2 = ((No)path.get(i)).c_left;
        tl = join(treeParametro2, tl);
      }
    }
	Long split2 = Long.valueOf(System.currentTimeMillis());
	//no.initial = no.initial.longValue() + (split2 - split1);
    splittedTree.add(tr);
    splittedTree.add(tl);
    return splittedTree;
  }

  public ArrayList<No> getpath(No no, int m)
  {
  	Long path1= Long.valueOf(System.currentTimeMillis());
    if (no.numberDescendants < m) {
      return null;
    }
    ArrayList path = new ArrayList();
    No temp = no;
    path.add(no);

    while (temp.numberDescendants > 1) {
      if (temp.c_left.numberDescendants >= m)
      {
        temp = temp.c_left;
        path.add(temp);
      } else {
        m -= temp.c_left.numberDescendants;
        temp = temp.c_right;
        path.add(temp);
      }
    }
	Long path2 = Long.valueOf(System.currentTimeMillis());
	no.initial = no.initial.longValue() + (path2 - path1);
    return path;
  }

}

