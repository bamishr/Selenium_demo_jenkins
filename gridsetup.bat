setx HERE %CD%
setx SELENIUM_VERSION 2.45.0
setx MAVEN_SELENIUM_SERVER C:\Users\New\Tests\src\test\resources\selenium-server-standalone\%SELENIUM_VERSION%
setx HUB_URL  http://localhost:4444/grid/register
setx CHROME_DRIVER_LOC %HERE%\src\test\resources\driver\chrome\chromedriver.exe
setx IE_DRIVER_LOC %HERE%\src\test\resources\driver\ied\IEDriverServer.exe
start java -jar %MAVEN_SELENIUM_SERVER%\selenium-server-standalone-%SELENIUM_VERSION%.jar -role hub
start java -jar %MAVEN_SELENIUM_SERVER%\selenium-server-standalone-%SELENIUM_VERSION%.jar -role webdriver -hub %HUB_URL% -Dwebdriver.chrome.driver=%CHROME_DRIVER_LOC% -Dwebdriver.ie.driver=%IE_DRIVER_LOC% -config src\test\resources\config\config.txt