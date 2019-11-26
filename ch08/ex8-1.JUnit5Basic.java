// 코드 8-1 첫 번째 테스트 코드(JUnit5Basic.java - testFirst())

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class JUnit5Basic {
    @DisplayName("JUnit 5 First Example")
    @Test
    void testFirst() {
	int expected = 3;
	int actual = 1 + 2;
	assertEquals(expected, actual);
    }
}
