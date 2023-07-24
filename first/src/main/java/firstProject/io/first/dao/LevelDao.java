package firstProject.io.first.dao;

import firstProject.io.first.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelDao extends JpaRepository<Level, Integer> {

}
