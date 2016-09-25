 package DataStructure;

 import java.util.ArrayList;
 import java.util.LinkedList;

 public class No
 {
 		  public static Long initial;
   		  public int value;
          public int height;
          public int numberDescendants;
          public int path;
          public boolean belongsDataStructure;

          public No parent;
          public No c_left;
          public No c_right;
          public No s_left;
          public No s_right;
        
          public No()
          {
          	//initial = Long.valueOf(System.currentTimeMillis());
          }
          public No(int value)
          {
            this.value = value;
            this.c_left = null;
            this.c_right = null;
		 	this.s_left = null;
		 	this.s_right = null;
            this.parent = null;
            
            this.belongsDataStructure = false;
          }
        

        
          public int getvalue() {
            return this.value;
          }
        
          public void setvalue(int value) {
            this.value = value;
          }
        
          public int getheight() {
            return this.height;
          }
        
          public void setheight(int height) {
            this.height = height;
          }
        
          public int getNumberDescendants() {
            return this.numberDescendants;
          }
        
          public void setNumberDescendants(int numberDescendants) {
            this.numberDescendants = numberDescendants;
          }
        
          public int getpath() {
            return this.path;
          }
        
          public void setpath(int path) {
            this.path = path;
          }
        
          public boolean getBelongsDataStructure() {
            return this.belongsDataStructure;
          }
        
          public void setBelongsDataStructure(boolean belongsDataStructure) {
            this.belongsDataStructure = belongsDataStructure;
          }

          public No getparent() {
            return this.parent;
          }
        
          public void setparent(No parent) {
            this.parent = parent;
          }
        
          public No getc_left() {
            return this.c_left;
          }
        
          public void setc_left(No esq) {
            this.c_left = esq;
          }
        
          public No getc_right() {
            return this.c_right;
          }
        
          public void setc_right(No dir) {
            this.c_right = dir;
          }
          
          public No gets_left() {
            return this.s_left;
          }
          
          public No gets_right() {
            return this.s_right;
          }
          
          public void sets_left(No sleft) {
            this.s_left = sleft;
          }
          
          public void sets_right(No sright) {
            this.s_right = sright;
          }
 }

