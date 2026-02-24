package com.back.post.repository;

import com.back.domain.post.entity.Post;
import com.back.domain.post.repositoty.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
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
}
