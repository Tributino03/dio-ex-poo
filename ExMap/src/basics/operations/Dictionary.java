package basics.operations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private String word;
	private String definitions;

	private Map<String, String>wordDefinitions;
	
	public Dictionary() {
		this.wordDefinitions = new HashMap<>();
	}
	
	public String getWord() {
		return word;
	}

	public Map<String, String> getWordDefinitions() {
		return wordDefinitions;
	}

	public void addWord(String word, String definitions) {
		wordDefinitions.put(word, definitions);
	}
	
	public void removeWord(String word) {
		wordDefinitions.remove(word);
	}
	
	public void viewWords() {
		System.out.println(wordDefinitions);
	}
	
	public String searchByWord(String word) {
		String definitionsByWord = null;
		definitionsByWord = wordDefinitions.get(word);
		return definitionsByWord;
	}
	
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.addWord("oi", "us. como saudação");
		dictionary.addWord("pescoco", "região do corpo entre o tronco e a cabeça");
		dictionary.addWord("cheio", "cujo conteúdo corresponde à capacidade total");
		dictionary.viewWords();
		dictionary.removeWord("pescoco");
		System.out.println("Palavra procurada: " + dictionary.searchByWord("cheio"));
	}
}
