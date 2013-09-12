package com.jbrunton.daggerdemo.models;

/**
 * Created by John on 12/09/2013.
 */
public class User {
    private int id;
    private String email;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return String.format("%1s %2s", firstName, lastName);
    }

    public static class Builder {
        private User user = new User();

        public User getInstance() {
            return user;
        }

        public Builder setId(int id) {
            user.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            user.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }
    }
}
