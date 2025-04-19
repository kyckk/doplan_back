CREATE TABLE `todo`
(
    `todo_id`    INT NOT NULL COMMENT 'TODO 항목 고유 ID (기본 키)',
    `content`    TEXT COMMENT '할 일 내용 (자유롭게 입력)',
    `created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성 일시 (자동 기록)',
    `updated_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정 일시 (자동 업데이트)',
    `completed`  TINYINT(1) NOT NULL DEFAULT '0' COMMENT '완료 여부 (0: 미완료, 1: 완료)',
    PRIMARY KEY (`todo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO todo (todo_id, content, created_at, updated_at, completed)
VALUES (1, 'todo내용1', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 0),
       (2, 'todo내용2', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 0),
       (3, 'todo내용3', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 1),
       (4, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 1),
       (5, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 1),
       (6, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 0),
       (7, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 0),
       (8, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-18 00:00:00', 0),
       (9, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-19 00:00:00', 1),
       (10, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-19 00:00:00', 1),
       (11, 'ㅁㄴㅇ', '2025-04-18 00:00:00', '2025-04-19 00:00:00', 1),
       (12, 'ㅁㄴㅇ', '2025-04-17 00:00:00', '2025-04-17 00:00:00', 1);