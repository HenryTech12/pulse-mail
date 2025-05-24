package com.mail.demo.service;


import com.mail.demo.dto.MailDTO;
import com.mail.demo.dto.MailType;
import com.mail.demo.mapper.MailMapper;
import com.mail.demo.model.MailModel;
import com.mail.demo.repo.MailRepository;
import com.mail.demo.response.ComposeResponse;
import com.mail.demo.response.SentboxResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
public class MailService {

    @Autowired
    private MailMapper mailMapper;
    @Autowired
    private MailRepository mailRepository;
    @Autowired
    private EmailSenderService emailSenderService;

    private Logger logger = LoggerFactory.getLogger(MailService.class);

    public void saveMail(ComposeResponse composeResponse, MultipartFile multipartFile) {
      if(!Objects.isNull(composeResponse)) {
          MailModel mailModel = new MailModel();
          emailSenderService.sendMail(mailModel, composeResponse,multipartFile);
          mailModel.setFromEmail(composeResponse.getFromEmail());
          mailModel.setToEmail(composeResponse.getToEmail());
          mailModel.setSubject(composeResponse.getSubject());
          mailModel.setBody(composeResponse.getBody());

          mailModel.setType(MailType.Sentbox.name());
          mailRepository.save(mailModel);
          logger.info("mail successfully added to db.");
      }
    }

    public List<SentboxResponse> findByType(String type) {
        Optional<List<MailModel>> optionalMailModelList =
                mailRepository.findByType(type);
        List<SentboxResponse> sentboxResponseList = new ArrayList<>();
        if(optionalMailModelList.isPresent()) {
            List<MailModel> mailModelList = optionalMailModelList.orElse(new ArrayList<>());
            for(MailModel model : mailModelList) {
                SentboxResponse sentboxResponse = new SentboxResponse();
                sentboxResponse.setBody(model.getBody());
                sentboxResponse.setSubject(model.getSubject());
                sentboxResponse.setSentWhen(model.getSentWhen().toString());
                System.out.println(sentboxResponse);
                sentboxResponseList.add(sentboxResponse);
            }
        }
        return sentboxResponseList;
    }

    public MailDTO findByID(Long id) {
        Optional<MailModel> optionalMailModel =
                mailRepository.findById(id);
        MailDTO mailDTO = null;
        if(optionalMailModel.isPresent()) {
            MailModel mailModel = optionalMailModel.orElse(new MailModel());
            mailDTO = mailMapper.convertToDTO(mailModel);
        }
        return mailDTO;
    }

    public void updateMail(MailDTO previous, MailDTO next) {

    }

    public void deleteMail(MailDTO mailDto) {


    }
}