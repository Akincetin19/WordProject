package firstProject.io.first.api;


import firstProject.io.first.model.request.CreateLevelRequest;
import firstProject.io.first.model.response.GetAllLevelResponse;
import firstProject.io.first.service.levelService.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/level")

public class LevelController {

    private LevelService levelService;

    @Autowired
    public LevelController(LevelService levelService) {
        this.levelService = levelService;
    }

    @GetMapping("/getAll")
    public GetAllLevelResponse getAll() {
        return levelService.getAllLevel();
    }

    @PostMapping ("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateLevelRequest createLevelRequest) {

        this.levelService.add(createLevelRequest);

    }

}
