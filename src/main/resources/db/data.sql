-- Sample User data
INSERT INTO organizations (id, name, activate_status) VALUES (1, 'master', '1');

-- Sample User data
INSERT INTO users (organization_id, email, username, bcrypt_password, locale, is_account_non_locked, authority) VALUES (1, 'sample@bpbird.com', 'bpbird', '', 'US', 0, 'ADMIN');