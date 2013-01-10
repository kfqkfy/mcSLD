create table b_service_util(
id serial primary key,
name varchar(50),
description varchar(50),
monitor_status char(2),
version varchar(20),
ip varchar(20),
port varchar(10),
created_by varchar(50),
created_on varchar(50),
last_changed_by varchar(50),
last_changed_on varchar(50)
)


create table b_app_cluster(
id serial primary key,
name varchar(50),
description varchar(50),
monitor_status char(2),
ip varchar(20),
version varchar(20),
port varchar(10),
su_id integer not null,
created_by varchar(50),
created_on varchar(50),
last_changed_by varchar(50),
last_changed_on varchar(50),
FOREIGN KEY (su_id) REFERENCES b_service_util(id)
)

drop table b_app_cluster


create table b_app_instance(
id serial primary key,
name varchar(50),
description varchar(50),
monitor_status char(2),
ip varchar(20),
version varchar(20),
port varchar(10),
sc_id integer not null,
created_by varchar(50),
created_on varchar(50),
last_changed_by varchar(50),
last_changed_on varchar(50),
FOREIGN KEY (sc_id) REFERENCES b_app_cluster(id)
)

drop table b_app_instance

create table b_db_cluster(
id serial primary key,
name varchar(50),
description varchar(50),
monitor_status char(2),
ip varchar(20),
port varchar(10),
db_type varchar(10),
db_version varchar(10),
connection_user_name varchar(20),
connection_user_password varchar(20),
su_id integer not null,
created_by varchar(50),
created_on varchar(50),
last_changed_by varchar(50),
last_changed_on varchar(50),
FOREIGN KEY (su_id) REFERENCES b_service_util(id)
)

drop table b_db_cluster

create table b_db_instance (
id serial primary key,
name varchar(50),
description varchar(50),
monitor_status char(2),
ip varchar(20),
db_type varchar(10),
db_version varchar(10),
connection_user_name varchar(20),
connection_user_password varchar(20),
dbc_id integer not null,
created_by varchar(50),
created_on varchar(50),
last_changed_by varchar(50),
last_changed_on varchar(50),
FOREIGN KEY (dbc_id) REFERENCES b_db_cluster(id)
)

drop table b_db_instance

create table b_customer(
id serial primary key,
name varchar(50)
)

create table b_tenant(
id serial primary key,
name varchar(50),
description varchar(50),
monitor_status char(2),
version varchar(10),
lc_status char(2),
usage varchar(10),
connection_user_password varchar(20),
dbi_id integer not null,
cid integer not null,
created_by varchar(50),
created_on varchar(50),
last_changed_by varchar(50),
last_changed_on varchar(50),
FOREIGN KEY (dbi_id) REFERENCES b_db_instance(id),
FOREIGN KEY (cid) REFERENCES b_customer(id)
)