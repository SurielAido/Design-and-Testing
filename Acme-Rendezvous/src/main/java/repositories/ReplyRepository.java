
package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Reply;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Integer> {

}
