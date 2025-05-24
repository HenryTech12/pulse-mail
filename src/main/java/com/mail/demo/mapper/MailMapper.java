package com.mail.demo.mapper;

import com.mail.demo.dto.*;
import com.mail.demo.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MailMapper {


       @Autowired
        private ModelMapper mapper;

         public MailDTO convertToDTO(MailModel mailModel) {
                if(!Objects.isNull(mailModel)) 
                     return mapper.map(mailModel, MailDTO.class);
                else
                     return null;
        }
  
        public MailModel convertToModel(MailDTO mailDto) {
                if(!Objects.isNull(mailDto)) 
                    return mapper.map(mailDto, MailModel.class);
                else
                   return null;
         }

}