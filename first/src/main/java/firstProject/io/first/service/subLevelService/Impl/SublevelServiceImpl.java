package firstProject.io.first.service.subLevelService.Impl;

import firstProject.io.first.dao.SubLevelDao;
import firstProject.io.first.entity.Level;
import firstProject.io.first.entity.SubLevel;
import firstProject.io.first.model.dto.SubLevelDto;
import firstProject.io.first.model.request.CreateSubLevelRequest;
import firstProject.io.first.model.response.GetAllSubLevelResponse;
import firstProject.io.first.service.subLevelService.SubLevelService;
import firstProject.io.first.utilities.ModelMapperService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class SublevelServiceImpl implements SubLevelService {


    private SubLevelDao subLevelDao;
    private ModelMapperService modelMapperService;
    @Override
    public void add(CreateSubLevelRequest createSubLevelRequest) {
        SubLevel subLevel = new SubLevel();
        subLevel.setName(createSubLevelRequest.getName());
        subLevel.setLevel(new Level());
        subLevel.getLevel().setId(createSubLevelRequest.getLevelId());
        this.subLevelDao.save(subLevel);
    }

    @Override
    public GetAllSubLevelResponse getAllSubLevel() {

        List<SubLevel> subLevels = this.subLevelDao.findAll();
        List<SubLevelDto> dtos = subLevels.stream().map(subLevel -> this.modelMapperService.forResponse().map(subLevel, SubLevelDto.class)).collect(Collectors.toList());
        GetAllSubLevelResponse response = new GetAllSubLevelResponse();
        response.setAllSubLevelDtoList(dtos);

        return response;
    }
}
