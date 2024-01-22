package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.lang.System.lineSeparator;
public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id= nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString(){

//        if(name.equals("")){
//            name =  "Data not available";
//        }
//        if(employer.getValue().equals("")){
//            employer = new Employer("Data not available") ;
//        }
//        if(location.getValue().equals("")){
//            location = new Location("Data not available");
//        }
//        if(positionType.getValue().equals("")){
//            positionType =  new PositionType("Data not available");
//        }
//        if(coreCompetency.getValue().equals("")){
//            coreCompetency =  new CoreCompetency("Data not available");
//        }
//
//        return "\nID: " + id +
//                "\nName: " + name +
//                "\nEmployer: " + employer +
//                "\nLocation: " + location +
//                "\nPosition Type: " + positionType +
//                "\nCore Competency: " + coreCompetency +
//                "\n";
        String newLine = "\n";
//
        if ((this.getName().isEmpty()) && (this.getEmployer().getValue().isEmpty()) && (this.getLocation().getValue().isEmpty()) && (this.getPositionType().getValue().isEmpty()) && (this.getCoreCompetency().getValue().isEmpty())){
            return "OOPS! This job does not seem to exist.";
        } else {
            return newLine +
                    "ID: " + this.id + newLine +
                    "Name: " + (this.name == "" || this.name == null ? "Data not available" : this.name) + newLine +
                    "Employer: " + (this.getEmployer().getValue() == "" || this.getEmployer().getValue() == null ? "Data not available" : this.getEmployer().getValue()) + newLine +
                    "Location: " + (this.getLocation().getValue() == "" || this.getLocation().getValue() == null ? "Data not available" : this.getLocation().getValue()) + newLine +
                    "Position Type: " + (this.getPositionType().getValue() == "" || this.getPositionType().getValue() == null ? "Data not available" : this.getPositionType().getValue()) + newLine +
                    "Core Competency: " + (this.getCoreCompetency().getValue() == "" || this.getCoreCompetency().getValue() == null ? "Data not available" : this.getCoreCompetency().getValue()) +
                    newLine;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
//        return id == job.id &&
//                name.equals(job.name) &&
//                employer.equals(job.employer) &&
//                location.equals(job.location) &&
//                positionType.equals(job.positionType) &&
//                coreCompetency.equals(job.coreCompetency);
        return getId() == job.getId() &&
                getName() == job.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
