package section2_class.ex4;

public class InventoryMain {
    public static void main(String[] args) {

    HamburgerInventory[] i = new HamburgerInventory[5];

        HamburgerInventory i1 = new HamburgerInventory();
        i1.inventoryName = "패티";
        i1.ExpirationDate = "2025-05-15";
        i1.quantity = 1000;
        i1.pricePerOne = 500;
        i[0] = i1;

        HamburgerInventory i2 = new HamburgerInventory();
        i2.inventoryName = "피클";
        i2.ExpirationDate = "2025-05-30";
        i2.quantity = 3000;
        i2.pricePerOne = 300;
        i[1] = i2;

        HamburgerInventory i3 = new HamburgerInventory();
        i3.inventoryName = "양상추";
        i3.ExpirationDate = "2025-05-10";
        i3.quantity = 700;
        i3.pricePerOne = 700;
        i[2] = i3;

        HamburgerInventory i4 = new HamburgerInventory();
        i4.inventoryName = "콜라시럽";
        i4.ExpirationDate = "2025-05-10";
        i4.quantity = 152;
        i4.pricePerOne = 5000;
        i[3] = i4;

        HamburgerInventory i5 = new HamburgerInventory();
        i5.inventoryName = "번";
        i5.ExpirationDate = "2025-05-10";
        i5.quantity = 500;
        i5.pricePerOne = 1500;
        i[4] = i5;

        int totalAmount = 0;
        for (HamburgerInventory hi : i) {
            System.out.println("상품명 : " + hi.inventoryName +", 유통기한 : " + hi.ExpirationDate + ", 수량 : " + hi.quantity + ", 일인분 당 가격 : " + hi.pricePerOne);
            totalAmount += hi.pricePerOne * hi.quantity;
        }
        System.out.println("총 재고 자산 가격 : " + totalAmount + "원");
    }
}
