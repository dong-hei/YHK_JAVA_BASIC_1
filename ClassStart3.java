package section2_class;

/**
 * 나이,성적을 따로 사람이 관리하기에 좋은 방식은 아니다.
 * 그래서 이처럼 학생의 개념을 묶어서 각 학생별로 이름,나이,성적을 관리한다.
 */
public class ClassStart3 {
    public static void main(String[] args) {
        Student s1; //학생을 담을 변수 선언
        s1 = new Student(); //학생을 메모리에 만든다 : 인스턴스라고 한다
        s1.name = "이영호"; // 객체에 접근하려면 점을 사용해야한다.
        s1.age = 16;
        s1.grade = "D";
        s1.hobby = "농구";
        s1.subject = "과학";
        
        Student s2 = new Student(); //Student 클래스 기반으로 학생을 메모리에 만든다 : 인스턴스라고 한다
        s2.name = "이재호";
        s2.age = 18;
        s2.hobby = "애니메이션 보기";
        s2.subject = "컴퓨터";
        s2.grade = "C";

        System.out.println(s1); // 참조값
        System.out.println(s2);// 참조값

        
        System.out.println("이름: " + s1.name + " / 나이:" + s1.age + " / 과목: " + s1.subject + " / 성적: " + s1.grade + " / 취미: " + s1.hobby );
        System.out.println("이름: " + s2.name + " / 나이:" + s2.age + " / 과목: " + s2.subject +" / 성적: " + s2.grade + " / 취미: " + s2.hobby  );
    }

}
