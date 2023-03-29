INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, 'Primero', 'Primérez', '2023-01-31', 'admin@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', null)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, 'Segundo', 'Segúndez', '2023-02-01', 'user@esto.es' ,'$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', null)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, 'Tercero', 'Tercérez', '2023-03-01', 'nada@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', null)

INSERT INTO roles (id_role, role) VALUES (default, 'ROLE_ADMIN')
INSERT INTO roles (id_role, role) VALUES (default, 'ROLE_USER')

INSERT INTO roles_users (user_id, role_id) VALUES (1, 1)
INSERT INTO roles_users (user_id, role_id) VALUES (2, 2)