CREATE TABLE public.Users
(
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(200) NOT NULL,
	email VARCHAR(200) NOT NULL,
	creationDate TIMESTAMP NOT NULL
);

CREATE SEQUENCE public.seq_user INCREMENT 1;

CREATE TABLE public.Phone
(
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(200) NOT NULL,
	creationDate TIMESTAMP NOT NULL
);

CREATE SEQUENCE public.seq_phone INCREMENT 1;

CREATE TABLE public.Requirement
(
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(200) NOT NULL,
	description VARCHAR(200) NOT NULL,
	rating INT NOT NULL,
	phoneId INT NOT NULL
);

CREATE SEQUENCE public.seq_requirement INCREMENT 1;
ALTER TABLE public.Requirement ADD CONSTRAINT FK_Requirement_Phone FOREIGN KEY(phoneId) REFERENCES public.Phone(id);

CREATE TABLE public.FavoritePhone
(
	id INT NOT NULL PRIMARY KEY,
	userId INT NOT NULL,
	phoneId INT NOT NULL,
	creationDate TIMESTAMP NOT NULL
);

CREATE SEQUENCE public.seq_favoritePhone INCREMENT 1;
ALTER TABLE public.FavoritePhone ADD CONSTRAINT FK_FavoritePhone_User FOREIGN KEY(userId) REFERENCES public.Users(id);
ALTER TABLE public.FavoritePhone ADD CONSTRAINT FK_FavoritePhone_Phone FOREIGN KEY(phoneId) REFERENCES public.Phone(id);


