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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_Element/div_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_username'), 'duongbaochan')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Username_password'), 'IQFKYN2jkfmAqXBig6/rwA==')

WebUI.click(findTestObject('Object Repository/Page_Element/input_Forgot password_mx_Login_submit'))

CustomKeywords.'waittime.waitime.DelayTime'(15000)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify with Security Key'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Security Key_mx_securityKey'), 'xTmtDLU/+Pw72qcIFIHgTBrPNnRrUBLH2f7lCaKlSB3MCqBRMzUW01sE2neRgMni6x74TaadAN2IRhb8mQHzqw==')

WebUI.click(findTestObject('Object Repository/Page_Element/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Element/div_Done'))

WebUI.closeBrowser()

