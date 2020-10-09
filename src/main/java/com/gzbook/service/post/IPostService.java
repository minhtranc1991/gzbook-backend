package com.gzbook.service.post;

import com.gzbook.model.post.Post;

public interface IPostService {
    Post findPostById(Long id);

    Post savePost(Post post);

    void deletePost(Long id);
}
