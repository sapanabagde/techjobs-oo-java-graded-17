package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
     @Test
    public void testSettingJobId() {
        Job job1= new Job();
        Job job2= new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String newline = "\n";
        Job test6 = new Job("Web Developer",new Employer("Launch Code"), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        String print = test6.toString();
        assertTrue(print.startsWith(newline));
        assertTrue(print.endsWith(newline));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Web Developer",new Employer("Launch Code"), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        String print = job1.toString();
        assertTrue(print.contains("ID: "));
        assertTrue(print.contains("Name: "));
        assertTrue(print.contains("Employer: "));
        assertTrue(print.contains("Position Type: "));
        assertTrue(print.contains("Core Competency: "));
        assertTrue(print.contains(job1.getName()));
        assertTrue(print.contains(job1.getEmployer().getValue()));
        assertTrue(print.contains(job1.getLocation().getValue()));
        assertTrue(print.contains(job1.getPositionType().getValue()));
        assertTrue(print.contains(job1.getCoreCompetency().getValue()));

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test8 = new Job("Web Developer",new Employer(""), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        String print = test8.toString();
       assertTrue(print.contains("Employer: Data not available"));
    }

    @Test
    public void testToStringHandlesOptionalAllBlanks() {
        Job test9 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String print = test9.toString();
        assertEquals("OOPS! This job does not seem to exist.", print);
    }
}
