
## WilliamsProject is a coding challenge to store unique 5 digit zip code restrictions range with no over lapping

## File paths
# Source files are placed in /src/com/williams folder
# Test Units are placed in /test/com/williams folder
# WilliamsProject.Jar file is placed under dist/jar folder
# Classes are placed under bin folder
# JUnit library files placed under lib folder

## Following classes are in /src/com/williams
# TestMainChallenge.java is a class having main method
# Range.java is a class to hold lower and upper bounds of range
# IZipCodeService.java is an interface for zipcode services
# ZipCodeService.java is an implementation of IZipCodeService interface
# ZipCodeUtils.java is a util class to hold static methods used by zipcode services       

## The following test units are in /test/com/williams
# AllTests.java is test suite to run all test cases
## Following test units for positive scenario
# TestAddZipCodeRestrictionRange.java to test addZipCodeRestrictionRange 
# TestGetZipCodeRestrictionRange.java to test getZipCodeRestrictionRange
## Following test units for negative scenario
# TestNullZipCodeRange.java to test null validation
# TestInvalidZipCodeDigits.java to test invalid zipcode digit
# TestInvalidZipCodeRange.java to test invalid zipcode range

## Added ant build script in mybuild.xml

## Use following command to run main class from command prompt
# Java -jar WilliamsProject.jar
