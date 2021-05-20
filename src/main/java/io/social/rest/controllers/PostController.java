package io.social.rest.controllers;

import io.social.rest.models.Post;
import io.social.rest.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/welcome")
    public Map<String, String> welcomePost() {
        return Collections.singletonMap("post_welcome", "Welcome to Post API");
    }

    @PostMapping("/create")
    public Post createNewPost(@RequestBody Post post) {
        if(post == null) return null;
        return postService.savePost(post);
    }
    @GetMapping("/")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{postId}")
    public Optional<Post> getOnePost(@PathVariable(value = "postId") Integer postId) {
        return postService.getPostByPostId(postId);
    }

    @DeleteMapping("/{postId}")
    public boolean deletePostByPostId(@PathVariable(value = "postId") Integer postId) {
        postService.deletePostByPostId(postId);
        return true;
    }
}
