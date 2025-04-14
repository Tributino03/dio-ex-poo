package basic.operation;

import java.util.HashSet;
import java.util.Set;

public class SetUniqueWords {

private Set<String> setUniqueWords;

public SetUniqueWords() {
	this.setUniqueWords = new HashSet();
}

public Set<String> getSetUniqueWords() {
	return setUniqueWords;
}

public void addWord(String word ){
	setUniqueWords.add(word);
}

public void removeWord (String word ){
	if (setUniqueWords.isEmpty()) {
        throw new IllegalStateException("The list is empty");
    }
	String removeWordOnly = null;
	for(String s : setUniqueWords) {
		if(s.equals(word)) {
			removeWordOnly = word;
			break;
		}
	}
	setUniqueWords.remove(removeWordOnly);
}

public String checkWord(String word) {
	if (setUniqueWords.isEmpty()) {
        throw new IllegalStateException("The list is empty");
    }
	String checkWordOnly = null;
	for(String s : setUniqueWords) {
		if(s.equals(word)) {
			checkWordOnly = word;
			break;
		}
	}
	return checkWordOnly;
}

public void displayUniqueWords() {
	System.out.println(setUniqueWords);
}

	public static void main(String[] args) {
		SetUniqueWords word = new SetUniqueWords();
		
		word.addWord("lero");
		word.addWord("iae");
		word.addWord("bom");
		word.addWord("oi");
		word.removeWord("iae");
		System.out.println(word.checkWord("lero"));
		word.displayUniqueWords();
	}

}
