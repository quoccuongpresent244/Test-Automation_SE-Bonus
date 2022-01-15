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

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Element/select_UsernameEmail addressPhone'), 'login_field_email', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Element/input_Sign in with_mx_Field_4'), 'quoccuongpresent@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Element/input_Email_password'), 'poP8xRBGBA/CpbkjbGJTPg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Element/input_Email_password'), Keys.chord(Keys.ENTER))

CustomKeywords.'custompack.wait.DelayTime'(15000)

WebUI.click(findTestObject('Object Repository/Page_Element/div_Verify with another device'))

CustomKeywords.'custompack.wait.DelayTime'(10000)

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Verify other device_mx_AccessibleButton_7edffc'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/img_Enable_mx_BaseAvatar_image'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/span_All settings'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/input_Profile_mx_Field_5'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_GeneralAppearanceNotificationsPreferenc_17e541'))

WebUI.setText(findTestObject('Object Repository/Page_Element 1/input_Profile_mx_Field_5'), 'AnhQuoc')

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Save'))

WebUI.click(findTestObject('Object Repository/Page_Element 1/div_Settings_mx_AccessibleButton mx_Dialog__4987e8'))

WebUI.closeBrowser()

