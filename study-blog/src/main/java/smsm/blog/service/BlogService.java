package smsm.blog.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import smsm.blog.dto.ArticleDto;
import smsm.blog.entity.Article;
import smsm.blog.repository.BlogRepository;

@RequiredArgsConstructor
@Service
public class BlogService {
	
	private final BlogRepository blogRepository;
	
	
	// 블로그에 글 추가 메서드
	public Article save(ArticleDto articleDto) {
		return blogRepository.save(articleDto.toEntity());
	}

}
