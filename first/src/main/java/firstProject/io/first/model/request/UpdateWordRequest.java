package firstProject.io.first.model.request;


import firstProject.io.first.model.dto.UpdateWordDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateWordRequest {

    private UpdateWordDto updateWordDto;

}
