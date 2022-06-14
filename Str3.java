class Str3 {
    public static void main(String[] args) {
       
       String s1 = new String("Aakash");
       String s2 = new String("Aakash");
       
       System.out.println(s1==s2);		//False		in this s1 and s2 points to different objs 
       System.out.println(s1.equals(s2));  //True    in this both points tosame contain and show that it is true 
    }
}