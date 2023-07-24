package firstProject.io.first.model.dto;


import firstProject.io.first.entity.SubLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class WordDto {

    private int id;
    private String name;
    private String description;
    private String turkishMeans;
    private SubLevelDto subLevelDto;
}
