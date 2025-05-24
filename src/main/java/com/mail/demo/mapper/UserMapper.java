package com.mail.demo.mapper;


<<<<<<< HEAD
import com.mail.demo.dto.UserDTO;
import com.mail.demo.model.UserModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

=======
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087
@Service
public class UserMapper {


        @Autowired
         private ModelMapper mapper;

<<<<<<< HEAD
        public UserDTO convertToDTO(UserModel userModel) {
            if(!Objects.isNull(userModel))
                return mapper.map(userModel,UserDTO.class);
            else
                return null;
        }

        public UserModel convertToModel(UserDTO userDTO) {
            if(!Objects.isNull(userDTO))
                return mapper.map(userDTO,UserModel.class);
            else
                return null;
        }

=======
>>>>>>> 30836453590bb58632fb7071e90ae2c0c6a32087

}