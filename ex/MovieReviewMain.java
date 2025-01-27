package section2_class.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        NetflixReview Muranisi = new NetflixReview();
        Muranisi.title = "살색의 감독 무라니시";
        Muranisi.review = "일본 AV산업의 성장";

        NetflixReview BlackAndWhiteChef = new NetflixReview();
        BlackAndWhiteChef.title = "흑백 요리사";
        BlackAndWhiteChef.review = "최고의 셰프를 가려라";

        System.out.println("영화 제목: " + Muranisi.title+ " / 리뷰: " + Muranisi.review);
        System.out.println("영화 제목: " + BlackAndWhiteChef.title+ " / 리뷰: " + BlackAndWhiteChef.review);
    }
}
