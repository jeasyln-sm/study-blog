package smsm.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import smsm.blog.entity.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ArticleDto {
	
	private String title;
	
	private String content;
	
	
	// dto -> entity
	public Article toEntity() {
		return Article.builder()
				.title(title)
				.content(content)
				.build();
	}

}
