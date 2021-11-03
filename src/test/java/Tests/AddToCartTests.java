package Tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AddToCartTests extends BaseTests {

    @Test
    public void checkAddToCart(){
        getHomePage().clickProductCatalog();
        getHomePage().clickAppleStoreButton();
        getAppleStorePAge().clickIPhoneButton();
        getIPhonePage().waitForLoadPAgeComplete(30);
        getIPhonePage().clickAddToCartButtonList();
        getIPhonePage().waitVisibilityOfElement(30,getIPhonePage().getAddToCartPopup());
        getIPhonePage().clickContinueShoppingButton();
        assertEquals(getHomePage().getTextOfAmountOfProductsInCArt(), "1");
    }
}
