import com.learn.pattern.BookShop;
/*
Prototype is part of creational design pattern.
When Object creation is very costly (time / memory consuming), we used this pattern.
In this design pattern we clone existing object by using shallow or deep cloning according to requirement.
 */
public class PatternTest {
    public static void main(String a[]) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Har Book");
        bookShop.loadBooks();

        BookShop bookShop1 = bookShop.clone();
        bookShop.getBooks().remove(1);
        bookShop1.setShopName("Every Book");
        System.out.println(bookShop);

        System.out.println(bookShop1);


    }
}
