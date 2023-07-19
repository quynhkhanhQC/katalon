package shopify

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginShopifyPartner {

	public void loginPartner(String email, String password) {

		TestObject btn_Add_App = findTestObject('Object Repository/Login Shopify Partner/Btn_AddApp')

		TestObject txt_input_email = findTestObject('Object Repository/Login Shopify Partner/txt_input_email')

		TestObject btn_contineu = findTestObject('Object Repository/Login Shopify Partner/btn_contineu')

		TestObject txt_input_password = findTestObject('Object Repository/Login Shopify Partner/txt_input_password')

		TestObject btn_login = findTestObject('Object Repository/Login Shopify Partner/btn_login')

		//-----Action UI-------------------------------------------------------------------------

		WebUI.click(btn_Add_App)

		WebUI.click(txt_input_email)

		WebUI.setText(txt_input_email, email)

		WebUI.click(btn_contineu)

		WebUI.click(txt_input_password)

		WebUI.setText(txt_input_password, password)

		WebUI.click(btn_login)

	}
}
