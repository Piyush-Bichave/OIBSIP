public class NumberGuess {
    public static void main(String[] args) {
        MyGame g=new MyGame();
        System.out.println("Welcome To Number Guessing Game !!");
        System.out.println();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
