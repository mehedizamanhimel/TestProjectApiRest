# TestProjectWebTest


To run the project in your command line in local pc via command line: 
1. Download the project.
2. Install maven from web or via command line (npm install maven/brew install maven)
3. Open Terminal/Command line Interface.
4. copy the directory of the project folder by "cd (project folder)"
5. use the command "mvn clean install" or "mvn test" or "mvn clean test"



For running the project in your local machine via IDE:

Prerequisite to run the project via IDE
1. JDK
2. Java IDE (Eclipse/Intellij)
3. To open the project in IDE, navigate to the pom.xml file and open it
4. Open as project (if popup comes)
5. Trust the project


The project summery at a glance: 

- Project type: Maven project
- Programming Language: Java
- Automation tool: Selenium Webdriver
- Testing Framework: TestNG
- Method used for page object model: Page Factory 
- Browser initiation: WebDriverManager
- Reporting: Extent Report
- Maven compiler and test has been added as well in case user wants to run it as a maven test



**Project details in a glance**

_Before execution:_
- Maven setup has been done with all the related dependencies, build and plugin data.
- Initialised a property file to store the static data.
- Browser initiation method has been added into BaseTest class and browser keys are available in properties file.
- Browser window size, position has been set. 
- pageOne and ShoppingPage has all the elements and methods regarding operations with the webElement like click, selection, getting data and verify data.
- ExtentReport setup has been done on BaseTestClass before Execution.


_During execution:_
- Execution can be done by running SearchTest_Wiki class.
- testng xml file has been created with SearchTest class, from where tests can be executed as well. 
- Browser can be set and change from properties file, including headless browsers as well. 

_After execution:_
- Results will be showing in consoles. 
- Extent reports will be found in project>test-output>testReport.html. Open it on any browser for full detail report.
