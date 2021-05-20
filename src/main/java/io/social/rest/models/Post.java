package io.social.rest.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;

/*
  Post has : post_id, post_description, posted_date, user_id (who posted it? ), username, post_image_url

 1) Create New Post
 2) Get posts (all posts)
 3) Get specific post
 4) Delete Post

*/

@Entity
@Table(name = "posts")
public class Post {

    public Post() { }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int id;

    @NonNull
    @Column(name = "user_id")
    private int userId;

    @NonNull
    @Column(name ="posted_date")
    private Date postedDate;

    @NonNull
    @Column(name = "post_desc")
    private String postDesc;

    @NonNull
    @Column(name = "username")
    private String email;

    @NonNull
    @Column(name = "post_img_url")
    private String postImgURL;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    @NonNull
    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(@NonNull String postDesc) {
        this.postDesc = postDesc;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPostImgURL() {
        return postImgURL;
    }

    public void setPostImgURL(@NonNull String postImgURL) {
        this.postImgURL = postImgURL;
    }
}
