package io.social.rest.services.implementation;

import io.social.rest.models.Post;
import io.social.rest.repositories.PostRepository;
import io.social.rest.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post savePost(Post post) {
        if(post != null) {
            post.setPostedDate(new Date());
            Post post1 = postRepository.save(post);
            return post1;
        }
        return null;
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getPostByPostId(int postId) {
        return postRepository.findById(postId);
    }

    @Override
    public boolean deletePostByPostId(int postId) {
         postRepository.deleteById(postId);
         return true;
    }
}
