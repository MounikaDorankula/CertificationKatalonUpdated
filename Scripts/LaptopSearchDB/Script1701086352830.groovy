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

WebUI.navigateToUrl('https://computer-database.gatling.io/computers')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/LaptopSearchDB/Page_Computers database/input_Computer database_f'), 'Del')

WebUI.click(findTestObject('Object Repository/LaptopSearchDB/Page_Computers database/input_Computer database_searchsubmit'))

WebUI.click(findTestObject('Object Repository/LaptopSearchDB/Page_Computers database/a_Dell Inspiron 560 Desktop Computer'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LaptopSearchDB/Page_Computers database/select_-- Choose a company --Apple Inc.Thin_aed4be'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/LaptopSearchDB/Page_Computers database/input_or_btn primary'))

WebUI.click(findTestObject('Object Repository/LaptopSearchDB/Page_Computers database/a_Computer database'))

WebUI.closeBrowser()

