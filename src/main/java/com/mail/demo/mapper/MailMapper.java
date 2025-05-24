package com.mail.demo.mapper;

import com.mail.demo.dto.*;
import com.mail.demo.model.*;
<<<<<<< HEAD
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
import java.util.*;

@Service
public class MailMapper {


       @Autowired
        private ModelMapper mapper;

<<<<<<< HEAD
         public MailDTO convertToDTO(MailModel mailModel) {
=======
         public MailDTO convert_mailmodel_to_maildto(MailModel mailModel) {
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
                if(!Objects.isNull(mailModel)) 
                     return mapper.map(mailModel, MailDTO.class);
                else
                     return null;
        }
  
<<<<<<< HEAD
        public MailModel convertToModel(MailDTO mailDto) {
=======
        public MailModel convert_maildto_to_mailmodel(MailDTO mailDto) {
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
                if(!Objects.isNull(mailDto)) 
                    return mapper.map(mailDto, MailModel.class);
                else
                   return null;
         }

}