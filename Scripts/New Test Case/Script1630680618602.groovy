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

Mobile.startApplication('/Users/ridvan/Desktop/i2icom.app', true)

Mobile.tap(findTestObject('Object Repository/Testing/XCUIElementTypeButton'), 0)

Mobile.setText(findTestObject('Object Repository/Testing/XCUIElementTypeTextField'), '535384193123091', 0)
Mobile.waitForElementPresent(findTestObject('Object Repository/Testing/XCUIElementTypeTextField'), 10)

Mobile.setEncryptedText(findTestObject('Object Repository/Testing/XCUIElementTypeSecureTextField'), '123', 0)
Mobile.waitForElementPresent(findTestObject('Object Repository/Testing/XCUIElementTypeSecureTextField'), 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/Testing/XCUIElementTypeButton - LOGIN'), 10)
Mobile.tap(findTestObject('Object Repository/Testing/XCUIElementTypeButton - LOGIN'), 0)
Thread.sleep(10000)
Mobile.closeApplication()

