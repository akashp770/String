
class Str03 {
    public static void main(String[] args) {
     
        StringBuilder s1 =new StringBuilder("");
        System.out.println(s1.capacity());       //16
        
         StringBuilder s2 =new StringBuilder("Aakash");
        System.out.println(s2.capacity());       //22
        
         StringBuilder s3 =new StringBuilder(100);
        System.out.println(s3.capacity());       //100
        
        s1.append("Aak");       //it will Show in LENGTH
        System.out.println(s1.capacity());   //16
         
         s1.append("Aakash"); 
         System.out.println(s1.capacity());  //16
         
        
    }
}