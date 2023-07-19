import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys

import shopify.loginAccountShopify as LoginAcc

LoginAcc loginAccountShopify = new LoginAcc()

WebUI.openBrowser('https://apps.shopify.com/onepixel')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Install App/btn_AddApp'))

String email = 'khanhdnq@fireapps.vn'
String pass = 'Khanh_01'

loginAccountShopify.LoginAcc(email, pass)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Install App/login_with_url'))

WebUI.setText(findTestObject('Object Repository/Install App/inut_shop_url'), urlstore)

WebUI.click(findTestObject('Object Repository/Install App/btn_login'))

WebUI.click(findTestObject('Object Repository/Install App/btn_AddApp_After_Input_UrlStore'))

WebUI.click(findTestObject('Object Repository/Install App/choose_account'))

WebUI.click(findTestObject('Object Repository/Install App/btn_installApp'))

WebUI.delay(30)









