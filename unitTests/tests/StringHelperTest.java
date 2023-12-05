package unitTests.tests;

import org.junit.*;
import unitTests.src.StringHelper;

public class StringHelperTest {
    @Test
    public void testReverse() {
        StringHelper utility = new StringHelper();
        Assert.assertNull("Reverse of null should be null", utility.reverse(null));
        Assert.assertEquals("Reverse of empty string should be empty", "", utility.reverse(""));
        Assert.assertEquals("Reverse of 'abc' should be 'cba'", "cba", utility.reverse("abc"));
    }

    @Test
    public void testCapitalize() {
        StringHelper utility = new StringHelper();
        Assert.assertNull("Capitalize of null should be null", utility.capitalize(null));
        Assert.assertEquals("Capitalize of empty string should be empty", "", utility.capitalize(""));
        Assert.assertEquals("Capitalize of 'hello' should be 'Hello'", "Hello", utility.capitalize("hello"));
    }
}
