package io.social.rest.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

/*
    User has : user_id, email, password, joined_date, profile_pic
*/

@Entity
@Table(name = "users")
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @NonNull
    @Column(name = "username")
    private String email;

    @NonNull
    @Column(name = "password")
    private String password;

    @Column(name = "joined_date")
    private Date joinedDate;

    @Column(name = "profile_pic")
    private String profilePic;

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
