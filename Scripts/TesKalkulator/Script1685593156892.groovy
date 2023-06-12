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

Mobile.startApplication('/home/fedora-flex/Katalon Studio/EduKalkulator/androidapp/Calculator_v8.1 (403424005)_apkpure.com.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.TextView - Choose theme'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.CheckedTextView - Dark'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - 9'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button -'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - 8'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.TextView - 72'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - AC'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.TextView - 4'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - 5'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.TextView - 6'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - 6'), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.Button - (4)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Kalkulator/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

