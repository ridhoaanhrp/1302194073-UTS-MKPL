package lib;

public class User {
    private String firstName;
    private String lastName;
    private String userId;
    private String address;

    public User(String firstName, String lastName, String userId, String address){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId(){
        return userId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
}
