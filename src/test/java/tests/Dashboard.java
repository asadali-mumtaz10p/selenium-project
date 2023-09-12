package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.DashboardLoc;

public class Dashboard extends LoginPage {
    @Override
    public void login() throws InterruptedException {
        super.login();
    }

    @Test(description = "Verify the Dashboard text and open Leaves Request")
    public void dashboardCase1() throws InterruptedException {
        DashboardLoc DBL = new DashboardLoc();
        DBL.dashboard1();

    }

}