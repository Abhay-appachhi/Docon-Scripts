package core.tests;

import org.testng.annotations.Test;

public class Scenarios extends SupportTest {

	@Test(description = "Create new patient for Hypothyroidism")
	public void createPatientWithHypothyroidism() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().createNewPatient().startConsultation().selectHypothyroidism()
				.clickTreat().adviceInvestigations().prescribeMedicines().addFollowupDateOneWeek().saveRx();
	}

	@Test(description = "Update Hypothyroidism Patient Details")
	public void selectPatientUpdateDetailsWithHypothyroidism() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().selectPatient().addInvestigationDetails().clickTreat()
				.prescribeMedicines().saveRx();
	}

	@Test(description = "Create new patient for Food Poisioning")
	public void createPatientWithFoodPoisioning() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().createNewPatient().startConsultation().selectFoodPoisioning()
				.clickTreat().prescribeMedicines().saveRx();
	}

	@Test(description = "Create new patient for Growth Details")
	public void createPatientWithGrowthDetails() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().createNewPatient().startConsultation().moveToGrowth()
				.addGrowthDetails().clickTreat().provideInstructions().prescribeMedicines().addFollowupDateThreeMonths()
				.saveRx();
	}

	@Test(description = "Update Growth Details of patient")
	public void updateGrowthDetailsofPatient() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().selectPatient().startConsultation().moveToGrowth()
				.addGrowthDetails().clickTreat().provideInstructions().prescribeMedicines().saveRx();
	}

	@Test(description = "Create new patient for Surgery")
	public void createPatientforSurgery() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().createNewPatient().startConsultation().addSymptoms().clickTreat()
				.prescribeMedicines().saveRx();
	}

	@Test(description = "Update Patient details of Surgery")
	public void updateSurgeryPatientDetails() throws Exception {
		loginPage.onBoardingAcitvity().enterClinic().selectPatient().addInvestigationDetails().clickTreat()
				.prescribeMedicines().saveRx();
	}

}
