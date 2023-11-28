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

WebUI.navigateToUrl('https://phptravels.com/demo')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Book Your Free Demo Now - Phptravels/a_Login'))

WebUI.switchToWindowTitle('Login - PHPTRAVELS')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/label_Email Address'))

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/input_Email Address_username'), 'test')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/a_Forgot Password'))

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Lost Password Reset - PHPTRAVELS/input_Email Address_email'),
	'test')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Lost Password Reset - PHPTRAVELS/button_Submit'))

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Lost Password Reset - PHPTRAVELS/a_Portal Home'))

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/input_Email Address_username'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/input_Forgot Password_password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/button_Login'))

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Login - PHPTRAVELS/img_Shopping Cart_logo-img'))

WebUI.getWindowTitle()


