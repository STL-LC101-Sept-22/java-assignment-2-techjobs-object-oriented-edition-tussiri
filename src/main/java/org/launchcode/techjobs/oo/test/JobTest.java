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
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
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
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstCharacter = testJob1.toString().charAt(0);
        char lastCharacter = testJob1.toString().charAt(testJob1.toString().length() - 1);
        assertEquals(firstCharacter, '\n');
        assertEquals(lastCharacter, '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = "\n" +
                "ID: " + testJob1.getId() + '\n' +
                "Name: " + testJob1.getName() + '\n' +
                "Employer: " + testJob1.getEmployer() + '\n' +
                "Location: " + testJob1.getLocation() + '\n' +
                "Position Type: " + testJob1.getPositionType() + '\n' +
                "Core Competency: " + testJob1.getCoreCompetency() + '\n';

        String actual = testJob1.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String expected="\n"+
                "ID: 1" + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n";

        String actual = testJob1.toString();
        assertEquals(expected, actual);


    }
}
