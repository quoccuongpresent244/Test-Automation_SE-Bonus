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

WebUI.navigateToUrl('http://localhost:8080/#/welcome')

CustomKeywords.'quocpackage.wait.DelayTime'(4000)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Sign In'))

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Element/select_UsernameEmail addressPhone'), 'login_field_email', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_mx_Field_4'), 'chinguyen171999@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Email_password'), '/9iqb8KvTohOL48Ey5Z2TQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Element/input_Email_password'), Keys.chord(Keys.ENTER))

CustomKeywords.'quocpackage.wait.DelayTime'(10000)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify with Security Key'))

CustomKeywords.'quocpackage.wait.DelayTime'(500)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Security Key_mx_securityKey'), 'SCfOyZCja+F4dtoFN5hjzkdCRikV/A+lWKMcjr/TLTlNwjQnqI5hfR+upOem8hrzUJdkm/RfN0TVoqg9zTMLqw==')

CustomKeywords.'quocpackage.wait.DelayTime'(500)

WebUI.click(findTestObject('Object Repository/Page_Element/button_Continue'))

CustomKeywords.'quocpackage.wait.DelayTime'(500)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Done'))

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Empty room (was unitoflazy)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Empty room (was unitoflazy)/div_Empty room (was unitoflazy)_mx_Accessib_1a1df8'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Empty room (was unitoflazy)/span_Leave'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Empty room (was unitoflazy)/button_Leave'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Empty room (was unitoflazy)'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Empty room (was unitoflazy)/div_Empty room (was unitoflazy)_mx_Accessib_1a1df8'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Empty room (was unitoflazy)/span_Forget Room'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

