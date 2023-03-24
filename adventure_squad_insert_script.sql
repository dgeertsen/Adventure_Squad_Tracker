INSERT INTO location (city, state_province, country) VALUES
('Banff', 'Alberta', 'Canada'),
('Glacier', 'Montana', 'USA'),
('Lake Como', 'Montana', 'USA');

INSERT INTO adventure (location_id, start_date, end_date) VALUES
(1, '2019-08-15', '2019-08-22'),
(2, '2023-05-19', '2023-05-23'),
(3, '2022-07-10', '2023-07-14');

INSERT INTO user (first_name, last_name, age) VALUES
('Devon', 'Geertsen', 32),
('Mikaela', 'Hayes', 28),
('Tierra', 'Starr', 29),
('Kim', 'Lovitt', 27),
('Michaela', 'Shifley', 40);

INSERT INTO user_adventure (user_id, adventure_id) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(2, 3),
(3, 1),
(3, 3),
(4, 3),
(5, 1),
(5, 2);
