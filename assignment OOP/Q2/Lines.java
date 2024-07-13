package OOPassignment2;

import java.util.*;

public class Lines {
	Scanner input = new Scanner(System.in);
	private ArrayList<String> lines = new ArrayList<String>();
	private String theOriginaltext;
	int x = lines.size();

	public int getSize() {
		return x;
	}

	public Lines(String str) {
		for (String word : str.split(" ")) {
			lines.add(word);

		}
		theOriginaltext = str;
	}

	public String trimspace() {
		String newString = "";
		for (int i = 0; i < lines.size(); i++) {
			newString += lines.get(i);
		}

		return newString;
	}

	public void addText(String text) {
		for (String word : text.split(" ")) {
			lines.add(word);
		}
	}

	public String show() {
		String newString = "";
		for (int i = 0; i < lines.size(); i++) {
			newString += lines.get(i) + " ";
		}
		return newString;
	}

	public void printWithLines() {
		int i = 1;
		for (String word : theOriginaltext.split("\n")) {
			System.out.println(i + ". " + word);
			i++;
		}

	}

	public ArrayList<String> getLinesBeginWith(String target) {
		ArrayList<String> list = new ArrayList<String>();
		int sizeOfTarget = (" " + target).length();
		for (String text : theOriginaltext.split("\n")) {
			if (text.substring(0, sizeOfTarget).equalsIgnoreCase(" " + target)) {
				list.add(text);
			}
		}
		return list;
	}

	public char[] extractNumbers() {

		String str = theOriginaltext;
		str = str.replaceAll("[^\\d]", " ");
		str = str.trim();
		str = str.replaceAll(" +", " ");
		if (str.equals(""))
			return null;
		return str.toCharArray();

	}

	public String removeEvenLength() {
		ArrayList<String> words = new ArrayList<String>();
		for (String word : theOriginaltext.split(" ")) {
			if (word.length() % 2 != 0) {
				words.add(word);
			}
		}
		String newString = "";
		for (int i = 0; i < words.size(); i++) {
			newString += words.get(i) + " ";
		}
		return newString;
	}

	public String findReplace(String target, String newString) {
		ArrayList<String> list = new ArrayList<String>();
		for (String word : theOriginaltext.split(" ")) {
			list.add(word);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				list.set(i, newString);
			}
		}
		String newStr = "";
		for (int i = 0; i < list.size(); i++) {
			newStr += list.get(i) + " ";
		}
		return newStr;
	}

	public String getLine(int num) {
		ArrayList<String> list = new ArrayList<String>();
		for (String line : theOriginaltext.split("\n")) {
			list.add(line);
		}
		return list.get(num - 1);
	}

	public ArrayList<String> getURL() {
		ArrayList<String> list = new ArrayList<String>();

		for (String word : theOriginaltext.split(" ")) {
			if (word.length() > 4) {
				if (word.substring(0, 4).equals("http")) {
					list.add(word);
				}
			}
		}
		return list;
	}

	public ArrayList<String> getURL(String target) {
		ArrayList<String> list = new ArrayList<String>();
		int lengthOfTarget = target.length();
		for (String word : theOriginaltext.split(" ")) {
			if (word.length() > lengthOfTarget) {
				if (word.substring(0, lengthOfTarget).equals(target)) {
					list.add(word);
				}
			}
		}
		return list;
	}

}
