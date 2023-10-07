package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.equals("Make the test pass")) {
            return "green";
        }else if(message.equals("Refactor")) {
            return "blue";
        }else if(message.equals("Write a failing test")) {
            return "red";
        }else{
            return "null";
        }
    }

}