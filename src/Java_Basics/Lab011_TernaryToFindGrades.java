package Java_Basics;

public class Lab011_TernaryToFindGrades {
    public static void main(String[] args) {
        int score = 77;
        char a = 'A';
        char b = 'B';
        String grade = (score>90)?"A": (score>80)?"B":(score>70)?"C":(score<60)?"F":"D";
        System.out.println(grade);
    }
}
