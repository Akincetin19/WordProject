package firstProject.io.first.service.levelService.impl;


import firstProject.io.first.dao.LevelDao;
import firstProject.io.first.entity.Level;
import firstProject.io.first.model.dto.LevelDto;
import firstProject.io.first.model.request.CreateLevelRequest;
import firstProject.io.first.model.response.GetAllLevelResponse;
import firstProject.io.first.service.levelService.LevelService;
import firstProject.io.first.utilities.ModelMapperService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LevelServiceImpl implements LevelService {

    private ModelMapperService modelMapperService;
    private LevelDao levelDao;
    @Override
    public GetAllLevelResponse getAllLevel() {

        List<Level> levels = levelDao.findAll();

        List<LevelDto> levelDtos = levels.stream()
                .map(level -> this.modelMapperService
                        .forResponse().map(level, LevelDto.class)).collect(Collectors.toList());

        GetAllLevelResponse getAllLevelResponse = new GetAllLevelResponse();
        getAllLevelResponse.setGetAllLevelResponse(levelDtos);
        return getAllLevelResponse;
    }
    @Override
    public void add(CreateLevelRequest createLevelRequest) {
        Level level = this.modelMapperService.forRequest().map(createLevelRequest, Level.class);

        this.levelDao.save(level);
    }
}
