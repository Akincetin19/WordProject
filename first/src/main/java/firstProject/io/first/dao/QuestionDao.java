package firstProject.io.first.dao;

import firstProject.io.first.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findBySubLevelId(int subLevelId);
}
