import java.util.Scanner;

/**
 * 4 This program shows a simple quiz with one question.
 * 5
 */
public class QuestionDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Question q = new Question();
        q.setText("When did the liberation war take place?");
        q.setAnswer(1971);

        q.display();
        System.out.print("Your answer: ");
        double response = in.nextDouble();
        if(q.checkAnswer(response))
        {
            System.out.println("Correct Ans.");
        }
        else
        {
            System.out.println("Wrong ans");
        }
    }
}