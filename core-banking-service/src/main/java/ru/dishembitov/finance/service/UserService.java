package ru.dishembitov.finance.service;

import ru.dishembitov.finance.exception.EntityNotFoundException;
import ru.dishembitov.finance.model.dto.User;
import ru.dishembitov.finance.model.entity.UserEntity;
import ru.dishembitov.finance.model.mapper.UserMapper;
import ru.dishembitov.finance.repository.UserRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserMapper userMapper = new UserMapper();

    private final UserRepository userRepository;

    public User readUser(String identification) {
        UserEntity userEntity = userRepository.findByIdentificationNumber(identification).orElseThrow(EntityNotFoundException::new);
        return userMapper.convertToDto(userEntity);
    }

    public List<User> readUsers(Pageable pageable) {
        return userMapper.convertToDtoList(userRepository.findAll(pageable).getContent());
    }
}
