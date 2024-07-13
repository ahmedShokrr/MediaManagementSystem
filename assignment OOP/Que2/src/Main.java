import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lines test1 = new Lines(
				"The QWERTY layout depicted in Sholes's 1878 patent is slightly different from the modern \n layout , most notably in the absence of the numerals 0 and 1, with each of the remaining \n numerals shifted one position to the left of their modern counterparts. The letter M is located at \n the end of the third row to the right of the letter L rather than on the fourth row to the right of\ntheN, the letters X and C are reversed, and mostpunctuationmarksare in different positions or are missing entirely .");
		Lines test2 = new Lines(
				"Alamein international university, social media : http://www.facebook/aiu & ftp://Instagram.com/aiu");
		ArrayList<String> test = test1.getLinesBeginWith("numeral");
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));

		}

		System.out.println();
		test1.printWithLines();
		System.out.println();
		System.out.println(test1.removeEvenLength());
		System.out.println();
		System.out.println(test1.trimspace());
		System.out.println();
		char[] arr = test1.extractNumbers();
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();
		System.out.println(test1.findReplace("QWERTY", "qwerty"));
		System.out.println();
		ArrayList<String> list1 = test2.getURL();
		ArrayList<String> list2 = test2.getURL("ftp://");
		for (int j = 0; j < list1.size(); j++) {
			System.out.println(list1.get(j));

		}
		for (int k = 0; k < list2.size(); k++) {
			System.out.println(list2.get(k));
		}
		System.out.println();
		System.out.println(test1.getLine(3));
		System.out.println();
		test2.addText(" Good luck");
		System.out.println(test2.print());
		
		
	}
	}

