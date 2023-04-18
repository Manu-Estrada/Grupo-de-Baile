INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-01.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-02.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-03.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-04.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-05.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-06.jpg")

INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, '1', 'Primérez', '2023-01-31', 'admin@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', 1)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, '2', 'Segúndez', '2023-02-01', 'user@esto.es' ,'$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', 2)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, '3', 'Tercérez', '2023-03-01', 'nada@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', 3)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, '4', 'Tercérez', '2023-03-01', 'nada@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', 4)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, '5', 'Tercérez', '2023-03-01', 'nada@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', 5)
INSERT INTO users (id_user, name, lastname, dateadmission, username, password, imageuser_id_imageuser) VALUES (default, '6', 'Tercérez', '2023-03-01', 'nada@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO', 6)

INSERT INTO roles (id_role, role) VALUES (default, 'ROLE_ADMIN')
INSERT INTO roles (id_role, role) VALUES (default, 'ROLE_USER')

INSERT INTO roles_users (user_id, role_id) VALUES (1, 1)
INSERT INTO roles_users (user_id, role_id) VALUES (2, 2)

INSERT INTO imageevent (id_imageevent, image) VALUES (default,  'image-01.jpg')
INSERT INTO imageevent (id_imageevent, image) VALUES (default,  'image-02.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default,  'image-03.jpg') 


INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Patata", "Miles y unas de receptas de patatas", "2023-04-05", 1)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "tomates", "Miles y unas de receptas de patatas", "2023-04-05", 2)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "cebollas", "Miles y unas de receptas de patatas", "2023-04-05", 3)
