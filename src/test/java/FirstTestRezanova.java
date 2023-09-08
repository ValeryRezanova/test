import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestRezanova {

    @BeforeClass(alwaysRun = true)
    void beforeClass() {
        System.out.println("Привет, давай посчитаем!");
    }

    @BeforeMethod(alwaysRun = true)
    void beforeMethod() {
        System.out.println("Проверишь все?");
    }

    @AfterClass(alwaysRun = true)
    void afterClass() {
        System.out.println("Пока!");
    }

    @Test(description = "Первый тест")
    void firstTest() {
        int a = 12;
        int b = 25;
        int c = 40;
        int d = 21;

            System.out.println("a + b  = " + (a + b));
            System.out.println("a - c  = " + (a - b));
            System.out.println("c * d  = " + (a * b));
            System.out.println("b / d  = " + (b / a));
            System.out.println("b % a  = " + (b % a));
            System.out.println("c % a  = " + (c % a));
            System.out.println("a++ = " + (a++));
            System.out.println("a-- = " + (a--));
            System.out.println("d++ = " + (d++));
            System.out.println("++d = " + (++d));
            System.out.println("a += b = " + (a += b));
            System.out.println("a = " + (a));
            System.out.println("a -= b = " + (a -= b));
            System.out.println("a = " + (a));
            Assert.assertEquals(12, a, "Упс, что-то пошло не так!");
    }

    @Test(description = "Второй тест")
    void secondTest() {
        System.out.println("Надеюсь, тебе было интересно!");
    }
}
