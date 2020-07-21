package operators;

public class IncrementOperatorDemo {
	public static void main(String[] args) {
		

	     // postincrement 
  // preincrement
   int i = 10;
     // i++; // post increment add 1 to i
   //  System.out.println(i);
   
   // ++i;  // pre increment  add 1 to i
  //   System.out.println(i);
   
   
       // pre-increment - first increment then assign 
    
       // post - increment - first assign the increase 
       int j = 10 ;
       
       int k = j++; // first it is assigning the value 10 to k  then increase by 1
      System.out.println("k-"+k);
      System.out.println("j-"+j);
   
        //  int  k = ++j ; // first it is assigning the value 10 to k  then increase by 1
      System.out.println("k-"+k);
      System.out.println("j-"+j);
      
      
     // int k  = j++ + ++j;
          //    10   +    12   =22
      System.out.println("k-"+k);
      System.out.println("j-"+j);
     
      //    int k = ++j  + ++j + j++  + j++;
       //           10   +  12 + 12   + 13 
      
        System.out.println("k-"+k);
        System.out.println("j-"+j);
        
        // preincrement is faster than post increment ?
	}
       
   
   
     
} 

