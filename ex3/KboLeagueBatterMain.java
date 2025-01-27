package section2_class.ex3;

public class KboLeagueBatterMain {
    public static void main(String[] args) {
        KboLeagueBatter dyKim = new KboLeagueBatter();
        dyKim.name = "김도영";
        dyKim.Ave = 0.347;
        dyKim.Obp = 0.420;
        dyKim.Ops = 1.067;
        dyKim.HR = 38;
        dyKim.SB = 40;

        KboLeagueBatter jyKoo = new KboLeagueBatter();
        jyKoo.name = "구자욱";
        jyKoo.Ave = 0.343;
        jyKoo.Obp = 0.417;
        jyKoo.Ops = 1.044;
        jyKoo.HR = 33;
        jyKoo.SB = 13;

        KboLeagueBatter hsKim = new KboLeagueBatter();
        hsKim.name = "김혜성";
        hsKim.Ave = 0.326;
        hsKim.Obp = 0.383;
        hsKim.Ops = 0.841;
        hsKim.HR = 11;
        hsKim.SB = 30;

        System.out.println("타자 명 : " + dyKim.name + ", 타율 : " + dyKim.Ave + ", 출루율 : " + dyKim.Obp + ", OPS : " + dyKim.Ops + ", 홈런 : " + dyKim.HR + ", 도루 : " + dyKim.SB);
        System.out.println("타자 명 : " + jyKoo.name + ", 타율 : " + jyKoo.Ave + ", 출루율 : " + jyKoo.Obp + ", OPS : " + jyKoo.Ops + ", 홈런 : " + jyKoo.HR + ", 도루 : " + jyKoo.SB);
        System.out.println("타자 명 : " + hsKim.name + ", 타율 : " + hsKim.Ave + ", 출루율 : " + hsKim.Obp + ", OPS : " + hsKim.Ops + ", 홈런 : " + hsKim.HR + ", 도루 : " + hsKim.SB);


    }
}
