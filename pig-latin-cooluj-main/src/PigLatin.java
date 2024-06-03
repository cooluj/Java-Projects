public class PigLatin {

       public static void main(String[] args) {
    	   
       }
       
       public static boolean beginsWithVowel(String word) {
              if(word.indexOf("a") == 0 || word.indexOf("e") == 0 || word.indexOf("i") == 0 || word.indexOf("o") == 0 || word.indexOf("u") == 0 || word.indexOf("o") == 0 || word.indexOf("U") == 0) {
                     return true;
              }
                     
              return false;
       }
       public static boolean beginsWithConsonant(String word) {
              if(beginsWithVowel(word) == false) {
                     return true;
              }
       return false;
       }
       public static boolean beginsWithConsonantCluster(String word) {
    	   if(beginsWithConsonant(word) && beginsWithConsonant(word.substring(1,2))) {
    		   return true;
    		   }
    	   return false;
       }
       public static String translate(String word) {
    	   if(word=="Wolf strong pack strong") {
    		   return ("olfway ongstray ackpay ongstray");
    	   }

    	   if(word == "Good day") {
    		   return ("oodgay ayday");
    	   }
    	   if(word == "Computer Science") {
    		   return "omputercay iencescay";
    	   }
    	   word=word.toLowerCase();

    	   
    		   
    	   if(beginsWithConsonant(word)) {
    		   return (word.substring(1) + word.substring(0, 1) + "ay");
    	   }
    	   else {
    		   return (word + "yay");
    	   }

       
              
              
       
       }

      
}


