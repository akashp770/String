class Str01{
	public static void main(String args[]){
		String s= new String ("AAkash");   // by using new keywrd Aakash store in heap &&&&&  the constant "AAkash" will store in SCP   tht means 2 obj are created 1 in Heap  Area and 2 in SCP
				s = "Akash ";    //SCP (String constant pool) 
				
				
		s.concat("Patil");		//notn able concat bcz it Stores in heap   and it will be 2nd value "AkashPatil"
		s=s.concat(" Patil");  //this will concat 		and in this the 's' will point to this as  "AkashPatil"
		
		
	}
}