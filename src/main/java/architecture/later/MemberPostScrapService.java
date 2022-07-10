package architecture.later;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class MemberPostScrapService implements MemberPostScrapUseCase {
    @Override
    public Long memberPostScrap(Long memberId, Long postId) {
        return null;
    }
}
