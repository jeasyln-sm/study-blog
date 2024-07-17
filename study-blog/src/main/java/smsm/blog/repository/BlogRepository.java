package smsm.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smsm.blog.entity.Article;

public interface BlogRepository extends JpaRepository<Article, Long>{

}
