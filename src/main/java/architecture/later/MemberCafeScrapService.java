package architecture.later;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberCafeScrapService implements MemberCafeScrapUseCase{
    @Override
    public Long cafeScrap(Long memberId, Long cafeId) {
        return null;
    }
}
