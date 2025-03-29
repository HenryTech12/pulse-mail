package com.mail.demo.mapper;

import com.mail.demo.dto.*;
import com.mail.demo.model.*;
import java.util.*;

@Service
public class MailMapper {


       @Autowired
        private ModelMapper mapper;

         public MailDTO convert_mailmodel_to_maildto(MailModel mailModel) {
                if(!Objects.isNull(mailModel)) 
                     return mapper.map(mailModel, MailDTO.class);
                else
                     return null;
        }
  
        public MailModel convert_maildto_to_mailmodel(MailDTO mailDto) {
                if(!Objects.isNull(mailDto)) 
                    return mapper.map(mailDto, MailModel.class);
                else
                   return null;
         }

}