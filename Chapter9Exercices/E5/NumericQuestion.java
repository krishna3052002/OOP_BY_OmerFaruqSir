public class NumericQuestion{

    public double ans;
    final public double differ=0.01;
    public NumericQuestion() {

        ans = 0;
    }
    public void setAnswer(double correctResponse) {
        ans = correctResponse;
    }
    public boolean checkAnswer(double response) {
        return Math.abs(response-this.ans)<=differ;
    }
}
