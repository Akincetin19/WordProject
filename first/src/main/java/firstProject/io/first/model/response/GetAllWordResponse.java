package firstProject.io.first.model.response;

import firstProject.io.first.entity.SubLevel;
import firstProject.io.first.model.dto.WordDto;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class GetAllWordResponse {

    private List<WordDto> wordDtoList;


}
