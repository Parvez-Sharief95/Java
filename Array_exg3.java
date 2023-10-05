public class Array_exg3{
		public static void main(String[] args){
				String[] arr = {"Po","Shen","Tigress","Crane","Tailung"};
				//print the first letters and their ASCII code point
				//Values of all the strings in the above string array
				//Use a for-each loop
				for(String i: arr)
					{
						System.out.println(i.charAt(0) + " " + (int)i.charAt(0));
					}
	}
}