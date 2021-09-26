package testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultsPage;

public class Search_testcases extends BaseTest {

	HomePage homePage;
	ResultsPage resultPage;

	@Test(priority = 1)
	public void logo_and_searchbox_displayed() {
		homePage = new HomePage(BaseTestDriver);
		homePage.is_logo_displayed();
		homePage.is_searchbox_diplayed();
	}

	public void initiate_search(String keyword) {
		homePage = new HomePage(BaseTestDriver);
		homePage.insert_search_keyword(keyword);
	}

	@Test
	public void search_done_by_enter() {
		initiate_search("Test Automation");
		homePage.press_enter_to_search();
		Assert.assertEquals(BaseTestDriver.getTitle(), "Test Automation - Google Search");

	}

	@Test
	public void search_done_by_button() {
		initiate_search("Test Automation");
		homePage.click_on_search();
		Assert.assertEquals(BaseTestDriver.getTitle(), "Test Automation - Google Search");
	}

	@Test
	public void numberOfResults_displayed() {
		initiate_search("Test Automation");
		homePage.click_on_search();
		resultPage = new ResultsPage(BaseTestDriver);
		resultPage.is_numOfResults_displayed();
	}

	@Test
	public void timeOfResults_displayed() {
		initiate_search("Test Automation");
		homePage.click_on_search();
		resultPage = new ResultsPage(BaseTestDriver);
		resultPage.is_timeOfResults_diplayed();
	}
}
