package ua.ikonovalov;

/**
 * Created by Ivan on 01.08.18.
 */
public class DummyBot {

    /**
     *
     * @param question
     * @return
     */
    public  String answear(String question) {
        String rsl = "Это ставит меня в тупик. Спроси другой вопрос.";
        if ("Привет, Бот".equals(question)) {
            rsl = "Привет умник";
        } else if ("Пока".equals(question)) {
            rsl = "До скорой встречи";
        }
        return  rsl;
    }
}
