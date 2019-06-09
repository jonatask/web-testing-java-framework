# Web Testing Java Framework
> A test automation framework for web applications.

The purpose of this project is to demonstrate how to automate web tests using Java, Selenium, Cucumber and the approach of Page Object Model.

## Requirements

* [Java 11 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
* _IDE for Java development_ [IntelliJ](https://www.jetbrains.com/idea/)
	* Install the following plugins: _Cucumber for Java_, _Cucumber Scenarios Indexer_, _Gherkin_, _google-java-format_
* [Maven 3.6 or superior](https://maven.apache.org/)
* Environment variables in you Operational System:
	* PATH: The path of maven folder + _/bin_

## Project Structure

```
web-testing-java-framework
	driver
	properties
		system
	src.test.java
		general
			Setup.java
			Step.java
		create_account
			page_objects
			steps
			test_cases
		Automation.java
	target
```

* The _driver_ folder contains the executable file of webdriver.

* The _properties_ folder contains files with settings about the web application and your environment. You must edit these files and replace the asked information according to the environment and application you have.

* The _src.test.java_ contains packages for the modules of the application under testing.
	* _general_ package contains classes for generic purposes.
	* _test_cases_ contains test cases. Each step of a test case calls a method of step folder. Cucumber does this magic.
	* _steps_ contains the implementation for interacting with the Page Objects in order to test what the test case says. This class does not need to bother about the driver because its father Step.java has the driver.
	* _page_objects_ is an object repository for the user interface elements of that specific interface. It imports the page factories linking elements to variables and provides methods for interacting with the elements.
	* _target_ folder contains the reports of test execution.
* _Automation.java_ is the class used for running the automation via maven (mvn test). The task calls this executor class which then calls the test cases by tag. The class calls all of the test cases that contain the tag setted, e.g. @Automation.

## Test setup

Once you have the required tools installed, you may run the automation through the IDE by going to the Automation.java class and click the option Run.
You may also run just one test case by going to the .feature and then clicking the Run option.

However, when you run the tests continuously, call them via command line by the _test_ maven task.

```sh
mvn test
```

Your should see a log like this:

![](mvn_test.png)

After the tests are finished you will find the reports in _target/cucumber-html-report/index.html_
If you are running the automation through Jenkins with Cucumber plugin, then please make sure it gets the json file from _target/cucumber-html-report.json_

## Meta

Jonatas Kirsch – [Linkedin](https://linkedin.com/in/jonataskirsch)


## Contributing

1. Fork it (<https://github.com/jonatask/web-testing-java-framework/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request