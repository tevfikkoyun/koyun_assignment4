
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		duplicateCounter.count("problem02.txt");
		duplicateCounter.write("unique_word_counts.txt");
	}

}
