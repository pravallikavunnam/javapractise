package javaPrograms;

public class RemoveSpecialOrJunkCharactersInString {

	public static void main(String[] args) {

		//1.How to remove Junk/Unwanted/Special characters from a string ---we use regular expression --and expecting [a-zA-Z0-9] char only
		//if anything else part form these please remove [^]--use not 
		String s="@#$%%^& hello World 9804729200";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
