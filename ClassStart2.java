package section2_class;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2","학생3","학생4","학생5","학생6","학생7"};
        int[] ages = {15,16,17,19,18,15,19};
        int[] grades = {90,82,98,95,92,25,90};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + ages[i] + " 성적: " + grades[i]);
        }
        // 이 코드의 단점 : 학생 데이터를 제거하려면 요소를 정확하게 찾아서 제거해줘야한다

    }
}
