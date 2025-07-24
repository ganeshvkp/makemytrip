package stepdef;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom.Home;

public class Stepdef extends Base{
	Home home;
	@Given("User Enter the MakemyTrip url")
	public void user_enter_the_makemy_trip_url() {
		dr();
		maximize();
		url("https://www.makemytrip.com");
		home=new Home(driver);
	}

	@Then("Close the Login window")
	public void close_the_login_window() {
		home.closess();
	   
	}

	@Then("Click the bus")
	public void click_the_bus() throws Exception {
	    home.categoryyy();
	}

	@Then("Enter pickup and drop location")
	public void enter_pickup_and_drop_location() throws Exception {
		home.baseLoc();
	    home.destLoc();
	}

	@Then("Pick date and search the buses")
	public void pick_date_and_search_the_buses() {
	   
	}

	@Then("Filter the buses")
	public void filter_the_buses() {
	}

	@Then("Click cheapest and get the lowest price bus")
	public void click_cheapest_and_get_the_lowest_price_bus() {
	   home.cheaper();
	}

	@Then("Click select seat")
	public void click_select_seat() throws Exception {
	    home.selectBus();
	}

	@Then("Pick any berth to reserve the seat and click continue")
	public void pick_any_berth_to_reserve_the_seat_and_click_continue() {
	    
	}

	@Then("Enter the Traveller details and click continue to payment page")
	public void enter_the_traveller_details_and_click_continue_to_payment_page() throws Exception {
		home.details();
	    
	}

}
