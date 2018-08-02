package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Ivan on 01.08.18.
 */
public class DummyBotTest {

    /**
     *
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answear("Привет, Бот"), is("Привет умник"));
    }

    /**
     *
     */
    @Test
    public void whenGoodByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answear("Пока"), is("До скорой встречи"));
    }

    /**
     *
     */
    @Test
    public void whenOtherAnswearBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answear("Сколько будет 5 - 8?"), is("Это ставит меня в тупик. Спроси другой вопрос."));
    }
}
