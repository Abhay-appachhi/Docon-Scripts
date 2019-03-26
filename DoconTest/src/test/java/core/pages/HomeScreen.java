package core.pages;

import java.util.Map;
import agent.IAgent;
import central.Configuration;

public class HomeScreen extends FullPage {

	public HomeScreen(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}

	public void clickSubmit() throws Exception {
		if (getControl("btnAllow", "isVisible"))
			getControl("btnAllow").click();
		try {
			if (getControl("btnSubmit", "isVisible")) {
				getControl("btnCheckup").click();
				getControl("btnFitness").click();
				getControl("btnSubmit").click();
				waitTillElementisVisible(600, "//XCUIElementTypeButton[contains(@value,'Done')]");
				getControl("btnDone").click();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public HomeScreen enterClinic() throws Exception {
		getControl("btnEnterClinic").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
		
	}
	
	public HomeScreen createNewPatient() throws Exception {
		getControl("btnNewPatient").click();
		this.getAgent().getMobileDriver().hideKeyboard();
		getControl("txtFirstName").enterText("Test" + generateString(3));
		getControl("txtAge").enterText("" + generateRandomNumber(2));
		getControl("txtMobileNumber").enterText("6" + generateRandomNumber(9));
		getControl("btnSave").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());

	}
	
	public HomeScreen startConsultation() throws Exception {
		getControl("btnConsult").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen selectHypothyroidism() throws Exception {
		getControl("btnHyperthyroidism").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen clickTreat() throws Exception {
		getControl("btnTreat").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen adviceInvestigations() throws Exception {
		getControl("btnInvestigations").click();
		getControl("txtCBC").click();
		getControl("txtLipid").click();
		getControl("btnCap1").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen prescribeMedicines() throws Exception {
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen addFollowupDateOneWeek() throws Exception {
		getControl("btnfollowUpOneWeek").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen addFollowupDateThreeMonths() throws Exception {
		getControl("btnfollowUpThreeMonths").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}
	
	public HomeScreen addFollowupDate() throws Exception {
		getControl("btnfollowUpOneWeek").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen saveRx() throws Exception {
		getControl("btnRxSave").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}
	
	public HomeScreen selectPatient() throws Exception {
		getControl("txtPatient").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());

	}

	public HomeScreen addInvestigationDetails() throws Exception {
		getControl("btnAddInvestigation").click();
		getControl("btnXray").click();
		getControl("txtEnterValue").enterText("" + generateRandomNumber(2));
		getControl("btnDone").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen provideInstructions() throws Exception {
		getControl("btnLowFat").click();
		getControl("btnLowSalt").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen selectFoodPoisioning() throws Exception {
		getControl("btnSearch").enterText(getTestData().get("searchText"));
		getControl("txtFoodPoisoning").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen moveToGrowth() throws Exception {
		getControl("btnGrowth").click();
		getControl("btnAddData").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData());
	}

	public HomeScreen addGrowthDetails() throws Exception {
		getControl("btnAdd").click();
		getControl("btnSelect").click();
		getControl("btnSelect").click();
		getControl("txtWeight").enterText("" + generateRandomNumber(2));
		getControl("txtHeight").enterText("5." + generateRandomNumber(1));
		getControl("txtOFC").enterText("" + generateRandomNumber(2));
		getControl("btnDone").click();
 		return new HomeScreen(getConfig(), getAgent(), getTestData()); 		
	}

	public HomeScreen addProcedure() throws Exception {
		getControl("btnProcedures").click();
		getControl("btnSurgery").click();
		getControl("btnCap1").click();
 		return new HomeScreen(getConfig(), getAgent(), getTestData()); 		
	}
	
	public HomeScreen addSymptoms() throws Exception {
		getControl("btnGeneralWeakness").click();
		getControl("btnBodyache").click();
		getControl("btnHeadache").click();
		return new HomeScreen(getConfig(), getAgent(), getTestData()); 		
	}
	
	public void TC_001() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("btnNewPatient").click();
		this.getAgent().getMobileDriver().hideKeyboard();
		getControl("txtFirstName").enterText("Test" + generateString(3));
		getControl("txtAge").enterText("" + generateRandomNumber(2));
		getControl("txtMobileNumber").enterText("6" + generateRandomNumber(9));
		getControl("btnSave").click();
		getControl("btnConsult").click();
		getControl("btnHyperthyroidism").click();
		getControl("btnTreat").click();
		getControl("btnInvestigations").click();
		getControl("txtCBC").click();
		getControl("txtLipid").click();
		getControl("btnCap1").click();
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		getControl("btnfollowUpOneWeek").click();
		getControl("btnRxSave").click();
	}

	public void TC_002() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("txtPatient").click();
		getControl("btnAddInvestigation").click();
		getControl("btnXray").click();
		getControl("txtEnterValue").enterText("" + generateRandomNumber(2));
		getControl("btnDone").click();
		getControl("btnTreat").click();
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		getControl("btnRxSave").click();
	}

	public void TC_003() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("btnNewPatient").click();
		this.getAgent().getMobileDriver().hideKeyboard();
		getControl("txtFirstName").enterText("Test" + generateString(3));
		getControl("txtAge").enterText("" + generateRandomNumber(2));
		getControl("txtMobileNumber").enterText("6" + generateRandomNumber(9));
		getControl("btnSave").click();
		getControl("btnConsult").click();
		getControl("btnSearch").enterText(getTestData().get("searchText"));
		getControl("txtFoodPoisoning").click();
		getControl("btnTreat").click();
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		getControl("btnRxSave").click();
	}

	public void TC_004() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("btnNewPatient").click();
		this.getAgent().getMobileDriver().hideKeyboard();
		getControl("txtFirstName").enterText("Test" + generateString(3));
		getControl("txtAge").enterText("" + generateRandomNumber(2));
		getControl("txtMobileNumber").enterText("6" + generateRandomNumber(9));
		getControl("btnSave").click();
		getControl("btnConsult").click();
		getControl("btnGrowth").click();
		getControl("btnAddData").click();
		getControl("btnAdd").click();
		getControl("btnSelect").click();
		getControl("btnSelect").click();
		getControl("txtWeight").enterText("" + generateRandomNumber(2));
		getControl("txtHeight").enterText("5." + generateRandomNumber(1));
		getControl("txtOFC").enterText("" + generateRandomNumber(2));
		getControl("btnDone").click();
		getControl("btnTreat").click();
		getControl("btnLowFat").click();
		getControl("btnLowSalt").click();
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		getControl("btnfollowUpThreeMonths").click();
		getControl("btnRxSave").click();
	}

	public void TC_005() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("txtPatient").click();
		getControl("btnConsult").click();
		getControl("btnGrowth").click();
		getControl("btnAddData").click();
		getControl("btnAdd").click();
		getControl("btnSelect").click();
		getControl("btnSelect").click();
		getControl("txtWeight").enterText("" + generateRandomNumber(2));
		getControl("txtHeight").enterText("5." + generateRandomNumber(1));
		getControl("txtOFC").enterText("" + generateRandomNumber(2));
		getControl("btnDone").click();
		getControl("btnTreat").click();
		getControl("btnLowFat").click();
		getControl("btnLowSalt").click();
		getControl("btnBill").click();
		getControl("btnRxSave").click();
	}

	public void TC_006() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("btnNewPatient").click();
		this.getAgent().getMobileDriver().hideKeyboard();
		getControl("txtFirstName").enterText("Test" + generateString(3));
		getControl("txtAge").enterText("" + generateRandomNumber(2));
		getControl("txtMobileNumber").enterText("6" + generateRandomNumber(9));
		getControl("btnSave").click();
		getControl("btnConsult").click();
		getControl("btnGeneralWeakness").click();
		getControl("btnBodyache").click();
		getControl("btnHeadache").click();
		getControl("btnTreat").click();
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		getControl("btnfollowUpOneWeek").click();
		getControl("btnRxSave").click();
	}

	public void TC_007() throws Exception {
		clickSubmit();
		getControl("btnEnterClinic").click();
		getControl("txtPatient").click();
		getControl("btnAddInvestigation").click();
		getControl("btnXRay").click();
		getControl("txtEnterValue").enterText("x" + generateString(5));
		getControl("btnDone").click();
		getControl("btnTreat").click();
//		getControl("btnCap1").click();
		getControl("btnBill").click();
		getControl("btnRxSave").click();
	}
	

}
