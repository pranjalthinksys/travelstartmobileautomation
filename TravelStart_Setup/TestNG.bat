set projectLocation=C:/Users/thinksysuser/eclipse-workspace/TravelStart
cd %projectLocation%

set classpath=%projectLocation%/bin;%projectLocation%/lib/*

java org.testng.TestNG %projectLocation%/src/test/resources/TestNG.xml

pause
