package firstProject.io.first.utilities;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {


    ModelMapper forRequest();
    ModelMapper forResponse();
}
