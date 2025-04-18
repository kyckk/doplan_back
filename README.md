## 1. 프로젝트 소개

이 리포지토리는 **ToDo 애플리케이션의 백엔드 서버**입니다.  
Java 21과 Spring Boot를 기반으로 REST API를 제공합니다.

프론트엔드 (React)와 연동되어 할 일 데이터를 CRUD할 수 있습니다.

---

## 2. 실행 방법

### 필수 조건

- Java 21
- Maven

### 실행

```bash
# 1. 프로젝트 클론
git clone https://github.com/your-username/todo-backend.git
cd todo-backend

# 2. 애플리케이션 실행
./mvnw spring-boot:run
또는 IDE(IntelliJ 등)에서 TodoApplication.java 직접 실행

3. 주요 폴더 구조
bash
복사
편집
📦 todo-backend
└── src/main/java/com/example/todo
    ├── controller       # REST API 컨트롤러
    ├── model            # Entity 및 DTO 클래스
    ├── repository       # JPA Repository
    ├── service          # 비즈니스 로직
    └── TodoApplication  # 메인 클래스
4. API 명세

메서드	URL	설명
GET	/api/todos	전체 할 일 목록 조회
POST	/api/todos	새 할 일 추가
PUT	/api/todos/{id}	할 일 수정
DELETE	/api/todos/{id}	할 일 삭제
5. Swagger 사용
txt
복사
편집
http://localhost:8080/swagger-ui/index.html
Swagger를 통해 API 테스트 및 문서 확인 가능

6. 추가 기능
✅ 마감일 정렬된 리스트 반환

✅ 태그 포함 데이터 저장

✅ CORS 설정으로 프론트와 연동 허용
