package Lesson8;

public class JavaProgrammer extends Human implements Programmer, ChessPlayer{

    @Override
    public void writeCode(String requirement) {
        System.out.println("java writing code: " +requirement);
    }

    @Override
    public String languages() {
        return "Java, C++";
    }

    @Override
    public void readCode() {
        System.out.println("java");
    }

    @Override
    public void speakEnglish() {
        System.out.println("Speak English");
    }

    @Override
    public void playChess() {
        System.out.println("Play chess");
    }
}
