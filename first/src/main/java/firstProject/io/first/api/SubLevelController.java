package firstProject.io.first.api;


import firstProject.io.first.model.request.CreateSubLevelRequest;
import firstProject.io.first.model.response.GetAllSubLevelResponse;
import firstProject.io.first.service.subLevelService.SubLevelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subLevel")
@AllArgsConstructor
public class SubLevelController {

    private SubLevelService subLevelService;


    @GetMapping("/getall")
    public GetAllSubLevelResponse getAll() {
        return this.subLevelService.getAllSubLevel();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateSubLevelRequest createSubLevelRequest){
        this.subLevelService.add(createSubLevelRequest);
    }
}
