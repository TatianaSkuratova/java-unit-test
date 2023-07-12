import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        // Напиши код
        assertEquals("Пользователю больше 18 лет!", true, isAdult);
        }