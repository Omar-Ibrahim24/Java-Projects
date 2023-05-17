package gui;


public class AddNewLibrarian {
    private String ID;
    private String Name;
    private String Password;
    private String Email;
    private String Addresse;
    private String City;
    private String ContactNo;

    public AddNewLibrarian(String ID, String Name, String Password, String Email, String Addresse, String City, String ContactNo) {
        this.ID = ID;
        this.Name = Name;
        this.Password = Password;
        this.Email = Email;
        this.Addresse = Addresse;
        this.City = City;
        this.ContactNo = ContactNo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddresse() {
        return Addresse;
    }

    public void setAddresse(String Addresse) {
        this.Addresse = Addresse;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
    
    
}
