package ua.ikonovalov;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Strong on 11.06.19.
 */
public class ConfigTest {
    Map<String, String> val;
    Config config;

    @Before
    public void init() {
        config = new Config("app.properties");
        config.load();
        val = new HashMap<>();
        val.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        val.put("hibernate.connection.url", "jdbc:postgresql://127.0.0.1:5432/trackstudio");
        val.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        val.put("hibernate.connection.username", "postgres");
        val.put("hibernate.connection.password", "password");
    }

    @Test
    public void loadProperties() {
        Map<String, String> rs = config.getValue();
        assertEquals(val, rs);


    }

    @Test
    public void valuesReturnTest() {
        String rs = config.value("hibernate.connection.username");
        String rs1 = config.value("hibernate.dialect");
        assertEquals(rs, "postgres");
        assertEquals(rs1, "org.hibernate.dialect.PostgreSQLDialect");
    }

}