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

WebUI.navigateToUrl('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Customer Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/select_---Your Name---       Hermoine Grang_6e895b'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Login'))

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Withdrawl'))

WebUI.setText(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/input_Amount to be Withdrawn_form-control n_bccfe0'), 
    '1000')

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Withdraw'))

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/span_Transaction Failed. You can not withdr_4b9636'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/select_100710081009'), 'number:1008', 
    true)

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Transactions'))

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Back'))

WebUI.click(findTestObject('Object Repository/CustomerRonLogin/Page_XYZ Bank/button_Home'))

WebUI.closeBrowser()

