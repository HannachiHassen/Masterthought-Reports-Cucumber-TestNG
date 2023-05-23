# Masterthought-Reports-Cucumber-TestNG

Implemention of ‘Masterthought’ Reports in Cucumber with TestNG

- Masterthought library provides pretty HTML reports for Cucumber. The cucumber JSON file is used to generate the HTML for the website. This Java report publisher was made particularly with publishing cucumber reports to the Jenkins build server in mind. It releases aesthetically pleasing HTML reports with charts displaying the outcomes of cucumber runs.

- Cucumber lacks a sophisticated reporting feature. Cucumber generates a number of simple reports as part of the BDD framework; using the output from these same reports, we can use the Masterthought reporting plugin to produce more extensive HTML reports. Masterthought reporting plugin generates not only fancy reports but also detailed ones by reading a default report ‘cucumber.json’  generated by cucumber.

# Pre-Requisite

  - Java 11 installed
  - Maven installed
  - Eclipse or IntelliJ installed

# This framework consists of:

   - Selenium – 4.3.0
   - Java 11
   - Cucumber – 7.6.0
   - Maven – 3.8.1
   - TestNG – 7.6.0
   - Cucumber Reporting Plugin – 5.7.4
    
# Implementation Steps

   - Download and Install Java on the system
   - Download and setup Eclipse IDE on the system
   - Setup Maven
   - Install Cucumber Eclipse Plugin (For Eclipse IDE)
   - Create a new Maven Project
   - Add Selenium, TestNG, Cucumber, and Masterthought dependencies to the project
   - Create a feature file under src/test/resources
   - Create the test code locating the web elements in src/main/java
   - Create the Step Definition class or Glue Code in src/test/java
   - Create a TestNG Cucumber Runner class in src/test/java
   - Create testng.xml
   - Run the tests from Command Line
   - Cucumber Report Generation

# Step 1- Download and Install Java

Cucumber and Selenium need Java to be installed on the system to run the tests.

# Step 2 – Download and setup Eclipse IDE on the system

The Eclipse IDE (integrated development environment) provides strong support for Java developers, which is needed to write Java code.

# Step 3 – Setup Maven

To build a test framework, we need to add a number of dependencies to the project. It is a very tedious and cumbersome process to add each dependency manually. So, to overcome this problem, we use a build management tool. Maven is a build management tool that is used to define project structure, dependencies, build, and test management. Click here to know How to install Maven.

# Step 4 – Install Cucumber Eclipse Plugin (Only for Eclipse IDE)

The Cucumber Eclipse plugin is a plugin that allows eclipse to understand the Gherkin syntax. The Cucumber Eclipse Plugin highlights the keywords present in Feature File. Click here to know more – Install Cucumber Eclipse Plugin.

# Step 5 – Create a new Maven Project
Below is the Maven project structure.

````
   Group Id – Cucumber
   Artifact Id – Cucumber-TestNG-Masterthought-Reports
   Version – 0.0.1-SNAPSHOT
   Package – com. Cucumber-TestNG-Masterthought-Reports
````

# Step 6 – Add Selenium, TestNG, Cucumber, and Masterthought dependencies to the project
Masterthought Dependency

```	
<dependency>
            <groupId>net.masterthought</groupId>
            <artifactId>cucumber-reporting</artifactId>
            <version>${maven.cucumber.reporting.version}</version>
</dependency>
```

Masterthought Plugin

````
<plugin>
        <groupId>net.masterthought</groupId>
        <artifactId>maven-cucumber-reporting</artifactId>
        <version>${maven.cucumber.reporting.version}</version>
 
        <executions>
            <execution>
                <id>execution</id>
                <phase>test</phase>
                <goals>
                    <goal>generate</goal>
                </goals>
                <configuration>
                    <projectName>Cucumber Reporting Example</projectName>
                    <outputDirectory>${project.build.directory}/cucumber-report-html</outputDirectory>
                    <inputDirectory>${project.build.directory}</inputDirectory>
                    <jsonFiles>
                        <param>**/*.json</param>
                    </jsonFiles>
                </configuration>
            </execution>
        </executions>
</plugin>
````

Check The complete POM.xml for for the dependencies used for the project.

# Step 7 – Create a feature file (LoginPage.feature) containing all the test scenarios under src/test/resources/features


It is recommended to create a features folder in src/test/resources directory. Create all the feature files in this features folder. Feature file should be saved as an extension of .feature

# Step 8 – Create the test code locating the web elements in src/main/java
- LoginPageLocators, HomePageLocators under src/main/java/locators
- LoginPageActions, HomePageActions under src/main/java/locators
- HelperClass under src/main/java/utils

# Step 9 – Create the Step Definition class or Glue Code in src/test/java

It is recommended to create a definitions folder in src/test/java directory. The StepDefinition files should be created in this definitions directory. within the folder called definitions.

# Step 10 – Create a TestNG Cucumber Runner class in src/test/java

We need to create a class called Runner class to run the tests. This class will use the TestNG annotation @RunWith(), which tells TestNG what is the test runner class. TestRunner should be created under src/test/java within the folder called runner.

AbstractTestNGCucumberTests – Runs each cucumber scenario found in the features as a separate test.

# Step 11 – Create testng.xml

TestNG.xml is used to run multiple tests in a single execution.

# Step 12 – Run the tests from Command Line

Use the below command to execute the tests.

```	
mvn clean test
```
# Step 13 – Cucumber Report Generation

Refresh your project and check inside \target\cucumber-html-reports that the report generated with name feature-overview.

There are different types of HTML reports gets generated as a part of the test execution cycle.

1. feature-overview – This HTML report gives an overall overview of test execution. Main HTML report which covers all different sections like Features, Tags, Steps, and Failures.
2. failures-overview – This HTML report gives an overview of all failed tests.
3. step-overview – This HTML report shows step statistics for the current cycle.
4. tag-overview – This HTML report shows passing and failing statistics for different tags used in test execution.

Congratulations on making it through this tutorial and hope you found it useful! Happy Learning!! Cheers!!

## Versioning

For the versions available, see the [tags on this repository](https://github.com/HannachiHassen/project/tags). 

## Authors

* **Hassen Hannachi** - *Initial work* - [HassenHannachi](https://github.com/HannachiHassen)

## License

This project is not under any License - Open source 
