package any_end_will_do.mangohacks.dataObjects;

/**
 * Created by jeffr on 2/4/2018.
 */

public class UserProfile {
    private String companyName;
    private String emailAddress;
    private String address;
    private String phoneNumber;
    private int likes;

    public UserProfile(String companyName, String emailAddress, String address, String phoneNumber){
        this.companyName = companyName;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {

        return address;
    }

    public String getEmailAddress() {

        return emailAddress;
    }

    public String getCompanyName() {

        return companyName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

