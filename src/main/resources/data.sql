INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-01.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-02.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-03.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-04.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-05.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-06.jpg")
INSERT INTO imageuser (id_imageuser, image) VALUES (default, "image-07.jpg")

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

INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-01.jpg')
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-02.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-03.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-04.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-05.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-06.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-07.jpg') 
INSERT INTO imageevent (id_imageevent, image) VALUES (default, 'image-08.jpg') 

INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Patata", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-05", 1)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Tomates", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-05", 2)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Cebollas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-05", 3)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Berenjenas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-05", 4)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Alcachofas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-08", 5)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Nabos", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-07", 6)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Lechuga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-06", 7)
INSERT INTO events (id_event, name, description, dateevent, imageevent_id_imageevent) VALUES (default, "Morcilla", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-05", 8)

INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Patata", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-05")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Tomates", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-06")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Cebollas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-07")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Berenjenas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-04-08")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Alcachofas", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-09")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Nabos", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-10")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Lechuga", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-11")
INSERT INTO travels (id_travel, name, description, datetravel) VALUES (default, "Morcilla", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.", "2023-05-12")




INSERT INTO imageaboutus (id_imageaboutus, image) VALUES (default, "image-01.jpg")
INSERT INTO imageaboutus (id_imageaboutus, image) VALUES (default, "image-02.jpg")

INSERT INTO aboutus (id_aboutus, name, description, image_about_us_id_imageaboutus) VALUES (default, "Patata", "La más deseada.", 1)
INSERT INTO aboutus (id_aboutus, name, description, image_about_us_id_imageaboutus) VALUES (default, "Tomate", "Rojo pasión.", 2)
