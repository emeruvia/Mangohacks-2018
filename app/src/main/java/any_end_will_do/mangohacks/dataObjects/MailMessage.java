package any_end_will_do.mangohacks.dataObjects;

/**
 * Created by jeffr on 2/3/2018.
 */

public class MailMessage {
     private String caption;
     private String abbreviatedEmail;
     private String company_name;
    
    public MailMessage(String caption, String abbreviatedemail, String company_name){
         this.caption = caption;
         this.abbreviatedEmail = abbreviatedemail;
         this.company_name = company_name;
         
     }
    public String getCompany_name() {
        return company_name;
    }

    public String getabbreviatedEmail() {

        return abbreviatedEmail;
    }

    public String getCaption() {

        return caption;
    }
}
