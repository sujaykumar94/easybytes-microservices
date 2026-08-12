CREATE TABLE IF NOT EXISTS customer (
                                        customer_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                                        name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mobile_number VARCHAR(20) NOT NULL,
    created_at timestamp NOT NULL,
    created_by VARCHAR(20) NOT NULL,
    updated_at timestamp DEFAULT NULL,
    updated_by VARCHAR(20) DEFAULT NULL
    );


CREATE TABLE IF NOT EXISTS accounts (
                                        customer_id BIGINT NOT NULL,
                                        account_number BIGINT PRIMARY KEY,
                                        account_type VARCHAR(100) NOT NULL,
    branch_address VARCHAR(200) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    created_by VARCHAR(20) NOT NULL,
    updated_at TIMESTAMP DEFAULT NULL,
    updated_by VARCHAR(20) DEFAULT NULL
    );