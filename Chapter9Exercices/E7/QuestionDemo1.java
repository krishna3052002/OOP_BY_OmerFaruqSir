import java.util.Scanner;
public class QuestionDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Question q = new Question ();
        q.setText("Who is the inventor of java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        if (q.checkAnswer(response)) {
            System.out.println("Correct Ans.");
        } else {
            System.out.println("Wrong ans");
        }
    }
}