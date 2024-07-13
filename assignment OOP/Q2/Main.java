package OOPassignment2;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Lines l1 = new Lines(
				"The QWERTY layout depicted in Sholes's 1878 patent is slightly different from the modern \n layout , most notably in the absence of the numerals 0 and 1, with each of the remaining \n numerals shifted one position to the left of their modern counterparts. The letter M is located at \n the end of the third row to the right of the letter L rather than on the fourth row to the right of\ntheN, the letters X and C are reversed, and mostpunctuationmarksare in different positions or are missing entirely .");
		Lines l2 = new Lines(
				"My name is  Nour , My websites is : http://www.facebook/nourramadan and ftp://Instagram.com/nourramadan");
		//return a list of lines the begins with the substring seq
		ArrayList<String> test = l1.getLinesBeginWith("layout");
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));

		}

		System.out.println();
		//print the lines as full string with each line numbered. 
		l1.printWithLines();
		System.out.println();
		//this method removes all strings with even length in lines. 
		System.out.println(l1.removeEvenLength());
		System.out.println();
		// this method removes spaces from all lines.
		System.out.println(l1.trimspace());
		System.out.println();
		//this method returns an array of all numbers in the text. 
		char[] arr = l1.extractNumbers();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();
		//this method gets String from text and change it to another String
		System.out.println(l1.findReplace("QWERTY", "qwerty"));
		System.out.println();
		//this 2 methods get all URLs in text and  all URLs that has this protocol
		ArrayList<String> test2 = l2.getURL();
		ArrayList<String> test3 = l2.getURL("ftp://");
		for (int j = 0; j < test2.size(); j++) {
			System.out.println(test2.get(j));

		}
		for (int k = 0; k < test3.size(); k++) {
			System.out.println(test3.get(k));
		}
		System.out.println();
		// this methpd get the line at position num
		System.out.println(l1.getLine(3));
		System.out.println();
		//this 2 method append a new text and print the all text after adding new text
		l2.addText(" Good luck");
		System.out.println(l2.show());
	}
}
