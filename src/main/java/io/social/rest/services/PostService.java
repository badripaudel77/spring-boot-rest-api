package io.social.rest.services;

import io.social.rest.models.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public Post savePost(Post post);

    public List<Post> getAllPosts();

    public Optional<Post> getPostByPostId(int postId); // get one post

    public boolean deletePostByPostId(int postId); // delete one post

}
