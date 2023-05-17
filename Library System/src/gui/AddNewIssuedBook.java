package gui;

public class AddNewIssuedBook {
    
    private String BookCallNo;
    private String StudID;
    private String StudName;
    private String StudContact;
    private String Date;
    private String ReturnDate;

    public AddNewIssuedBook(String BookCallNo, String StudID, String StudName, String StudContact, String Date, String ReturnDate) {
        this.BookCallNo = BookCallNo;
        this.StudID = StudID;
        this.StudName = StudName;
        this.StudContact = StudContact;
        this.Date = Date;
        this.ReturnDate = ReturnDate;
    }

    public String getBookCallNo() {
        return BookCallNo;
    }

    public void setBookCallNo(String BookCallNo) {
        this.BookCallNo = BookCallNo;
    }

    public String getStudID() {
        return StudID;
    }

    public void setStudID(String StudID) {
        this.StudID = StudID;
    }

    public String getStudName() {
        return StudName;
    }

    public void setStudName(String StudName) {
        this.StudName = StudName;
    }

    public String getStudContact() {
        return StudContact;
    }

    public void setStudContact(String StudContact) {
        this.StudContact = StudContact;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    

    
    

}
