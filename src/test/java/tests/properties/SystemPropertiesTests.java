package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void someTets1() {
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Test
    void someTets2() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser");
        System.out.println(browser);  //safari
    }

    @Test
    void someTets3() {

        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //opera
    }

    @Test
    void someTets4() {
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); //safari
    }

    @Test
    @Tag("test5")
    void someTets5() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "148");
        String browserSize = System.getProperty("browserSize", "1920x1080");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);

    }

    @Test
    @Tag("hello")
    void someTets6() {
        System.out.println("Hello " +  System.getProperty("anyText"));

    }
}
