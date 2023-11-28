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

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Book Your Free Demo Now - Phptravels/a_Signup'))

WebUI.switchToWindowTitle('Register - PHPTRAVELS')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Personal Information_firstname'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Personal Information_lastname'), 
    'User')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Personal Information_email'), 
    'test@gmail.com')

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/div_Personal Information_iti-arrow'))

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/li_United States1'))

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_land Islands_phonenumber'), 
    '5465576778')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Billing Address_companyname'), 
    'Clic QA')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Billing Address_address1'), 
    'Kondapur')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Billing Address_city'), 'Hyderabad')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Billing Address_state'), 'Telangana')

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Billing Address_postcode'), 
    '500001')

WebUI.selectOptionByValue(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/select_AfghanistanAland IslandsAlbaniaAlger_fb9eec'), 
    'PK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/select_AfghanistanAland IslandsAlbaniaAlger_fb9eec'), 
    'IN', true)

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/button_Generate Password'))

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Password Length_inputGeneratePasswordLength'), 
    '10')

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Generated Password_inputGeneratePassw_1aa1a9'))

WebUI.clearText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Generated Password_inputGeneratePassw_1aa1a9'))

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/div_Generated Password_col-sm-8'))

WebUI.setText(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/input_Generated Password_inputGeneratePassw_1aa1a9'), 
    'Test@123')

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/button_Copy'))

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/button_Close'))

WebUI.click(findTestObject('Object Repository/SignupPage/Page_Register - PHPTRAVELS/a_Home'))

WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)

