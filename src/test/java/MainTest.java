import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void Number1() {
        //given
        int number = 1;
        //when
        int actual = Main.numberlog(number);
        //then
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void Addierencontrol() {

        //given                                     // Welche variablen werden benötigt z.B diese zwei Integer Variablen

        int zahl1 = 2;
        int zahl2 = 2;

        //when                                      // Wenn er was ausführt
        int actual = Main.addieren(zahl1, zahl2);

        //then                                      // Erwarten wir folgendes Ergebnis
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

}
