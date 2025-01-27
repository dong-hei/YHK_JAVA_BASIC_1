package section2_class.ex3;

public class KboLeagueBatterMain2 {
    public static void main(String[] args) {
        KboLeagueBatter[] batters = new KboLeagueBatter[3];

        KboLeagueBatter dyKim = new KboLeagueBatter();
        dyKim.name = "김도영";
        dyKim.Ave = 0.347;
        dyKim.Obp = 0.420;
        dyKim.Ops = 1.067;
        dyKim.HR = 38;
        dyKim.SB = 40;
        batters[0] = dyKim;

        KboLeagueBatter jyKoo = new KboLeagueBatter();
        jyKoo.name = "구자욱";
        jyKoo.Ave = 0.343;
        jyKoo.Obp = 0.417;
        jyKoo.Ops = 1.044;
        jyKoo.HR = 33;
        jyKoo.SB = 13;
        batters[1] = jyKoo;

        KboLeagueBatter hsKim = new KboLeagueBatter();
        hsKim.name = "김혜성";
        hsKim.Ave = 0.326;
        hsKim.Obp = 0.383;
        hsKim.Ops = 0.841;
        hsKim.HR = 11;
        hsKim.SB = 30;
        batters[2] = hsKim;

        for (KboLeagueBatter b : batters) {
            System.out.println("타자 명 : " + b.name + ", 타율 : " + b.Ave + ", 출루율 : " + b.Obp + ", OPS : " + b.Ops + ", 홈런 : " + b.HR + ", 도루 : " + b.SB);

        }

    }
}
