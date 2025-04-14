package search.map;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
	
	private String word;
	private Integer count;
	
	private Map<String, Integer> storeQuantity;

	public CountWords(Map<String, Integer> storeQuantity) {
		this.storeQuantity = storeQuantity;
	}

	public String getWord() {
		return word;
	}

	public Integer getCount() {
		return count;
	}
	
	public void addWord(String word, Integer count) {
		storeQuantity.put(word, storeQuantity.getOrDefault(word, 0) + count);
	}
	
	public void removeWord(String word, Integer count) {
	    int currentCount = storeQuantity.getOrDefault(word, 0);
	    int newCount = currentCount - count;

	    if (newCount > 0) {
	        storeQuantity.put(word, newCount);
	    } else {
	        storeQuantity.remove(word);
	    }
	}
	
	public void displayCountWords() {
		System.out.println(storeQuantity);
	}
	
	public Map<String, Integer> findWordMostFrequent() {
	    String palavraMaisFrequente = null;
	    int contagemMaisAlta = 0;

	    for (Map.Entry<String, Integer> entry : storeQuantity.entrySet()) {
	        if (entry.getValue() > contagemMaisAlta) {
	            contagemMaisAlta = entry.getValue();
	            palavraMaisFrequente = entry.getKey();
	        }
	    }

	    Map<String, Integer> resultado = new HashMap<>();
	    if (palavraMaisFrequente != null) {
	        resultado.put(palavraMaisFrequente, contagemMaisAlta);
	    }

	    return resultado;
	}

	
	public static void main(String[] args) {
	    CountWords contador = new CountWords(new HashMap<>());

	    contador.addWord("java", 7);
	    contador.addWord("python", 7);
	    contador.addWord("java", 2); 
	    contador.removeWord("java", 1);
	    contador.displayCountWords();

	    System.out.println("Palavra mais frequente: " + contador.findWordMostFrequent());
	}
}
