package pis.hue1;

//import java.io.* ;
//import java.util.*;


public class Caesar implements Codec {
	private String schluessel;                                                       //schluessel
	int convertir=0;
	
	
	
	String ceoutAnfang = "" ;
	
	/** wir conveertieren string zu ascii ,
	 wir addieren schl�ssel.length ,
	 wir convertieren wieder zu string **/
	
	public   String kodiere(String s){                                                                             //kodiere
		
		String r = s;//.toLowerCase();
		StringBuilder st = new StringBuilder() ;
		char[] charSIn = r.toCharArray();
		
		 
		 for(int i = 0; i < charSIn.length; i++) {
			 
			 
			 int convert = (int)charSIn[i]; // convert char to ascii code
			 //int convertir = convert-schluessel.length(); 
			 
			 
			 //F�r kleine Buchstabe
			 
			if(convert>=97 && convert <=122)  {  //||(convert>=65 && convert <=90)
				  convertir = convert+schluessel.length();
				  
				  
				  
				  
			 
				  if (convertir>122) {
						 
						 convertir=convertir%122;
						 convertir=convertir+96; /**schleife  f�r x y und z bei codierung**/
					     }
				  
				  
				  
		    }else 
		      if(convert>=65 && convert <=90)  {
		    	  convertir = convert+schluessel.length(); 
		    	if (convertir>90) {
		    		convertir=convertir%90;
					 convertir=convertir+64; /** f�r A B und C bei decodierung**/
				     }
		    	
		    }
		    	
		    
			
			/**
		      * F�r sondernzeichnen
		      */
			
			else {
		    	convertir = convert; 
		    }
			 
			 
			 
			 
			
			 
			 /**int convert = (int)charSIn[i]; // convert char to ascii code
			 int convertir = convert+ schluessel.length();                                      //schluessel
			 if (convertir>122) {
				 convertir=convertir%122;
				 convertir=convertir+96;**/ /**schleife  f�r x y und z bei codierung**/
			 //}
			 /**
			  * F�r Sondernzeichnen
			  */
			/** if(convert<97 || convert>122) {       //|| convert>122            
				  convertir = convert; 
			 }**/
			 
			 
			 
			 
			 
			 
			 
			 char ceoutChar= (char)(convertir);// convert ascii to char
			 
			 st.append(ceoutChar) ; 
		 }
		 return st.toString() ;
	}
	          // methode f�r die dekodierung
	/** wir conveertieren string zu ascii ,
	 wir addieren die Schl�sseln l�nge ,
	 wir convertieren wieder zu string **/
	
	public   String dekodiere(String s){                                              //dekodiere
		
		
		String r = s;                                                         //.toLowerCase();
		StringBuilder st = new StringBuilder() ;

		char[] charSIn = r.toCharArray();
		 
		 for(int i = 0; i < charSIn.length; i++) {
			 
			 int convert = (int)charSIn[i]; // convert char to ascii code
			 //int convertir = convert-schluessel.length(); 
			 
			 
			 //F�r kleine Buchstabe
			 
			if(convert>=97 && convert <=122)  {  //||(convert>=65 && convert <=90)
				  convertir = convert-schluessel.length();
				  
				  
				  
				  
			 
				  if (convertir<97) {
						 convertir=convertir+26; /** f�r a b und c bei decodierung**/
					     }
				  
				  
				  
		    }else 
		      if(convert>=65 && convert <=90)  {
		    	  convertir = convert-schluessel.length(); 
		    	if (convertir<65) {
					 convertir=convertir+26; /** f�r A B und C bei decodierung**/
				     }
		    	
		    }
		    	
		    
			
			/**
		      * F�r sondernzeichnen
		      */
			
			else {
		    	convertir = convert; 
		    }
			 
			   
			 
			 
			 
			 
			 
			 
			     
			     
			     
			     
			 
			     
			     
			     
			     
			     
			     
			     
			     char ceoutChar= (char)(convertir);// convert ascii to char
			 
			 st.append(ceoutChar) ;
			 
		 }
		 return st.toString() ;
		 
	}
			@Override
			public String gibLosung() {
				// TODO Auto-generated method stub
				
				return schluessel;
			}
			@Override
			public void setzeLosung(String schluessel)  {
				// TODO Auto-generated method stub
				this.schluessel = schluessel;
				
				
				
				
				
			}
	


}
