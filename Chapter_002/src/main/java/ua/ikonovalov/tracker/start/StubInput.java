package ua.ikonovalov.tracker.start;

public class StubInput implements Input{
	private String[] answers; //create arg ответов;
	private int position = 0; //create сouter=0

	public StubInput(String [] answers) { //конструктор который принимает наши значения
		this.answers = answers;

	}
	@Override
	public String ask(String question) { //получать наши значения из цикла и делать инкремент что б увеличивать значения
		return answers [position++];
	}

}