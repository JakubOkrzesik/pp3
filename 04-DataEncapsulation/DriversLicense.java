public class DriversLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String yearOfIssue;
    private String category;


    DriversLicense(String name, String surname, String address, String postalCode, String YOI, String category){
        this.setName(name);
        this.setSurname(surname);
        this.setAddress(address);
        this.setPostalCode(postalCode);
        this.setYear(YOI);
        this.setCategory(category);
    }




    public String getName(){
        return name;
    }

    public void setName(String newName){
        
        newName = newName.substring(0,1).toUpperCase() + newName.substring(1);
        
        name = newName;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String newSurname){
        surname = newSurname;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        address = newAddress;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String newPostalCode){
        postalCode = newPostalCode;
    }
    
    public String getYear(){
        return yearOfIssue;
    }

    public void setYear(String newYear){
        yearOfIssue = newYear;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String newCategory){
        category = newCategory;
    }

    public String toString(){
        return "Name: " + name + "Surname: " + surname + "Address: " + address + "Postal code: " + postalCode + "YOI: " + yearOfIssue + "Category: " + category;
    }
    
    public static void main(String args[]){
        DriversLicense driver = new DriversLicense("Siema","Eniu","Kerfusiowa","42-069","2005","B2");
        System.out.println(driver);
    }

}
