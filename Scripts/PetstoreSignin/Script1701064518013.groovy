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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/a_Sign In'))

WebUI.click(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/a_Register Now'))

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_User ID_username'), '12345')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_New password_password'), 'Test@123')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Repeat password_repeatedPassword'), 
    'Test@123')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_First name_account.firstName'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Last name_account.lastName'), 'User')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Email_account.email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Phone_account.phone'), '8786768987')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Address 1_account.address1'), 'test')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Address 2_account.address2'), 'test2')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_City_account.city'), 'Hyderabad')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_State_account.state'), 'Telangana')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Zip_account.zip'), '500001')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Country_account.country'), 'India')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Email_account.email'), 'test')

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Address 2_account.address2'), 'test2')

WebUI.selectOptionByValue(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/select_englishjapanese'), 
    'japanese', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/select_englishjapanese'), 
    'english', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/select_FISHDOGSREPTILESCATSBIRDS'), 
    'DOGS', true)

WebUI.click(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Enable MyList_account.listOption'))

WebUI.clearText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Repeat password_repeatedPassword'))

WebUI.clearText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_User ID_username'))

WebUI.click(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Email_account.email'))

WebUI.setText(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/input_Email_account.email'), 'test@gmail.com')

WebUI.click(findTestObject('Object Repository/PetStoreSignin/Page_JPetStore Demo/img'))

WebUI.closeBrowser()

