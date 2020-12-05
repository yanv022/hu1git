package monjdk;
import java.lang.Comparable;
import java.util.Arrays;
import java.lang.*;

public class ComparableLang {
	static int u = 0 ;
	
	public static void main(String[] args) {
		 String str = "schwarzwald";
	       String [] stringArraySortiert = str.split("");
	       Arrays.sort(stringArraySortiert);
	       String [] stringArray = str.split("");
	       
	       /**die Position von dem kleinste Element suchen**/
	       
	       
	       
	        for(int i=0; i<stringArray.length ;i++ ) { 
	        	if(stringArray[i].equals(stringArraySortiert[0])){
	                u = i +1;
	                break; 
	        	
	        	}
	         
	        }  


	        	System.out.println("u="+ u);

	}

}
