package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 * Unit test for simple MoodAnalyzer.
 */
public class MoodAnalyserTest {
    @Test
    public void testMood_WhenMoodIsSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad Mood");
        String state = moodAnalyzer.analyseMood();
        String actual = "SAD";
        Assertions.assertEquals(actual, state);
    }
}