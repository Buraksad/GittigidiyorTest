package Constants;

import org.openqa.selenium.By;

public class Constants {

    public static String LINK="https://www.gittigidiyor.com/";
    public static String TITLE="GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static By LOGIN_MENU=By.cssSelector("[data-cy='header-user-menu']");
    public static By GIRIS_YAP=By.cssSelector("[data-cy='header-login-button']");
    public static By KULLANICI_ADI=By.id("L-UserNameField");
    public static String KULLANICI="sadburaksami@gmail.com";
    public static By SIFRENIZ=By.id("L-PasswordField");
    public static String SIFRE="password123";
    public static By GIRIS_CLICK=By.id("gg-login-enter");
    public static By ARAMA=By.cssSelector("[data-cy='header-search-input']");
    public static String URUN="bilgisayar";
    public static By BUL=By.cssSelector("[data-cy='search-find-button']");
    public static By SONRAKI_SAYFA=By.cssSelector("[data-testid='paginationNext']");
    public static String SONRAKI_SAYFA_KONTROL="https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
    public static By URUNLIST=By.xpath("//div[@class='sc-533kbx-0 sc-1v2q8t1-0 iCRwxx ixSZpI sc-1n49x8z-12 bhlHZl']");
    public static By CEREZ_KAPAT=By.xpath("//*[@class='tyj39b-5 lfsBU']");
    public static By SEPETE_GIT=By.id("add-to-basket");
    public static By SEPETIM=By.xpath("//*[@class='basket-container robot-header-iconContainer-cart']");
    public static By URUN_TUTARI=By.xpath("//*[@class='total-price']");
    public static By SEPET_TUTARI=By.xpath("//*[@class='new-price']");
    public static By ADET=By.xpath("//select[@class='amount']");
    public static By ADET_KONTROL=By.xpath("//*[@class='gg-d-16 gg-m-14 detail-text']");
    public static By SIL=By.xpath("//*[@class='gg-icon gg-icon-bin-medium']");
}
