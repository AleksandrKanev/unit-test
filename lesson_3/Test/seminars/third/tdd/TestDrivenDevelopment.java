package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrivenDevelopment {

    @Test
    void testMoodAnalyserGreen() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        assertEquals(moodAnalyser.analyseMood("Make the test pass"), "green");
    }

    @Test
    void testMoodAnalyserBlue() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        assertEquals(moodAnalyser.analyseMood("Refactor"), "blue");
    }

    @Test
    void testMoodAnalyserRed() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        assertEquals(moodAnalyser.analyseMood("Write a failing test"), "red");
    }
}