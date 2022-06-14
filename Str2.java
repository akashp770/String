class Str2{
	public static void main (String args[]){
		StringBuilder s= new StringBuilder("Aakash");
		
		System.out.println(s.capacity());	//16+ s = 22
		
		System.out.println(s.append(" Patil"));     //Aakash Patil
	
		System.out.println(s.length());         //12
		
		System.out.println(s.charAt(3));        //a
		
		System.out.println(s.reverse());        //litaP hsakaA
		
		
	}
}