package com.gzbook.service.like;

import com.gzbook.model.like.LikeComment;
import com.gzbook.repository.LikeCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeCommentService implements ILikeCommentService{
    @Autowired
    private LikeCommentRepository likeCommentRepository;

    @Override
    public int create(LikeComment like) {
        if (this.checkLike(like.getCommentId(), like.getUserId()) == null){
            likeCommentRepository.save(like);
            return 1;
        }
        return 0;
    }

    @Override
    public void delete(long likeId) {
        likeCommentRepository.deleteById(likeId);
    }

    @Override
    public LikeComment checkLike(long commentId, long userId) {
        return likeCommentRepository.findByCommentIdAndUserId(commentId, userId).orElse(null);
    }

    @Override
    public List<LikeComment> likeComment(long commentId) {
        return (List<LikeComment>) likeCommentRepository.findAllByCommentId(commentId);
    }
}
