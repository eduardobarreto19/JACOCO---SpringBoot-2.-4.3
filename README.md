# JaCoCo Java Code Coverage Library
JaCoCo is a free code coverage library for Java, which has been created by the EclEmma team based on the lessons learned from using and integration existing libraries for many years.
https://www.eclemma.org/jacoco/

## Overview
Code coverage is a software metric used to measure how many lines of our code are executed during automated tests.
In this article we're going to stroll through some practical aspects of using JaCoCo – a code coverage reports generator for Java projects.


### Maven Configuration
In order to get up and running with JaCoCo, we need to declare this maven plugin in our pom.xml file:
```sh
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.7.7.201606060606</version>
    <executions>
        <execution>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>report</id>
            <phase>prepare-package</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

The link provided here-before will always lead you to the latest version of the plugin in the maven central repository.

## Code Coverage Reports
```sh
public boolean isPalindrome(String inputString) {
    if (inputString.length() == 0) {
        return true;
    } else {
        char firstChar = inputString.charAt(0);
        char lastChar = inputString.charAt(inputString.length() - 1);
        String mid = inputString.substring(1, inputString.length() - 1);
        return (firstChar == lastChar) && isPalindrome(mid);
    }
}
```
ll we need now is a simple JUnit test:
```sh
@Test
public void whenEmptyString_thenAccept() {
    Palindrome palindromeTester = new Palindrome();
    assertTrue(palindromeTester.isPalindrome(""));
}
```
Running the test using JUnit will automatically set in motion the JaCoCo agent, thus, it will create a coverage report in binary format in the target directory – target/jacoco.exec.

Obviously we cannot interpret the output single-handedly, but other tools and plugins can – e.g. Sonar Qube.

The good news is that we can use the jacoco:report goal in order to generate readable code coverage reports in several formats – e.g. HTML, CSV, and XML.
