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

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Book Your Free Demo Now - Phptravels/strong_Login'))

WebUI.switchToWindowTitle('Login - PHPTRAVELS')

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Login - PHPTRAVELS/a_Store'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Login - PHPTRAVELS/a_Browse All'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_License'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Mobile'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Services'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_API'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_License'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Order Now'))

WebUI.setText(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/input_Domain Name_customfield12'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/button_Continue'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/span_Empty Cart'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/button_Yes'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Mobile'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Order Now_1'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/ins_Uploading Apps to Stores_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/div_Added to Cart (Remove)'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/ins_Uploading Apps to Stores_iCheck-helper_1'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/button_Continue'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_1Shopping Cart'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Edit'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/ins_Uploading Apps to Stores_iCheck-helper_1_2'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/button_Continue'))

WebUI.click(findTestObject('Object Repository/Cartpage/Page_Shopping Cart - PHPTRAVELS/a_Home'))

WebUI.closeBrowser()

WebUI.closeBrowser()

