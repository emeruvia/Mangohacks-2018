package any_end_will_do.mangohacks.dataBase;

/**
 * Created by Andre on 2/4/2018.
 */

public class Users {

    private String name;
    private String email;
    private String company;
    private String industry;
    private String phone;

    public Users(String email, String name, String industry){
        this.email = email;
        this.name = name;
        this.industry = industry;
    }

    public Users(String email, String name, String industry, String company, String phone){
        this.email = email;
        this.name = name;
        this.industry = industry;
        this.company = company;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public String getIndustry() {
        return industry;
    }

    public String getPhone() {
        return phone;
    }


    public void addCompany(String company){
        this.company = company;
    }

    public void addIndustry(String industry){
        this.industry = industry;
    }
}
