package core.pages;

import java.util.Map;

import agent.IAgent;
import central.Configuration;

public class Hypothyroidism extends FullPage {

	public Hypothyroidism(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}

	public void TC01() throws Exception {
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
		getControl("btnCap1").click();
		getControl("btnClose").click();
		getControl("btnCap2").click();
		getControl("btnClose").click();
		getControl("btnInvestigations").click();
		getControl("txtCBC").click();
		getControl("txtLipid").click();
		getControl("btnBill").click();
		getControl("btnfollowUp").click();
		getControl("btnRxSave").click();
	}
	
	
	public void TC02() throws Exception {
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
		getControl("btnCap1").click();
		getControl("btnClose").click();
		getControl("btnCap2").click();
		getControl("btnClose").click();
		getControl("btnInvestigations").click();
		getControl("txtCBC").click();
		getControl("txtLipid").click();
		getControl("btnBill").click();
		getControl("btnfollowUp").click();
		getControl("btnRxSave").click();
	}


	public void clickSubmit() throws Exception {
		if (getControl("btnAllow", "isVisible"))
			getControl("btnAllow").click();
		try {
			if (getControl("btnSubmit", "isVisible")) {
				getControl("btnSubmit").click();
				getControl("btnDone").wait(120000);
				getControl("btnDone").click();
			}

		} catch (Exception e) {
		}

	}

}
