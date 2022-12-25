CREATE TABLE "users" (
	"id"	NUMERIC NOT NULL,
	"password"	TEXT NOT NULL,
	"username"	TEXT NOT NULL UNIQUE,
	"enabled"	NUMERIC NOT NULL,
	PRIMARY KEY("id")
);

CREATE TABLE "posts" (
    "id"    NUMERIC NOT NULL,
    "body"  TEXT NOT NULL,
    "creation_date" TEXT NOT NULL,
    "title" TEXT NOT NULL,
    "user_id" NUMERIC NOT NULL,
    PRIMARY KEY("id"),
    FOREIGN KEY (user_id) REFERENCES users(id)
);


CREATE TABLE "comments" (
	"id"	NUMERIC NOT NULL,
	"body"	TEXT NOT NULL,
	"creation_date"	TEXT NOT NULL,
	"post_id"	NUMERIC NOT NULL,
	"user_id"	NUMERIC NOT NULL,
	PRIMARY KEY("id"),
	FOREIGN KEY (user_id) REFERENCES users(id)
	FOREIGN KEY (post_id) REFERENCES posts(id)
);
