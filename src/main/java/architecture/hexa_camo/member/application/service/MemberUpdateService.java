package architecture.hexa_camo.member.application.service;

import architecture.hexa_camo.member.application.port.in.MemberUpdateUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberUpdateService implements MemberUpdateUseCase {
    @Override
    public String changeNickname(String newNickName) {
        return null;
    }

    @Override
    public String changePassword(String newPassword) {
        return null;
    }
}
