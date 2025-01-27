package section2_class.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        NetflixReview[] reviews = new NetflixReview[3];

        NetflixReview Muranisi = new NetflixReview();
        Muranisi.title = "살색의 감독 무라니시";
        Muranisi.review = "일본 AV산업의 성장";
        reviews[0] = Muranisi;

        NetflixReview BlackAndWhiteChef = new NetflixReview();
        BlackAndWhiteChef.title = "흑백 요리사";
        BlackAndWhiteChef.review = "최고의 셰프를 가려라";
        reviews[1] = BlackAndWhiteChef;

        NetflixReview AloneLvlUp = new NetflixReview();
        AloneLvlUp.title = "나 혼자만 레벨업";
        AloneLvlUp.review = "헌터 직업 주인공의 성장 일기";
        reviews[2] = AloneLvlUp;

        for (NetflixReview r : reviews) {
            System.out.println("영화 제목: " + r.title+ " / 리뷰: " + r.review);
        }
    }
}
