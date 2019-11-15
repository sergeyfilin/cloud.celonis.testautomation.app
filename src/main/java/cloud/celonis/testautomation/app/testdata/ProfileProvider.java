package cloud.celonis.testautomation.app.testdata;

public class ProfileProvider {
    public static Profile provideDefaultCustomer(){
        return Profile.Builder.getInstance().
                withEmail("sergii.filin@gmeail.com").
                withName("sfilin").
                withLanguage("English").
                withCredentials(new Credentials("sergii.filin@gmail.com", "Inspiron2200!")).
                build();
    }
}
