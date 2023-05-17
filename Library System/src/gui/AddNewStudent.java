package gui;

public class AddNewStudent {

    private String StudID;
    private String StudName;
    private String StudPassword;
    private String StudEmail;
    private String StudAddresse;
    private String StudICity;
    private String StudContactNum;

    public AddNewStudent(String StudID, String StudName, String StudPassword, String StudEmail, String StudAddresse, String StudICity, String StudContactNum) {
        this.StudID = StudID;
        this.StudName = StudName;
        this.StudPassword = StudPassword;
        this.StudEmail = StudEmail;
        this.StudAddresse = StudAddresse;
        this.StudICity = StudICity;
        this.StudContactNum = StudContactNum;
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

    public String getStudPassword() {
        return StudPassword;
    }

    public void setStudPassword(String StudPassword) {
        this.StudPassword = StudPassword;
    }

    public String getStudEmail() {
        return StudEmail;
    }

    public void setStudEmail(String StudEmail) {
        this.StudEmail = StudEmail;
    }

    public String getStudAddresse() {
        return StudAddresse;
    }

    public void setStudAddresse(String StudAddresse) {
        this.StudAddresse = StudAddresse;
    }

    public String getStudICity() {
        return StudICity;
    }

    public void setStudICity(String StudICity) {
        this.StudICity = StudICity;
    }

    public String getStudContactNum() {
        return StudContactNum;
    }

    public void setStudContactNum(String StudContactNum) {
        this.StudContactNum = StudContactNum;
    }
    
    

}
