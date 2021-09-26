package testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultsPage;

public class Search_testcases extends BaseTest {

	HomePage homeP;
	ResultsPage resultP;

	@Test(priority = 1)
	public void logo_and_searchbox_displayed() {
		homeP = new HomePage(BaseTestDriver);
		homeP.is_logo_displayed();
		homeP.is_searchbox_diplayed();
	}

	public void initiate_search(String keyword) {
		homeP = new HomePage(BaseTestDriver);
		homeP.insert_search_keyword(keyword);
	}

	@Test
	public void search_done_by_enter() {
		initiate_search("Test Automation");
		homeP.press_enter_to_search();
		Assert.assertEquals(BaseTestDriver.getTitle(), "Test Automation - Google Search");

	}

	@Test
	public void search_done_by_button() {
		initiate_search("Test Automation");
		homeP.click_on_search();
		Assert.assertEquals(BaseTestDriver.getTitle(), "Test Automation - Google Search");
	}

	@Test
	public void numberOfResults_displayed() {
		initiate_search("Test Automation");
		homeP.click_on_search();
		resultP = new ResultsPage(BaseTestDriver);
		resultP.is_numOfResults_displayed();
	}

	@Test
	public void timeOfResults_displayed() {
		initiate_search("Test Automation");
		homeP.click_on_search();
		resultP = new ResultsPage(BaseTestDriver);
		resultP.is_timeOfResults_diplayed();
	}
}
