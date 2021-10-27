package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/**
 * Unit test for simple MoodAnalyzer.
 */
public class MoodAnalyserTest {
    @Test
    public void testMood_WhenMoodIsSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String state = moodAnalyzer.analyseMood();
        String actual = "SAD";
        Assertions.assertEquals(actual, state);
    }

    @Test
    public void testMood_WhenMoodIsSad1() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String state = moodAnalyzer.analyseMood();
        String actual = "HAPPY";
        Assertions.assertEquals(state, actual);
    }
}