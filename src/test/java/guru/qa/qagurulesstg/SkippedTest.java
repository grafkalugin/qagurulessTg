package guru.qa.qagurulesstg;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTest {

    @Test
    @Disabled
    void testSki1(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void testSki2(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void testSki3(){
        assertTrue(true);
    }

}
