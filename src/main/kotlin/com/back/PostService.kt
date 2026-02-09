package com.back

import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
) {
    fun findById(id: Int): Post? {
        return postRepository.findById(id)
            .also { print(it) }
            .orElse(null)
    }

    fun findAll(): List<Post> = postRepository.findAll()
}