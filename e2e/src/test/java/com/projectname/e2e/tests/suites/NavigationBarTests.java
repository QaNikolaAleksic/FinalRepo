package com.projectname.e2e.tests.suites;

import com.projectname.e2e.tests.pages.*;
import com.projectname.e2e.tests.suites.common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBarTests extends TestBase {

    @Test
    public void verifyDemoButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        DemoPage demoPage = navigationBarPage.openDemoPage();

        Assert.assertTrue(demoPage.isDisplayed());
    }

    @Test
    public void verifyFlightsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        FlightsPage flightsPage = navigationBarPage.openFlightsPage();

        Assert.assertTrue(flightsPage.isDisplayed());
    }

    @Test
    public void verifyCarsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        CarsPage carsPage = navigationBarPage.openCarsPage();

        Assert.assertTrue(carsPage.isDisplayed());
    }

    @Test
    public void verifyHotelsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        HotelsPage hotelsPage = navigationBarPage.openHotelsPage();

        Assert.assertTrue(hotelsPage.isDisplayed());
    }

    @Test
    public void verifyPricingButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        PricingPage pricingPage = navigationBarPage.openPricingPage();

        Assert.assertTrue(pricingPage.isDisplayed());
    }

    @Test
    public void verifyYoutubeButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        YoutubePage youtubePage = navigationBarPage.openYoutubePage();

        Assert.assertTrue(youtubePage.isDisplayed());
    }
}
