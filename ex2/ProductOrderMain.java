package section2_class.ex2;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder po1 = new ProductOrder();
        po1.productName = "도도한 나초";
        po1.price = 2500;
        po1.quantity = 3;
        orders[0] = po1;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "칙촉";
        po2.price = 2500;
        po2.quantity = 5;
        orders[1] = po2;

        ProductOrder po3 = new ProductOrder();
        po3.productName = "구구콘";
        po3.price = 1700;
        po3.quantity = 2;
        orders[2] = po3;

        int totalAmount = 0;
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + " / 가격: " + o.price + " / 수량:" + o.quantity);
            totalAmount += o.price * o.quantity;
        }

        System.out.println("총 결제 금액: " + totalAmount);

    }
}
