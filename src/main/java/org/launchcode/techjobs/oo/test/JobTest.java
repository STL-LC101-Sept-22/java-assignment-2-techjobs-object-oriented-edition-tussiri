package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllField() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(newJob instanceof Job);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(newJob.getName(), "Product tester");
        assertEquals(newJob.getEmployer().toString(), "ACME");
        assertEquals(newJob.getLocation().toString(), "Desert");
        assertEquals(newJob.getPositionType().toString(), "Quality control");
        assertEquals(newJob.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEqality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstCharacter = job1.toString().charAt(0);
        char lastCharacter = job1.toString().charAt(job1.toString().length() - 1);
        assertEquals(firstCharacter, '\n');
        assertEquals(lastCharacter, '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = "\n" +
                "ID: " + job1.getId() + '\n' +
                "Name: " + job1.getName() + '\n' +
                "Employer: " + job1.getEmployer() + '\n' +
                "Location: " + job1.getLocation() + '\n' +
                "Position Type: " + job1.getPositionType() + '\n' +
                "Core Competency: " + job1.getCoreCompetency() + '\n';

        String actual = job1.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String expected="\n"+
                "ID: 1" + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n";

        String actual = job1.toString();
        assertEquals(expected, actual);


    }
}
