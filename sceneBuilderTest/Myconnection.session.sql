create DATABASE mynewdatabase;
USe mynewdatabase;
create table if not exists person
(
    name VARCHAR(50),
    city VARCHAR(50),
    zipcode VARCHAR(50)
);

insert into person values ("John Doe", "New York", "10001"),
('Jane Doe',"Mumbai","400001"),('Michael Smith',"London", "11111"),
('EmilyJones',"Cape Town", "21212"),('David Lee',"Sydney", "333333");
select * from person;
