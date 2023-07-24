package firstProject.io.first.dao;

import firstProject.io.first.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WordDao extends JpaRepository<Word, Integer> {

    @Query("select word from Word word where word.subLevel.level.id = :levelId")
    List<Word> findWordByLevelId(int levelId);

    List<Word> findAllBySubLevelId(int subLevelId);
}
