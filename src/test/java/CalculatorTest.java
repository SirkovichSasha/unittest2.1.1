import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static long suiteStartTime;
    private long testStartTime;


    @Test
    public void testmultiply() {
        // given:
        Calculator calc = Calculator.instance.get();
        final int x = 5;
        final int y = 6;
        // when:
        final int result = calc.multiply.apply(x,y);
        // then:
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testdevidenull() {
        // given:
        Calculator calc = Calculator.instance.get();
        final int x = 5;

        //when :
        final int y = 0;
        // then
        assertThrows(Exception.class, () -> {
            calc.devide.apply(x,y);
        });
    }

    @Test
    public void testpow() {
        // given:
        Calculator calc = Calculator.instance.get();
        final int x = 5;

        // when:
        final int result = calc.pow.apply(x);
        // then:
        Assertions.assertEquals(25, result);
    }
    @Test
    public void testabs() {
        // given:
        Calculator calc = Calculator.instance.get();
        final int x = 5;

        // when:
        final int result = calc.abs.apply(x);
        // then:
        Assertions.assertEquals(5, result);
    }

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running StringTest");
        suiteStartTime = System.nanoTime();
    }
    @BeforeEach
    void setUp() {
        System.out.println("Running StringTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("StringTest complete: " + (System.nanoTime() - suiteStartTime));
    }

}