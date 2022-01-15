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

WebUI.click(findTestObject('Object Repository/Page_Element/a_Sign In (1)'))

WebUI.click(findTestObject('Object Repository/Page_Element/img (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login (2)'), 
    'TranHaiAnhDien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password (2)'), 'Fi6HYhf3eZCZa/eLonBfWw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password (2)'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Continue to your account/a_Continue (3)'))

WebUI.closeBrowser()

