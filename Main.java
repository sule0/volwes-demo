
public class Main {

	public static void main(String[] args) {
		String vowel="ü";
		
		//  vowels but turkish :)
		switch (vowel) {
		case "i":
		case "e":
		case "ü":
		case "ö":	
			
            System.out.println("It is a thin vowel. ");
			break;
		case "o":
		case "a":
		case "u":
		case "ı":
			System.out.println("It is a bold vowel. ");
			break;
		default:
			System.out.println("It isn't vowel. ");
			
			break;
		
		
		}
		
		
		
		

	}

}
