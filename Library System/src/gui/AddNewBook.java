package gui;

class AddNewBook {

    private String CallNo;
    private String Name;
    private String Author;
    private String Publisher;
    private String Quantity;
    private String Date;

    public AddNewBook(String CallNo, String Name, String Author, String Publisher, String Quantity, String Date) {
        this.CallNo = CallNo;
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.Quantity = Quantity;
        this.Date = Date;
    }

    public String getCallNo() {
        return CallNo;
    }

    public void setCallNo(String CallNo) {
        this.CallNo = CallNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

   

}
