package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentData {
    private final StringProperty ID;
    private final StringProperty firsName;
    private final StringProperty lastName;
    private final StringProperty email;
    private final StringProperty DOB;

    //constructoy


    public StudentData(String ID,
                       String firsName,
                       String lastName,
                       String email,
                       String DOB) {
        this.ID = new SimpleStringProperty(ID);
        this.firsName = new SimpleStringProperty (firsName);
        this.lastName = new SimpleStringProperty (lastName);
        this.email = new SimpleStringProperty (email);
        this.DOB = new SimpleStringProperty (DOB);
    }
    //getter and setter  methods


    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

//    public void setID(String ID) {
//        this.ID.set(ID);
//    }

    public String getFirsName() {
        return firsName.get();
    }

    public StringProperty firsNameProperty() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName.set(firsName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getDob() {
        return DOB.get();
    }

    public StringProperty dobProperty() {
        return DOB;
    }

    public void setDob(String DOB) {
        this.DOB.set(DOB);
    }
}//class
