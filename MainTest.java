import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void reverse() {
    Assertions.assertEquals(0, Main.reverse(0));
    Assertions.assertEquals(1, Main.reverse(100));
    Assertions.assertEquals(2001, Main.reverse(1002));
    Assertions.assertEquals(21, Main.reverse(12));
    Assertions.assertEquals(1111, Main.reverse(1111));
    Assertions.assertEquals(54321, Main.reverse(12345));
    Assertions.assertEquals(6788, Main.reverse(8876));
    Assertions.assertEquals(9931199, Main.reverse(9911399));
    Assertions.assertEquals(12377, Main.reverse(77321));
    Assertions.assertEquals(987654321, Main.reverse(123456789));
    Assertions.assertEquals(-321, Main.reverse(-123));
    Assertions.assertEquals(-87654321, Main.reverse(-12345678));
  }
}
