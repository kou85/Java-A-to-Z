package ua.ikonovalov.tracker.start;

import java.util.*;
public class ConsoleInput implements Input{
	private Scanner scanner = new Scanner(System.in);
	@Override
	public String ask(String question) {
		System.out.printf(question); //печатает то что передали в него
		return scanner.nextLine(); //возвращает введенные значения из консоли(полную строчку) пользователем, если несколько значений то нужно использовать просто next
	}


}