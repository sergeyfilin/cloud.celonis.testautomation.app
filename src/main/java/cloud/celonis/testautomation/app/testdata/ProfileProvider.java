package cloud.celonis.testautomation.app.testdata;

import java.util.Locale;

public class ProfileProvider {
    public static Profile provideDefaultCustomer(){
        return Profile.Builder.getInstance().
                withEmail("sergii.filin@gmeail.com").
                withName("sfilin").
                withLocale(new Locale("en", "DE")).
                withCredentials(new Credentials("sergii.filin@gmail.com", "Inspiron2200!")).
                build();
    }
}
