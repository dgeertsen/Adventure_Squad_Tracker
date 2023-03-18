INSERT INTO location (city, state_province, country) VALUES
('New York', 'New York', 'USA'),
('London', 'Greater London', 'UK'),
('Sydney', 'New South Wales', 'Australia');

INSERT INTO adventure (location_id, start_date, end_date) VALUES
(1, '2023-05-15', '2023-05-22'),
(2, '2023-06-01', '2023-06-08'),
(3, '2023-07-10', '2023-07-17');

INSERT INTO user (first_name, last_name, age) VALUES
('John', 'Doe', 30),
('Jane', 'Smith', 25),
('Bob', 'Johnson', 40);

INSERT INTO user_adventure (user_id, adventure_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(1, 2),
(2, 3);