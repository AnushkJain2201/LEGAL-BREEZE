create database lbdb;

use lbdb;

################# qualifications-start ##############
create table qualifications
(
    qualification_id int auto_increment primary key,
    degree char(10) not null
);
################# qualifications-end ##############



################# user_types-start ##############
create table user_types
(
    user_type_id int auto_increment primary key,
    name char(10) not null
);

insert into user_types (name) values ('Seeker'),('Provider');
################# user_types-end ##############


################# categories-start ##############
create table categories
(
    category_id int auto_increment primary key,
    name char(25) not null
);
#################  categories-end ##############


#################  status-start ##############
create table status
(
    status_id int auto_increment primary key,
    name char(15) not null
);
insert into status (name) values ('Active'),('Inactive'),('Open'),('Closed'),('Blocked');
#################  status-end ##############


#################  countries-start ##############
create table countries
(
    country_id int auto_increment primary key,
    name char(50) not null,
    isd_code char(10) not null
);
#################  countries-end ##############


#################  states-start ##############
create table states
(
    state_id int auto_increment primary key,
    name char(50) not null,
    country_id int not null,
    constraint fk_states_countries foreign key (country_id) references countries (country_id)
);
#################  states-end ##############


#################  genders-start ##############
create table genders
(
    gender_id int auto_increment primary key,
    name char(10) not null
);
#################  genders-end ##############


#################  badges-start ##############
create table badges
(
    badge_id int auto_increment primary key,
    name char(15) not null
);
insert into badges (name) values ('Bronze'),('Silver'),('Gold'),('Platinum');
#################  badges-end ##############


#################  users-start ##############
create table users
(
    user_id int auto_increment primary key,
    name char(35) not null,
    email char(255) not null unique,
    password char(255) not null ,
    phone char(10) not null unique,
    address varchar(500) null,
    pin char(6) null,
    state_id int not null,
    gender_id int null,
    user_type_id int not null,
    category_id int null,
    experience int null,
    profile_pic char(255) null,
    badge_id int null default 1,
    joined_on datetime not null,
    cases_fought int null default 0,
    cases_won int null default 0,
    success_ratio int null,
    status_id int not null default 2,
    uid char(12) null,
    constraint success_ratio_check check (success_ratio>=0 AND  success_ratio<=100) ,
    constraint fk_users_states foreign key (state_id) references states (state_id),
    constraint fk_users_genders foreign key (gender_id) references genders (gender_id),
    constraint fk_users_users_types foreign key (user_type_id) references user_types (user_type_id),
    constraint fk_users_categories foreign key (category_id) references categories (category_id),
    constraint fk_users_badges foreign key (badge_id) references badges (badge_id),
    constraint fk_users_status foreign key (status_id) references status (status_id)
);
#################  users-end ##############


#################  user_qualifications-start ##############
create table user_qualifications
(
    user_qualification_id int auto_increment primary key,
    user_id int not null,
    qualification_id int not null,
    constraint fk_user_qualifications_users foreign key (user_id) references users (user_id),
    constraint fk_user_qualifications_qualifications foreign key (qualification_id) references qualifications (qualification_id)
);
#################  users_qualifications-end ##############


#################  bids-start ##############
create table bids
(
    bid_id int auto_increment primary key,
    issue char(200) not null,
    description varchar(1000) not null,
    hearings int not null default 0,
    status_id int not null default 3,
    budget int not null,
    start_date date not null,
    deadline date null,
    no_of_applicants int not null default 0,
    user_id int not null,
    constraint fk_bids_status foreign key (status_id) references status (status_id),
    constraint fk_bids_users foreign key (user_id) references users (user_id)
);
#################  bids-end ##############


################# bid_applicants-start ##############
create table bid_applicants
(
    bid_applicant_id int auto_increment primary key,
    bid_id int not null,
    applicant_id int not null,
    constraint fk_bid_applicants_bids foreign key (bid_id) references bids (bid_id),
    constraint fk_bid_applicants_users foreign key (applicant_id) references users (user_id)
);
#################  bid_applicants-end ##############


#################  cases-start ##############
create table cases
(
    case_id int auto_increment primary key,
    issue char(200) not null,
    description varchar(1000) not null,
    client_id int not null,
    lawyer_id int null,
    start_date date null,
    end_date date null,
    status_id int not null default 3,
    constraint fk_cases_clients foreign key (client_id) references users (user_id),
    constraint fk_cases_lawyers foreign key (lawyer_id) references users (user_id)
);
#################  cases-end ##############