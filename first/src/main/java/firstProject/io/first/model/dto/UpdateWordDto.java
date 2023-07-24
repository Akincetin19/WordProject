package firstProject.io.first.model.dto;


import lombok.Data;

@Data
public class UpdateWordDto {

    private int id;
    private String name;
    private String description;
    private String turkishMean;
    private int subLevelId;
}
