package sf.projects.fizzbuzz.jbehave;


import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InstanceStepsFactory;

public class PlayFizzBuzz
  extends JUnitStory
{

  public PlayFizzBuzz()
  {
    addSteps(new InstanceStepsFactory(configuration(), new PlayFizzBuzzSteps())
      .createCandidateSteps());
  }

  @Override
  public Configuration configuration()
  {
    return super
      .configuration()
      .useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE,
                                                                      Format.TXT,
                                                                      Format.HTML));
  }
}
