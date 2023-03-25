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

WebUI.comment("Open browser")
WebUI.openBrowser('')

WebUI.comment("Maximize windows")
WebUI.maximizeWindow()

WebUI.comment("Input URL")
WebUI.navigateToUrl("https://www.saucedemo.com/")

WebUI.comment("Input Username")
WebUI.setText(findTestObject('Object Repository/Input-username'), "standard_user")

WebUI.comment("Input Password")
WebUI.setText(findTestObject('Object Repository/Input-password'), "secret_sauce")

WebUI.comment("Klik Login")
WebUI.click(findTestObject('Object Repository/Click-login'))

WebUI.comment("Klik Backpack")
WebUI.click(findTestObject('Object Repository/Click-backpack'))

WebUI.comment("Klik Cart")
WebUI.click(findTestObject('Object Repository/Click-cart'))

WebUI.comment("Klik Checkout")
WebUI.click(findTestObject('Object Repository/Click-checkout'))

WebUI.comment("Klik Checkout : Your Information - First Name")
WebUI.setText(findTestObject('Object Repository/Input-YourInformation-FirstName'), "Nama Pertama")

WebUI.comment("Klik Checkout : Your Information - Last Name")
WebUI.setText(findTestObject('Object Repository/Input-YourInformation-LastName'), "Nama Kedua")

WebUI.comment("Klik Checkout : Your Information - Postal Code")
WebUI.setText(findTestObject('Object Repository/Input-YourInformation-PostalCode'), "12345")

WebUI.comment("Klik Continue")
WebUI.click(findTestObject('Object Repository/Click-Continue'))

WebUI.comment("Klik Finish")
WebUI.click(findTestObject('Object Repository/Click-Finish'))

WebUI.comment("Klik Back Home")
WebUI.click(findTestObject('Object Repository/Click-BackHome'))

//WebUI.comment("Klik Filter")
//WebUI.selectOptionByValue(findTestObject('Object Repository/Click-Filter'), "za", false)

WebUI.comment("Klik Menu")
WebUI.click(findTestObject('Object Repository/Click-Menu'))

WebUI.comment("Klik Logout")
WebUI.click(findTestObject('Object Repository/Click-logout'))






