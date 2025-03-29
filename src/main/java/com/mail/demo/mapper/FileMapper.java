package com.mail.demo.mapper;

import com.mail.demo.dto.*;
import com.mail.demo.model.*;
import java.util.*;

@Service
public class FileMapper {


       @Autowired
        private ModelMapper mapper;

         public FileDTO convert_filemodel_to_filedto(FileModel fileModel) {
                if(!Objects.isNull(fileModel)) 
                     return mapper.map(fileModel, FileDTO.class);
                else
                     return null;
        }
  
        public FileModel convert_filedto_to_filemodel(FileDTO fileDto) {
                if(!Objects.isNull(fileDto)) 
                    return mapper.map(fileDto, FileModel.class);
                else
                   return null;
         }

}