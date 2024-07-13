
import java.util.*;

public class Lines {
	
	private ArrayList<String> words = new ArrayList<>();
	
	private String text;

	public Lines(String str) {
		for (String word : str.split(" ")) {
			words.add(word);

		}
		text = str;
	}
	public void addText(String text) {
		for (String word : text.split(" ")) {
			words.add(word);
		}
	}
	
	public String trimspace() {
		String result = "";
		for (int i = 0; i < words.size(); i++) {
			result += words.get(i);
		}

		return result;
	}
	public ArrayList<String> getLinesBeginWith(String input) {
		ArrayList<String> list = new ArrayList<>();
		int sizeOfinput = (" " + input).length();
		for (String text : text.split("\n")) {
			if (text.substring(0, sizeOfinput).equalsIgnoreCase(" " + input)) {
				list.add(text);
			}
		}
		return list;
	}
	public String print() {
		String result = "";
		for (int i = 0; i < words.size(); i++) {
			result += words.get(i) + " ";
		}
		return result;
	}

	public void printWithLines() {
		int i = 1;
		for (String word : text.split("\n")) {
			System.out.println(i + ". " + word);
			i++;
			
		}
	}
	public String removeEvenLength() {
		ArrayList<String> words = new ArrayList<String>();
		for (String word : text.split(" ")) {
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
	public ArrayList<String> getURL(String target) {
		ArrayList<String> list = new ArrayList<String>();
		int lengthOfTarget = target.length();
		for (String word : text.split(" ")) {
			if (word.length() > lengthOfTarget) {
				if (word.substring(0, lengthOfTarget).equals(target)) {
					list.add(word);
				}
			}
		}
		return list;
	}
	public ArrayList<String> getURL() {
		ArrayList<String> list = new ArrayList<String>();

		for (String word : text.split(" ")) {
			if (word.length() > 4) {
				if (word.substring(0, 4).equals("http")) {
					list.add(word);
				}
			}
		}
		return list;
	}
	public String findReplace(String target, String newString) {
		ArrayList<String> list = new ArrayList<String>();
		for (String word : text.split(" ")) {
			list.add(word);
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				list.set(i, newString);
			}
		}
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i) + " ";
		}
		return result;
	}

	public String getLine(int input) {
		ArrayList<String> list = new ArrayList<String>();
		for (String line : text.split("\n")) {
			list.add(line);
		}
		return list.get(input - 1);
	}
	
	
	
	public char[] extractNumbers() {

		String str = text;
		str = str.replaceAll("[^\\d]", " ");
		str = str.trim();
		str = str.replaceAll(" +", " ");
		if (str.equals(""))
			return null;
		return str.toCharArray();

	}
}
