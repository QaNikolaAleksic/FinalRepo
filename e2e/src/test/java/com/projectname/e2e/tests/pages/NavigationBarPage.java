package com.projectname.e2e.tests.pages;

import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarPage extends PageBase {
    public NavigationBarPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return CheckIfElement.isDisplayed(CustomBy.id("PHPTRAVELS"), driver);
    }

    private WebElement getDemoBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find demo button on Navigation bar page", e);
        }
    }

    public DemoPage openDemoPage() {
        getDemoBtn().click();
        return new DemoPage(driver, url, email, password);
    }

    private WebElement getFeaturesBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find features button on Navigation bar page", e);
        }
    }

    private WebElement getFlightsBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[3]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find flights button on Navigation bar page", e);
        }
    }

    public FlightsPage openFlightsPage() {
        getFlightsBtn().click();
        return new FlightsPage(driver, url, email, password);
    }

    private WebElement getCarsBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[3]/div/ul/li[6]/a/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find cars button on Navigation bar page", e);
        }
    }

    public CarsPage openCarsPage() {
        getCarsBtn().click();
        return new CarsPage(driver, url, email, password);
    }

    private WebElement getHotelsBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[3]/div/ul/li[3]/a/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find hotels button on Navigation bar page", e);
        }
    }

    public HotelsPage openHotelsPage() {
        getHotelsBtn().click();
        return new HotelsPage(driver, url, email, password);
    }

    private WebElement getPricingBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[2]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find pricing button on Navigation bar page", e);
        }
    }

    public PricingPage openPricingPage() {
        getPricingBtn().click();
        return new PricingPage(driver, url, email, password);
    }

    private WebElement getCompanyBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find company button on Navigation bar page", e);
        }
    }

    private WebElement getYoutubeBtn() {
        getCompanyBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"jfHeaderForumLink\"]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find youtube button on Navigation bar page", e);
        }
    }

    public YoutubePage openYoutubePage() {
        getYoutubeBtn().click();
        return new YoutubePage(driver, url, email, password);
    }
}
