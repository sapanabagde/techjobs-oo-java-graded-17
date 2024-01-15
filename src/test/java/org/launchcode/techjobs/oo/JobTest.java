package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;
public class JobTest {
    //TODO: Create your unit tests here
    Job test1= new Job();
    Job test2= new Job();

    @Test
    public void testSettingJobId() {
        Job test1= new Job();
        Job test2= new Job();
        assertEquals(test1.getId(), test2.getId(), 1);
        assertNotEquals(test1.getId(), test2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test3= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test3.getName() instanceof String);
        assertTrue(test3.getEmployer() instanceof Employer);
        assertTrue(test3.getLocation() instanceof Location);
        assertTrue(test3.getPositionType() instanceof PositionType);
        assertTrue(test3.getCoreCompetency() instanceof CoreCompetency);


        assertEquals("Product tester", test3.getName());
        assertEquals("ACME", test3.getEmployer().getValue());
        assertEquals("Desert", test3.getLocation().getValue());
        assertEquals("Quality control", test3.getPositionType().getValue());
        assertEquals("Persistence", test3.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality() {
        Job test4 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test5 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test4.equals(test5),false);
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String newline = System.lineSeparator();
        Job test6 = new Job("Web Developer",new Employer("Launch Code"), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        String print = test6.toString();
        assertTrue(print.startsWith(newline));
        assertTrue(print.endsWith(newline));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test7 = new Job("Web Developer",new Employer("Launch Code"), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        String print = test7.toString();
        assertTrue(print.contains("ID: "));
        assertTrue(print.contains("Name: "));
        assertTrue(print.contains("Employer: "));
        assertTrue(print.contains("Position Type: "));
        assertTrue(print.contains("Core Competency: "));
        assertTrue(print.contains(test7.getName()));
        assertTrue(print.contains(test7.getEmployer().getValue()));
        assertTrue(print.contains(test7.getLocation().getValue()));
        assertTrue(print.contains(test7.getPositionType().getValue()));
        assertTrue(print.contains(test7.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test8 = new Job("Web Developer",new Employer(), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        String print = test8.toString();
        assertTrue(print.contains("Employer: Data not available"));
    }


}
