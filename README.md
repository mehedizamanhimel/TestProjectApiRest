# TestAutomationFreeNow


To run the project in your command line in local pc: 
1. Download the project.
2. Install maven
3. copy the directory of the project folder by "cd (project folder)"
4. use the command "mvn test" or "mvn clean test" or "mvn test testng.xml"



For running the project in your local machine via IDE:

Prerequisite to run the project 
1. JDK
2. Java IDE (Eclipse/Intellij)


The project summery at a glance: 

1. Project type: Maven project
2. Programming Language: Java
3. Automation tool: Selenium Webdriver
4. Testing Framework: TestNG
5. Method used for page object model: Page Factory 
6. Browser initiation: WebDriverManager 
7. Maven compiler and test has been added as well in case user wants to run it as a maven test



Project details in a glance

Before execution:
- Maven setup has been done with all the related dependencies, build and plugin data.
- Initialised a property file to store the static data.
- Browser initiation method has been added into BaseTest class and browser keys are available in properties file.
- Browser window size, position has been set. 
- pageOne and ShoppingPage has all the elements and methods regarding operations with the webElement like click, selection, getting data and verify data.


During execution:
- Execution can be done by running SearchTest class.
- testng xml file has been created with SearchTest class, from where tests can be executed as well.
- Comment has been added for each step, including page factory classed as well. 
- Browser can be set and change from properties file, including headless browsers as well. 

After execution:
- Results are showing in consoles. 
- UI based are also available in 
	project>target>index.html (need to open in web view)
	project>target>emailable-report.html (need to open in web view)
	project>target>surefire-reports>Surefire test (need to open in web view)

