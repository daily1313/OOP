package ch5.view;

import ch5.coffee.Coffee;
import ch5.order.OrderItem;
import java.util.List;

public class OutputView {

    public static String printOrderMessage(final OrderItem orderItem) {
        StringBuilder sb = new StringBuilder();
        sb.append("메뉴: ");
        sb.append(orderItem.getMenuName());
        sb.append("\n");
        sb.append("수량: ");
        sb.append(orderItem.getQuantity());
        sb.append("\n");
        sb.append("가격: ");
        sb.append(orderItem.getPrice());
        sb.append("원\n");
        return sb.toString();
    }

    public static void printTotalPriceAndCountMessage(final List<OrderItem> orderItems) {
        System.out.println("주문 내역입니다.");
        int totalPrice = 0;
        int totalCount = 0;
        for(OrderItem orderItem : orderItems) {
            System.out.println(printOrderMessage(orderItem));
            totalPrice += orderItem.getPrice();
            totalCount += orderItem.getQuantity();
        }
        System.out.println("전체 가격 : " + totalPrice + " 전체 수량 : " +totalCount);
    }

    public static void printTakeTheCoffeeMessage() {
        System.out.println("손님 커피 나왔습니다. 받아가세요 !! ");
    }

    public void printTypingKeywordIncorrectlyMessage() {
        System.out.print("키워드를 잘못 입력하였습니다. 다시 입력해주세요. ");
    }

    public void printPlaceOnOrderMessage() {
        System.out.print("주문을 계속 하실 건가요 ? (Y/N) : ");
    }

    public void printInputOrderItemMessage() {
        System.out.print("주문할 커피 품목을 입력해주세요: ");
    }

    public void printInputQuantityMessage() {
        System.out.print("주문할 커피 수량을 입력해주세요: ");
    }

    public void printNotFoundOrderItemMessage() {
        System.out.println("존재하지 않는 메뉴입니다.");
    }

    public static void printAllOrderItems(List<Coffee> coffees) {
        System.out.print("주문하신 품목은 ");
        for (Coffee coffee : coffees) {
            System.out.print(coffee.getName() + " " + coffee.getQuantity() + "개 " );
        }
        System.out.print("입니다.");
        System.out.println();
    }

    public static void printBalanceOfConsumer(int money) {
        System.out.println("남은 잔액 : " + money);
    }
}
