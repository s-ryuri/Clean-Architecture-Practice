package architecture.later;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberLoginService implements MemberLoginUseCase {
    @Override
    public Long login(String nickName, String password) {
        return null;
    }
}
