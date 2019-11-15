package cloud.celonis.testautomation.app.testdata;

public class Profile {
    private String email;
    private String name;
    private String language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "profile{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
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

        public Builder withLanguage(String language){
            this.profile.setLanguage(language);
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
