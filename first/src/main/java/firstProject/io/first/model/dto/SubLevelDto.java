package firstProject.io.first.model.dto;

import firstProject.io.first.entity.Level;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class SubLevelDto {

    private int id;
    private String name;
    private LevelDto levelDto;

}
