import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    String input1 = "noon";

    App app = new App ();
    boolean expected = false;

    @Test
    public void isPlaindromeTest() {
        assertEquals(expected, app.isPalindrome(input1));
    }

    @Test
    public void isNotPlaindromeTest() {
        assertEquals(false, app.isPalindrome("abc"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isNotPlaindromeExceptionTest() {
        assertEquals(false, app.isPalindrome(null));
    }

}
