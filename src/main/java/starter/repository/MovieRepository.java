package starter.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import starter.model.Movie;

/**
 * @author rocyuan
 * @since 2018/1/21 上午12:39
 */

public interface MovieRepository extends ElasticsearchCrudRepository<Movie,Long> {
}
