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

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_mx_Field_4'), 'thaingocthanhdat2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Email_password'), '/9iqb8KvTohOL48Ey5Z2TQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Element/input_Email_password'), Keys.chord(Keys.ENTER))

CustomKeywords.'quocpackage.wait.DelayTime'(9500)

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Verify with Security Key'))

CustomKeywords.'quocpackage.wait.DelayTime'(500)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element 1/input_Security Key_mx_securityKey'), 'TMmBxeQ11Y7hKDLpa3QFieXKL4dDkZ5ewDn2Wv6tzTuImBkzGgwhm10PsBxcmQgWs6M9lHUZeXfLWkwcpZWyvg==')

CustomKeywords.'quocpackage.wait.DelayTime'(500)

WebUI.click(findTestObject('Object Repository/Page_Element 1/button_Continue'))

CustomKeywords.'quocpackage.wait.DelayTime'(500)

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Done'))

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.mouseOver(findTestObject('Object Repository/Page_Element  my private room for testing/div_Chi Nguyn'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Chi Nguyn/div_Chi Nguyn_mx_AccessibleButton mx_RoomTi_408976'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Chi Nguyn/span_Leave'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Chi Nguyn/button_Leave'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.mouseOver(findTestObject('Object Repository/Page_Element/div_my private room for testing'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private room for testing/div_my private room for testing_mx_Accessib_4b9a93'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private room for testing/span_Leave'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private room for testing/button_Leave'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.mouseOver(findTestObject('Object Repository/Page_Element/div_my public room for testing4'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my public room for testing4/div_my public room for testing4_mx_Accessib_e5ac43'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my public room for testing4/span_Leave'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my public room for testing4/button_Leave'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.mouseOver(findTestObject('Object Repository/Page_Element/div_Chi Nguyn'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Chi Nguyn/div_Chi Nguyn_mx_AccessibleButton mx_RoomTi_408976'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  Chi Nguyn/span_Forget Room'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.mouseOver(findTestObject('Object Repository/Page_Element/div_my private room for testing'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private room for testing/div_my private room for testing_mx_Accessib_4b9a93'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private room for testing/span_Forget Room'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.mouseOver(findTestObject('Object Repository/Page_Element/div_my public room for testing4'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my public room for testing4/div_my public room for testing4_mx_Accessib_e5ac43'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my public room for testing4/span_Forget Room'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.click(findTestObject('Object Repository/Page_Element/span_P'), FailureHandling.OPTIONAL)

WebUI.rightClick(findTestObject('Object Repository/Page_Element  public-space-for-testing-1019/span_P'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  public-space-for-testing-1019/span_Settings'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  public-space-for-testing-1019/div_Leave Space'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  public-space-for-testing-1019/button_Leave space'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.click(findTestObject('Object Repository/Page_Element/span_M'), FailureHandling.OPTIONAL)

WebUI.rightClick(findTestObject('Object Repository/Page_Element  my private space for testing/span_M'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private space for testing/span_Settings'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private space for testing/div_Leave Space'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Element  my private space for testing/button_Leave space'), FailureHandling.OPTIONAL)

CustomKeywords.'quocpackage.wait.DelayTime'(1500)

WebUI.closeBrowser(FailureHandling.OPTIONAL)

