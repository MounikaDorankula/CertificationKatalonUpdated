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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Gear/a_Bags'))

WebUI.mouseOver(findTestObject('Object Repository/LunaGearBags/Page_Bags - Gear/a_Push It Messenger Bag'))

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Bags - Gear/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Push It Messenger Bag/a_More Information'))

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Push It Messenger Bag/a_Reviews 3'))

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Push It Messenger Bag/span_Add to Wish List'))

WebUI.click(findTestObject('Object Repository/LunaGearBags/Page_Customer Login/img'))

