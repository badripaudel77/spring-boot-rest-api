package io.social.rest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

/*
    User has : user_id, email, password, joined_date, profile_pic
*/

@ApiModel(description = "Details of the user")
@Entity
@Table(name = "users")
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    @ApiModelProperty(notes = "Unique auto-incrementing id of the user")
    private int id;

    @NonNull
    @Column(name = "username")
    @ApiModelProperty(notes = "Unique email of the user, can be thought of as username ")
    private String email;

    @NonNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //exclude sensitive information
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
