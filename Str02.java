
class Str02 {
    public static void main(String[] args) {
        
        String s1= new String ("Aakash");
        String s2= new String ("Aakash");
        System.out.println(s1==s2); 		//false
        
        String s3="Aakash";
         System.out.println(s1==s3); 		//false
        
        String s4 ="Aakash";
       System.out.println(s3==s4); 			//true
       
       String s5 = "Aak" + "ash";
        System.out.println(s4==s5);			//true
        
        String s6="Aak";
        String s7=s6+"ash";
         System.out.println(s4==s7); 		//false
         
        final String s8 = "Aak";
         String s9 = s8 + "ash";
          System.out.println(s4==s9); 		//true
         
         
         
         
         
        
    }
}

class Str02 {
    public static void main(String[] args) {
        
        String s1= new String ("Aakash");
        String s2= new String ("Aakash");
        System.out.println(s1==s2); 
        
        String s3="Aakash";
         System.out.println(s1==s3); 
        
        String s4 ="Aakash";
       System.out.println(s3==s4); 
    }
}