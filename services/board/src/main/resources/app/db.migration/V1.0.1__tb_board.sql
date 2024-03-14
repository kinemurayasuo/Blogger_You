CREATE TABLE IF NOT EXISTS 'board'.'board' (
    id              SERIAL          PRIMARY KEY
    user_id         BIGINT          NOT NULL
    title           VARCHAR(50)     NOT NULL
    content         TEXT            NOT NULL
    board_write_at  TIMESTAMP       DEFAULT CURRENT_TIMESTAMP
);