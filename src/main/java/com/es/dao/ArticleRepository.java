package com.es.dao;

import com.es.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: es
 * @description: dao层
 * @author: huanshi2
 * @create: 2020-04-22 23:18
 * @email: 1557679224@qq.com
 */

@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

}
