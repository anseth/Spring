package com.anfcorp.anand.spring02;

/**
 * Hello world!
 * 
 * Lesson 2 of Java Brains Series. 
 * This teaches how to include the spring framework in your project.
 * 
 * This has been customized for Maven.
 * 
 * How to : 
 * 1. Open up the project's POM file.
 * 2. Include the following dependency in the XML :
  		<dependencies>
		    <dependency>
		        <groupId>org.springframework</groupId>
		        <artifactId>spring-context</artifactId>
		        <version>4.1.2.RELEASE</version>
		    </dependency>
		</dependencies>
 * 3. Right click on the project root directory in Eclipse and navigate to Maven - > Update Project.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
