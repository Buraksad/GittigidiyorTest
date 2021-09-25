package Test;

import Base.BaseTest;
import Page.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PageTest extends BaseTest {

    Page page;

    private static Logger logger = LogManager.getLogger(PageTest.class);

    @Before
    public void before(){
        logger.info("Driver calistiriliyor...");
        page=new Page(getWebDriver());
        logger.info("Driver calisti.");
    }

    @Test
    public void testPage() throws InterruptedException {

        logger.info("Test baslatiliyor...");
        page.login().search().nextPage().checkNextPage().randomClick().checkPrice().itemCount().itemDelete();
        logger.info("Test basariyla sonuclandi.");
    }

    @After
    public void after(){
        logger.info("Driver kapatiliyor...");
        tearDown();
        logger.info("Driver kapatildi.");
    }
}
