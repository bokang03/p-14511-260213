package com.back.post.repository;

import com.back.domain.post.entity.Post;
import com.back.domain.post.repositoty.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Transactional
@Rollback
@ActiveProfiles("test")
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    void t1() {
        Post post1 = postRepository.findById(2).get();

        assertThat(post1.getId()).isEqualTo(2);
        assertThat(post1.getTitle()).isEqualTo("제목2");
        assertThat(post1.getContent()).isEqualTo("내용2");
    }

    @Test
    void t2() {

        Post post = new Post("제목3", "내용3");


        Post savedPost = postRepository.save(post);

        assertThat(savedPost.getId()).isNotNull();
        assertThat(savedPost.getTitle()).isEqualTo("제목3");
        assertThat(savedPost.getContent()).isEqualTo("내용3");
    }

    @Test
    void t3() {
        long cnt = postRepository.count();
        assertThat(cnt).isEqualTo(2);
    }

}
