package section2_class;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int age1 = 21;
        int grade1 = 90;

        String student2Name = "학생2";
        int age2 = 25;
        int grade2 = 82;

        String student3Name = "학생3";
        int age3 = 22;
        int grade3 = 92;

        System.out.println("이름: " + student1Name + " 나이: " + age1 + " 성적: " + grade1);
        System.out.println("이름: " + student2Name + " 나이: " + age2 + " 성적: " + grade2);
        System.out.println("이름: " + student3Name + " 나이: " + age3 + " 성적: " + grade3);
        // 이 코드의 단점 : 학생이 추가 될때마다 코드도 추가되어야하는 번거로움이 있다.
    }
}
