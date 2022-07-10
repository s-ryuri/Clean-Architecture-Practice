package architecture.later;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberDeleteService implements MemberDeleteUseCase {
    @Override
    public Long deleteMember(Long memberId) {
        return null;
    }
}
