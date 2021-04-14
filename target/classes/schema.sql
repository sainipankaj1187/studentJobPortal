CREATE TABLE student (
  id varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  age int NOT NULL,
  experience int NOT NULL,
  contactNum varchar(255) NOT NULL,
  college varchar(255) NOT NULL,
  city varchar(255) NOT NULL,
  createdDate timestamp NOT NULL,
  updatedDate timestamp NOT NULL, 
  PRIMARY KEY (id)
);

create table jobListing

(
  id varchar(255) NOT NULL,
  company varchar(255) NOT NULL,
  location  varchar(255) NOT NULL,
  reqExperience int NOT NULL,
  description varchar(255) NOT NULL,
  type varchar(255) NOT NULL,
  contactHR varchar(255) NOT NULL,
  createdDate timestamp NOT NULL,
  updatedDate timestamp NOT NULL,
  isActive boolean DEFAULT true, 
  PRIMARY KEY (id)
);
