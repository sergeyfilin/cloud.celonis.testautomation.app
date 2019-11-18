package cloud.celonis.testautomation.app.testdata;

import java.util.Locale;

public class Profile {
    private String email;
    private String name;
    private Locale locale;
    private Credentials credentials;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", locale=" + locale +
                ", credentials=" + credentials +
                '}';
    }

    static class Builder{
        private Profile profile;

        private Builder() {
            profile = new Profile();
        }

        public static Builder getInstance(){
            return new Builder();
        }

        public Builder withName(String name){
            this.profile.setName(name);
            return this;
        }

        public Builder withEmail(String email){
            this.profile.setEmail(email);
            return this;
        }

        public Builder withLocale(Locale locale){
            this.profile.setLocale(locale);
            return this;
        }

        public Builder withCredentials(Credentials credentials){
            this.profile.setCredentials(credentials);
            return this;
        }

        public Profile build(){
            return this.profile;
        }
    }
}
