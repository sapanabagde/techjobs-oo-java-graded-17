package org.launchcode.techjobs.oo;
import java.util.Objects;

// Create Abstract class for common fields in Employer.java, Location.java, CoreCometency.java and PostionType.java
// id
//nextId
//value
public abstract class JobField {
    private final int id;
    private static int nextId = 1;
    private String value;
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
   //     return getId() == jobField.getId();
        return id == jobField.id;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
}
