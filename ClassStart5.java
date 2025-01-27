package section2_class;

public class ClassStart5 {
    public static void main(String[] args) {
        Student s1 = new Student();
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

        Student[] students = new Student[] {s1, s2};

        for (int i = 0; i < students.length ; i++) {
            System.out.println("이름: " + students[i].name + " / 나이:" + students[i].age + " / 과목: " + students[i].subject + " / 성적: " + s1.grade + " / 참조값: " + s1);
        }

        System.out.println("= 루프 최적화 =");
        //루프 최적화
        for (int i = 0; i < students.length ; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " / 나이:" + s.age + " / 과목: " + s.subject + " / 성적: " + s.grade + " / 참조값: " + s);
        }

        System.out.println("= 루프 최적화 2 =");
        //루프 최적화
        for (Student s : students) {
            System.out.println("이름: " + s.name + " / 나이:" + s.age + " / 과목: " + s.subject + " / 성적: " + s.grade + " / 참조값: " + s);
        }


    }

}
