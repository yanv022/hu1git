import java.util.Arrays;


public class Wuerfel implements Codec {
	
	public Wuerfel(String schluessel) {
		setzeLosung( schluessel);
	} 
	
	
	
	
	
	public Wuerfel() {
		// TODO Auto-generated constructor stub
	}





	private String schluessel;                     //schluessel
	
	
	
	 public  String  kodiere(String klartext){                   //kodiere
		 int v = 0 ; 
		 int x = 0 ;
		 int z = 0 ;
		 int t = 0 ;
		String  losungsworts = schluessel;
         String losungswort = losungsworts.toLowerCase();
         StringBuilder st = new StringBuilder() ;
          String [] stringArray = losungswort.split("");
         String [] klarTextstringArray =klartext.split(""); 
         String [] geheimtextArray = new String [klartext.length()];
         int [] losungZahl = new int [schluessel.length()];                                                                     //jai ajouter le comm
         String [] stringArraySortiert =losungswort.split("");
          //String [] stringArraySortiert =losungswort.split("");
         Arrays.sort(stringArraySortiert);
         
         //schluessel = losungsworts;                                                                      //schluessel
         
         
         //cacul le lösung zahl
         /**
          * calcul lösungswort  
          *
          */
         
         for( int j=0;j<schluessel.length();j++){
        for( int i=0;i<schluessel.length();i++){
        
         
         if(stringArray[i].equals(stringArraySortiert[j])){
          stringArray[i]= "";//wiederholung vermeiden                                                                       //jai com
       
        losungZahl[v]= i;
        v = v+1;
        
          } 
         
        
        } //for 2
        
    } // for 1
    //der Geheimtext finden:codierung
          /**
           *der Geheimtext finden:codierung
           * **/
         
         
         for( int i=0;i<losungswort.length();i++){
       for( int n=losungZahl[i];n<klarTextstringArray.length;n=n+losungswort.length()){
       geheimtextArray[x]= klarTextstringArray[n];
       
       ++x;
       }
       
   } 
         
   /**
    * der    geheimtextArray in Strring umwandeln
    */
   
    for(int j = 0 ; j< klarTextstringArray.length; j++){
           st.append(geheimtextArray[j]);
       }
   return st.toString() ;
    
     } //methodecode
	 
	 /**
	  * methode Dekodierung
	  * @param geheimtext
	  * @param losungsworts
	  * @return
	  */
	 public  String  dekodiere(String geheimtext){ //dekodiere
		 int v = 0 ; 
		 int x = 0 ;
		 int z = 0 ;
		 int t = 0 ;
		 String  losungsworts = schluessel;                                                                       //schlussel
         String losungswort = losungsworts.toLowerCase(); //in klein Buchtabe ändern
          String [] klarTextstringArray =geheimtext.split(""); 
          String [] stringArray = losungswort.split("");
          String [] stringArraySortiert =losungswort.split("");
          int [] losungZahl = new int [stringArray.length];                                                      //
           Arrays.sort(stringArraySortiert);
           String [] geheimtextArray =geheimtext.split(""); 
           //String [] geheimtextArray = new String [klarTextstringArray.length];
         
         
           /**
            * lösungzahl berechnen
            */
         
       for( int j=0;j<stringArray.length;j++){
        for( int i=0;i<stringArray.length;i++){
        
         
         if(stringArray[i].equals(stringArraySortiert[j])){
          stringArray[i]= "";/**wiederholung vermeiden**/  
       
        losungZahl[t]= i;
        t = t+1;
        
          }
        }
       
    }
       /**
        * decodierung
        */
    
    for( int i=0;i<losungswort.length();i++){
       for( int s=losungZahl[i];s<geheimtextArray.length;s=s+losungswort.length()){
     klarTextstringArray[s] =geheimtextArray[z];
     ++z;
       
       }
   }  
   
   //array to String umwandeln
     StringBuilder str = new StringBuilder() ;
     for(int j = 0 ; j< geheimtextArray.length ; j++){
           str.append(klarTextstringArray[j]) ;
       }
    
        
    return str.toString() ;
     } //methodecode

	

	@Override
	public String gibLosung() {
		// TODO Auto-generated method stub
		return schluessel;
	}

	@Override
	public void setzeLosung(String schluessel)  {
		this.schluessel = schluessel;
		//String schluessel = schluessel.toLowerCase();
		
	}

}
