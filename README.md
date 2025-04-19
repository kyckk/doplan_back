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
git clone https://github.com/kyckk/doplan_back.git

# 2. 애플리케이션 실행
또는 IDE(IntelliJ 등)에서 DoplanBackApplication.java 직접 실행

3. 주요 폴더 구조

todo-backend/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/task/doplanBack/web/todo/
│       │       ├── controller/
│       │       │   └── Controller.java      # REST API 컨트롤러
│       │       ├── model/
│       │       │   ├── Todo.java            # Entity 클래스
│       │       │  
│       │       ├── repository/             
│       │       │   └── TodoRepository.java   # JPA Repository
│       │       └── DoplanBackApplication.java   
│       └── resources/
│           ├── application.yml               #  db설정파일
│           └── db/
│               └── create.sql                 #  테이블 생성

4. API 명세

메서드	URL	설명
GET	    /todoList	전체 할 일 목록 조회
POST	/saveTodo	새 할 일 추가 및 수정



5. 추가 기능
✅ save를 통해 upadate와 insert한번에 구현

✅ 수동으로 식별자 최댓값부여

✅ CORS 설정으로 프론트와 연동 허용
