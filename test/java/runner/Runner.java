package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/features/Login.feature",glue="steps",monochrome=true,dryRun=true,snippets=SnippetType.CAMELCASE)
//@CucumberOptions(features="src/test/java/features/CreateLead.feature",glue="steps",monochrome=true,dryRun=true,snippets=SnippetType.CAMELCASE)
public class Runner extends AbstractTestNGCucumberTests{

}
