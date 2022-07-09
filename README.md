# Clean-Architecture-Practice

- 만들면서 배우는 클린 아키텍처 책을 보고 실습한 내용

# 카페 정보 앱 
- 간단하게 카페 정보와 카페에 대한 리뷰를 쓸 수 있는 앱

## spec

### user
- 회원가입할 때 닉네임과 비밀번호 입력
- 닉네임 영어로만 5~10자
- 닉네임 중복 불가능
- 닉네임 수정 가능
- 패스워드 영어와 숫자로만 8~12자
- 패스워드 변경 가능
- 포스트 스크랩 기능 (최대 10개까지만)
- 카페 스크랩 기능 (최대 5개까지만)
- 회원 탈퇴

### post
- 글을 작성할 때 제목, 내용을 입력함
- 제목은 1~100자
- 내용은 1 ~ 500자
- 제목 및 내용 수정 가능
- 포스트 삭제 가능

### 카페
- 카페 정보를 입력할 때 이름, 주소, 매장 번호, 운영시간 입력
- 이름, 주소, 매장 번호, 운영시간 변경 가능
- 카페 삭제 가능 
