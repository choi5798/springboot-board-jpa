package com.kdt.board.domain.user.service;

import com.kdt.board.domain.user.entity.User;
import com.kdt.board.domain.user.repository.UserRepository;
import com.kdt.board.global.exception.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new BaseException("유저가 없습니다")
        );
    }

}