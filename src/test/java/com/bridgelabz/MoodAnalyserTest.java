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

    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
        String actual = moodAnalyzer.analyseMood();
        String expected = "HAPPY";
        Assertions.assertEquals(expected, actual);
    }

    /*
     * UC3-TC3.1 return Happy if given String :NULL Refactor :pass String using
     * constructor
     */
    @Test
    public void givenMessage_whenNull_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EXCEPTION_NULL, e.exceptionType);
        }
    }

    /*
     * UC3-TC3.2 return Happy if given String :" " Refactor :pass String using
     * constructor
     */
    @Test
    public void givenMessage_whenEmpty_ShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println("here");
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EXCEPTION_EMPTY, e.exceptionType);
        }
    }
}