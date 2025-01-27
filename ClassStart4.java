package section2_class;

public class ClassStart4 {
    public static void main(String[] args) {
        Student s1 = new Student(); // new Student() : 실제 메모리에 만들어진 실체를 객체라고 한다.
        s1.name = "이영호"; // 객체에 접근하려면 점을 사용해야한다.
        s1.age = 16;
        s1.grade = "D";
        s1.subject = "과학";
        System.out.println(s1);
        Student s2 = new Student(); //Student 클래스 기반으로 학생을 메모리에 만든다 : 인스턴스라고 한다
        s2.name = "이재호";
        s2.age = 18;
        s2.subject = "컴퓨터";
        s2.grade = "C";

        Student[] students = new Student[2]; // Student 변수 2개 (참조값 2개)를 보관할수 있는  배열
        students[0] = s1; //변수에 들어가 있는 값을 (참조 값 (6acbcfc0)) 을 복사했다
        students[1] = s2;

        
        System.out.println("이름: " + students[0].name + " / 나이:" + students[0].age + " / 과목: " + students[0].subject + " / 성적: " + s1.grade + " / 참조값: " + s1);
        System.out.println("이름: " + students[1].name + " / 나이:" + students[1].age + " / 과목: " + students[1].subject +" / 성적: " + students[1].grade );
    }

}
