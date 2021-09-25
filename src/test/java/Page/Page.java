package Page;

import Base.BasePage;
import Constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Page extends BasePage {
    public Page(WebDriver webDriver) {
        super(webDriver);

    }
    private static Logger logger = LogManager.getLogger(Page.class);

    public Page login() throws InterruptedException {
        logger.info("Siteye giris yapiliyor...");
        assertionPage(Constants.TITLE);
        click(Constants.CEREZ_KAPAT);
       hoverElement(Constants.LOGIN_MENU);
        click(Constants.GIRIS_YAP);
        sendKeys(Constants.KULLANICI_ADI,Constants.KULLANICI);
        sendKeys(Constants.SIFRENIZ,Constants.SIFRE);
        click(Constants.GIRIS_CLICK);

        logger.info("Siteye giris yapildi.");
        return this;

    }

    public Page search(){

        logger.info("Urun aramasi yapiliyor...");
        findElement(Constants.ARAMA);
        sendKeys(Constants.ARAMA,Constants.URUN);
        click(Constants.BUL);
        logger.info("Urun aramasi yapildi.");
        return this;

    }

    public Page nextPage(){
        logger.info("Sonraki sayfa aciliyor...");
        scrollToElement(Constants.SONRAKI_SAYFA);
        click(Constants.SONRAKI_SAYFA);
        logger.info("Sonraki sayfa acildi.");
        return this;

    }

    public Page checkNextPage(){
        logger.info("Sonraki sayfanın acildiği kontrol ediliyor...");
        assertionURL(Constants.SONRAKI_SAYFA_KONTROL);
        logger.info("Sonraki sayfanın acildiği kontrol edildi.");
        return this;

    }

    public Page randomClick() throws InterruptedException {
        logger.info("Rastgele urun seciliyor...");
        randomItemClick(Constants.URUNLIST);
        hoverElement(Constants.SEPETE_GIT);
        click(Constants.SEPETE_GIT);
        waitForSecond(1);
        click(Constants.SEPETIM);
        logger.info("Rastegele urun secildi ve sepete eklendi.");
        return this;
    }


    public Page checkPrice(){
        logger.info("Urun fiyati ile sepetteki fiyat kontrol ediliyor...");
        Assert.assertEquals(findElement(Constants.URUN_TUTARI).getText(),findElement(Constants.SEPET_TUTARI).getText());
        logger.info("Urun fiyati ile sepetteki fiyat kontrol edildi.");

        return this;

    }

    public Page itemCount() throws InterruptedException {
        logger.info("Urun sayisi artiriliyor...");
        selectItem(Constants.ADET,"2");
        waitForSecond(2);
        Assert.assertEquals(findElement(Constants.ADET_KONTROL).getText(),"Ürün Toplamı (2 Adet)");
        logger.info("Urun sayisi artirildi ve kontrol edildi.");
        return this;
    }

    public Page itemDelete() throws InterruptedException {
        logger.info("Urun sepetten siliniyor...");
        click(Constants.SIL);
        waitForSecond(10);
        logger.info("Urun sepetten silindi.");
        return this;
    }


}
