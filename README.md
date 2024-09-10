
# GermanyIsCalling Automation

A brief description of what this project does and who it's for


## Test Execution Steps

1. added selenium driver libraries and testng libraries 
to my project in eclipse.

2. created a common data file which consists of germanyiscalling webpage link so every testcase fetches that from commondatafile and we do not have to write that every time in test case.

3. created a base test class which consist of webdriver tasks such as open browser and close browser and we can use it in any testcase by inhereting this class so that we don't have to write it in every test case

4. made a utility methods class which consists of methods 
to take the ScreenshotOfWebPage , to take the ScreenshotOfWebElement , to fetch data from properties File

5. the use of common data file , base test class and utility methods class is that we have to use these function and data in every test case so we have created it once so that we don't have to write it every time for every test case.

6. then i've wrote 2 test cases for successfull and unsuccessfull login 

7. then i've used testng by which i've merged these 2 login test cases into a single testng xml file and i've ran that file and it will generate a report which consist data for every test case that are they working or not.

## Assumptions 

i didn't make any Assumptions , i just did testing accordingly to selenium


