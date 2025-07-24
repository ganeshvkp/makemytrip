package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Home extends Base {

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='commonModal__close']")
	public WebElement closeeee;

	@FindBy(xpath = "//ul[@class='makeFlex font12 headerIconsGap']/child::li[@data-cy='menu_Buses']")
	public WebElement bus;

	@FindBy(xpath = "//input[@id='fromCity']")
	public WebElement from;

	@FindBy(xpath = "//input[@placeholder='From']")
	public WebElement source;

	@FindBy(xpath = "//span[text()='Dindivanam (Tindivanam), Tamil Nadu']")
	public WebElement choosesrc;

	@FindBy(xpath = "//input[@placeholder='To']")
	public WebElement choosedest;

	@FindBy(xpath = "//span[text()='Chennai, Tamil Nadu']")
	public WebElement selectdest;

//		@FindBy(xpath = "//span[@aria-label='Next Month']")
//		public WebElement selectMonth;

	@FindBy(xpath = "//div[@aria-label='Sat Jul 26 2025']")
	public WebElement selectdate;

	@FindBy(id = "search_button")
	public WebElement select;

	// @FindBy(xpath="(//ul[@class='makeFlex font14 hrtlCenter secondaryTxt
	// sortList']/child::li)[3]|//ul[@class='SortBy_sortTabsWrapper__vVoHV']/descendant::p[.='Price']")
	@FindBy(xpath = "//li[text()='Cheapest']|//p[text()='Price']")
	public WebElement cheap;

	@FindBy(xpath = "((//div[@class='horiFilterBtn false '])[1]|//div[@class='FilterTabs_tabSection__DfwGX ']")
	public WebElement selectaAc;

	@FindBy(xpath = "//div[@class='horiFilterBtn appendRight12 ']|//div[@class='FilterTabs_tabSection__DfwGX ']/p[.='Seater']")
	public WebElement berth;

	@FindBy(xpath = "//ul[@class='dropdownWrap']/preceding::span[.='Single']|//input[@type='checkbox']")
	public WebElement quantity;

	// @FindBy(xpath="(//div[@class='searchContainer
	// appendBottom13']/input[@placeholder='Search'])[1]|//input[@placeholder='Search']")
	// public WebElement stop;
	//
	// @FindBy(xpath="//span[.='Kilambakkam Bus Stand']|//p[.='Kilambakkam Bus
	// Stand']")
	// public WebElement selectStop;

	// @FindBy(xpath="(//div[@class='time-filter-option ']/span[.='11 PM to 6
	// AM'])[1]|(//p[.='6 PM - 12 AM'])[1]")
	// public WebElement time;

	@FindBy(xpath = "//div[@data-test-id='select-seats']|//button[@class='BusCard_primaryBtn__iiHt1 ']")
	public WebElement selectBuss;

	@FindBy(xpath = "(//span[@data-testid='seat_horizontal_sleeper_available'])[13]|//div[@class='SeatMapContainer_font10__sDtwv false']")
	public WebElement UpperBerthIcon;

	@FindBy(xpath = "//li[@data-test-id='26690640']|(//div[@class='PickUpDropSelection_pickDropAddress__JcRY2'])[1]")
	public WebElement selectBoarding;

	@FindBy(xpath = "//li[@data-test-id='26689980']|//div[text()='Kilambakkam Bus Stand	']")
	public WebElement selectDest;

	@FindBy(xpath = "//div[@class='tooltipWrapper']/li/span[@data-testid='seat_horizontal_sleeper_available']|//div[@class='Tooltip_tooltipWrapper__6an7U']")
	public WebElement selectBerth;

	@FindBy(xpath = "//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']|//button[.='Continue']")
	public WebElement cont;

	@FindBy(xpath = "//input[@placeholder='Type here']|//input[@placeholder='Type here']")
	public WebElement inputText;

	@FindBy(xpath = "//input[@placeholder='eg : 24']|//input[@placeholder='eg : 24']")
	public WebElement inputAge;

	@FindBy(xpath = "//div[@class='maleTab ']|//div[@class='maleTab ']")
	public WebElement selectGender;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement inputEmail;

	@FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
	public WebElement inputNumber;

	@FindBy(xpath = "//div[@data-cy='dt_cb_input_container_gst_info']|//p[@class='checkboxWithLblWpr__label']")
	public WebElement finaly;

	@FindBy(xpath = "//div[@class='headerOuter']")
	public WebElement move;

	@FindBy(xpath = "//div[@class='mainHeading']")
	public WebElement scrolls;

	@FindBy(xpath = "//span[@class='sc-btzYZH fJUzix']")
	public WebElement filters;

	@FindBy(xpath = "//span[.='Continue']|//span[text()='Continue']")
	public WebElement done;

	public static void header() throws Exception {

		url("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|Brand-BrandVariants_DT|B_M_Makemytrip_Variants|Brand-Variants-Exact|RSA|Regular|V2|&gad_source=1&gad_campaignid=313149128&gbraid=0AAAAAD5Az1QkpL4mOXcF4Sc7_H8qObK31&gclid=Cj0KCQjw953DBhCyARIsANhIZoat7K0oLVHswfoyh_-sSSKw60CpkDPwmcJqnlA2Ha-DIElskU3zJFcaAtxJEALw_wcB");
		ss("homepage");
	}

	public void closess() {
		waits(10);
		closeeee.click();
	}

	public void categoryyy() throws Exception {
		ss("homepage1");
		bus.click();
	}

	public void baseLoc() {
		waits(5);
		from.click();

		source.sendKeys("tindivanam");
		choosesrc.click();

	}

	public void destLoc() throws Exception {
		choosedest.sendKeys("chennai");
		selectdest.click();
		// selectMonth.click();

		selectdate.click();
		ss("after selecting");
		select.click();

	}

	// public void filters() {
//			cheap.click();
////			cheap.click();
//			waits(25);

//			waits(25);
//			berth.click();
//			waits(25);
//			quantity.click();}
////			stop.sendKeys("kilam");
////			selectStop.click();
	//
//				//time.click();}

	public void cheaper() {

		waits(25);
		cheap.click();

	}

	public void selectBus() throws Exception {

		waits(20);

		selectBuss.click();

		waits(20);
		selectBerth.click();
		waits(10);

		selectBoarding.click();

		selectDest.click();
		ss("after details1");
		waits(30);

		cont.click();
	}

	public void details() throws Exception {
		inputText.sendKeys("Ganeshkumar.R");
		inputAge.sendKeys("28");
		selectGender.click();
		inputEmail.sendKeys("ganesh86758089@gmail.com");
		inputNumber.sendKeys("8610504281");
		ss("after deatils 2");
		finaly.click();
		//Thread.sleep(5000);

		filters.click();
		scrollFoot(move);
		done.click();
		ss("finish");
	}

}
