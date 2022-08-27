package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Validar extends PageObject {



    public static final Target ITEM1 = Target
            .the("item1")
            .located(By.xpath("//div[@id='content']/ul/li[7]/a[2]"));

    public static final Target ITEM2 = Target
            .the("item2")
            .located(By.xpath("//div[@id='content']/ul/li[6]/a[2]"));

    public static final Target CART = Target
            .the("cart")
            .located(By.xpath("//li[@id='wpmenucartli']/a/span[2]"));

    public static final Target DELETE = Target
            .the("delete")
            .located(By.cssSelector(".cart_item:nth-child(1) .remove"));

    public static final Target PRICE = Target
            .the("price")
            .located(By.cssSelector("strong > .woocommerce-Price-amount"));



}
