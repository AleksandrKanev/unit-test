package seminars.third.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AbstractAssert.setPrintAssertionsDescription;
import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TestMainHW {

    @ParameterizedTest
    @CsvSource({"3, false", "4, true"})
    void evenOddNumberTest(int num, boolean bool){
        MainHW mainHW = new MainHW();
        assertEquals(mainHW.evenOddNumber(num), bool);

    }

    @Test
    void numberInIntervalTest(){
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.numberInInterval(26));
    }

    @Test
    void numberNotIntervalTest(){
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.numberInInterval(-26));
    }
}
