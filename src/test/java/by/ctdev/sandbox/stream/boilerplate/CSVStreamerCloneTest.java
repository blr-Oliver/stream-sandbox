package by.ctdev.sandbox.stream.boilerplate;

import org.junit.*;

public class CSVStreamerCloneTest {

    private int x;

    public CSVStreamerCloneTest() {
        System.out.println("init<>()");
    }

    @BeforeClass
    public static void initStatic() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void finalizeStatic() {
        System.out.println("After class");
    }

    @Before
    public void init() {
        System.out.println("Before");
        x = 6;
    }

    @After
    public void fatality() {
        System.out.println("After");
    }

    @Test
    public void stream() {
        System.out.println("stream()");
    }

    @Test
    public void anotherTest() {
        //Assert.assertEquals(6, x);
        System.out.println("anotherTest()");
    }

    private void foo() {
    }
}