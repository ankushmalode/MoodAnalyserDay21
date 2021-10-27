package com.bridgelabz;

public class MoodAnalyzer {
    private final String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.equals(""))
                throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.EXCEPTION_EMPTY);
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Invalid message", MoodAnalysisException.ExceptionType.EXCEPTION_NULL);
        }
    }
}

class MoodAnalysisException extends Throwable {
    public String message;
    public ExceptionType exceptionType;

    enum ExceptionType {
        EXCEPTION_NULL, ENTERED_EMPTY, ENTERED_NULL, EXCEPTION_EMPTY
    }

    public MoodAnalysisException(String message, ExceptionType type) {
        this.message = message;
        this.exceptionType = type;
    }
}
