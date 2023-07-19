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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser('https://auto2023.myshopify.com/account/login')
WebUI.maximizeWindow()

/* cách 1 khai báo biến*/
def txt_email = "khanhdnq@firegroup.io"
def txt_password = "Khanh"
def email_list = new String[2]

/* cách 2 Array */
email_list[0] = "khanhdnq@firegroup.io"
email_list[1] = "khanhdnq+1q@firegroup.io"

/* cách 3* object Map */ 
def AccountList = [
	
		acc1: [
		
			email: "khanhdnq@firegroup.io",
			pass: "Khanh"
		
		     ],
		acc2:[
			email: "khanh+2@fregroup.io",
			pass: "Khanh01"
			
			]
	]
	
	
/* vòng lập for nhập lại 5 lần email */
//for(def i = 0; i < 5; i++) {
	
//	WebUI.setText(findTestObject('Object Repository/StoreFront/txt_email'),AccountList.acc1.email)
//}

/* hàm input email + pass*/
	
loginEmail(findTestObject('Object Repository/StoreFront/txt_email'),'khanhdnq@firegroup.io')
loginPass(findTestObject('Object Repository/StoreFront/txt_password'), 'Khanh')


def loginEmail (def inputemail, def email) {
	
	WebUI.setText(inputemail,email)
	
}

def loginPass (def inputPass, def pass) {
	
	WebUI.setText(inputPass,pass)
}


//WebUI.setText(findTestObject('Object Repository/StoreFront/txt_email'),) */
//WebUI.setText(findTestObject('Object Repository/StoreFront/txt_password'), AccountList.acc1.pass)
WebUI.click(findTestObject('Object Repository/StoreFront/btn_login'))
WebUI.takeScreenshot('storefront.png')
WebUI.closeBrowser()

