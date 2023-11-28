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

WebUI.click(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/button_Customer Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/select_---Your Name---       Hermoine Grang_6e895b'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/select_101310141015'), 'number:1014', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/select_101310141015'), 'number:1015', 
    true)

WebUI.click(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/button_Transactions'))

WebUI.click(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/button_Logout'))

WebUI.click(findTestObject('Object Repository/CustomerNevilleLogin/Page_XYZ Bank/button_Home'))

WebUI.closeBrowser()

