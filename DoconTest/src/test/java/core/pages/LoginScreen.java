package core.pages;

import java.util.Map;

import org.openqa.selenium.Keys;

import agent.IAgent;
import central.Configuration;

public class LoginScreen extends FullPage {

	public LoginScreen(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
		super(conf, agent, testData);
		assertPageLoad();
	}

	private void login() throws Exception {

		getControl("txtEmail").enterText(getTestData().get("email"));
		getControl("btnProceed").click();
		getControl("txtPassword").enterText(getTestData().get("password"));
		this.getAgent().getMobileDriver().getKeyboard().pressKey(Keys.ENTER);
		enterPasscode();
	}

	public HomeScreen onBoardingAcitvity() throws Exception {

		if (getControl("txtEmail", "isVisible")) {
			login();
		} else if (getControl("txtPasscode", "isVisible")) {
			enterPasscode();
		}

		return new HomeScreen(getConfig(), getAgent(), getTestData());

	}

	private void enterPasscode() throws Exception {
		for (int i = 0; i < 4; i++) {
			getControl("btnPin").click();
		}

	}

}
