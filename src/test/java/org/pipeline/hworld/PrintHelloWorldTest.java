package org.pipeline.hworld;
import org.junit.*;

public class PrintHelloWorldTest {

    @Test
    public void testPrint(){
        PrintHelloWorld printHelloWorld = new PrintHelloWorld();
        int expectedResult = 1;
        int result = printHelloWorld.print();
        assert(expectedResult == result);

    }
}
