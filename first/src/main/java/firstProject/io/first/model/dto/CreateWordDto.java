package firstProject.io.first.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class CreateWordDto {

    private String name;
    private String description;
    private String turkishMean;
    private int subLevelId;
}
