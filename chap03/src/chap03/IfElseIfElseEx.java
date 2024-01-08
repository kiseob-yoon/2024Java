package chap03;

public class IfElseIfElseEx {

	public static void main(String[] args) {
        int score = 100;

        if (score >= 90 && score <= 100) {
            System.out.println("점수가 90~100점입니다.");
        } else if (score >= 80) {
            System.out.println("점수가 80~89점입니다.");
        } else if (score >= 70) {
            System.out.println("점수가 70~79점입니다.");
        } else if (score < 0 || score > 100) {
            System.out.println("점수가 0보다 작거나 100보다 큽니다. 점수가 잘못되었습니다.");
        } else {
            System.out.println("점수가 70점 미만입니다.");
        }

    }

}
