/* 
This SQL file contains all the inserted data in the 'travel_agency' database.
*/ 

/* 
A total of approximately 30 entries were inserted into each table of the database, 
excluding the branch, admin, driver, guide, it_manager, offers, and reservation_offer 
tables. Specifically, the branch table contains 12 entries, the admin table has 8 entries, 
the driver table has 12 entries, the guide table has 10 entries, the it_manager table 
has 2 entries, the offers table has 3 entries, and the reservation_offers table has 
60,000 entries.
*/

INSERT INTO branch VALUES
(NULL, 'Homestead Drive Mankato', 105, 'Detroit'),
(NULL, 'Brewery Ave. Zionsville', 9418, 'San Juan'),
(NULL, 'Greenrose Court Taunton', 78, 'San Francisco'),
(NULL, 'Heather Street Ann Arbor', 7423, 'Venice'),
(NULL, 'Summit Ave. Nazareth', 860, 'Freetown'),
(NULL, 'Market Street De Pere', 8408, 'Glasgow'),
(NULL, 'NE. 53rd Rd. Lemont', 37, 'Maputo'),
(NULL, 'Clay Avenue Odenton', 8, 'Berlin'),
(NULL, 'Wakehurst St. Bonita Springs', 9258, 'Venice'),
(NULL, 'Edgefield Avenue Opa Locka', 556, 'Oklahoma City'),
(NULL, 'Wardle Grove', 12, 'Athens'),
(NULL, 'Langston Close', 98, 'London');

INSERT INTO phones VALUES
(1, '6925550117'), 
(1, '6949840762'),
(2, '6953629201'),
(2, '6905928165'),
(3, '6905928166'),
(3, '6934970231'),
(3, '6949205164'),
(3, '6951588058'),
(4, '6902747480'),
(4, '6996847145'),
(5, '6964329156'), 
(6, '6921977645'),
(7, '6977978212'),
(8, '6975539089'),
(8, '6931579704'),
(8, '6907234298'),
(8, '6975642234'),
(8, '6995736695'),
(9, '6974906735'),
(9, '6949893241'), 
(9, '6927437844'),
(10, '6949240562'),
(10, '6953623221'),
(10, '6905928145'),
(10, '6905978186'),
(10, '6924930291'),
(11, '6942206167'),
(12, '6952586088'),
(12, '6900248489'),
(12, '6997837545');

INSERT INTO worker VALUES
('FT4VN92F86', 'Alita', 'Wescott', 1750.00, 1),
('PN65OGYVLX', 'Adele', 'Thomas', 2221.25, 2),
('W9ZUR2PYE2', 'Kolleen', 'Hyde', 1962.50, 2),
('0IS0NHXTBT', 'Eppie', 'Michaels', 1635.00, 3),
('1I8EY9NGCM', 'Conor', 'Meadows', 1941.60, 3),
('GRSJ56XYNT', 'Monty', 'Ellery', 2031.40, 3),
('LA6TJRLMXF', 'Scottie', 'Fry', 1962.90, 4),
('N1R10X3TUQ', 'Israel', 'Hillam', 1635.50, 4),
('2M2NKGPAYQ', 'Irene', 'Paterson', 2396.25, 4),
('LIBHQJOD4V', 'Alex', 'Morison', 1941.42, 5),
('HG65TY89RE', 'Andrea', 'Silver', 1550.00, 5),
('FD32WE12QW', 'Orlando', 'Lane', 1271.00, 5),
('RET34768UT', 'Moses', 'Kent', 1962.00, 5),
('OI2DFEQR32', 'Layton', 'Harvey', 1639.00, 5),
('TY65CV34WQ', 'Hattie', 'Christian', 1418.00, 6),
('GRS5698UIW', 'Olive', 'Harding', 2034.00, 6),
('FG43EW106Q', 'Gianluca', 'Ibarra', 3172.00, 6),
('DFG3217GTE', 'Josephine', 'Bass', 1619.00, 6),
('BGW45967QW', 'Georgina', 'Robinson', 1511.00, 6),
('L43WE12QWV', 'Monty', 'Python', 1871.00, 7),
('HJGVN92F80', 'John', 'Johnson', 1650.00, 7),
('PN900GYVLJ', 'James', 'Jameson', 1200.25, 8),
('GGGBV12BV1', 'Akis', 'Papapanagiotou', '2400.25', 8), -- IT Manager
('W879R2PYE2', 'Dhmhtrios', 'Dhmhtriou', 1962.50, 9),
('0I5782HXTB', 'Ford', 'Dordson', 1695.10, 9),
('HJ0EY9NGCM', 'Conor', 'McGregor', 1001.90, 10),
('GR15826XYN', 'General', 'Grievous', 1811.20, 10),
('L4GFJRLMXF', 'John', 'Batman', 1242.90, 11),
('NTYH0X3TUQ', 'Jimmy', 'Neutron', 1035.50, 12),
('2456KGPAYQ', 'Jimmy', 'Mcgill', 1096.25, 12),
('KKK3141WRR', 'James', 'Armstrong', '2200.00', 12), -- IT Manager
('12EDQJOD4V', 'Helen', 'Atreidena', 1041.42, 12);

INSERT INTO admin VALUES
('FT4VN92F86', 'LOGISTICS', 'MBA in Shipping & Logistics'),
('PN65OGYVLX', 'ADMINISTRATIVE', 'Bachelor of Business Administration - BBA'),
('W9ZUR2PYE2', 'ADMINISTRATIVE', 'B.S. Business Administration – Project Management'),
('0IS0NHXTBT', 'ACCOUNTING', 'Bachelor of Science in Accounting'),
('TY65CV34WQ', 'ADMINISTRATIVE', 'B.S. Business Administration – Project Management'),
('GRS5698UIW', 'ACCOUNTING', 'Bachelor of Science in Accounting'),
('HJGVN92F80', 'LOGISTICS', 'MBA in Shipping & Logistics'),
('PN900GYVLJ', 'ADMINISTRATIVE', 'Masters in Business Administration');

INSERT INTO manages VALUES
('PN65OGYVLX', 1),
('PN65OGYVLX', 5),
('PN65OGYVLX', 7),
('PN65OGYVLX', 9),
('PN65OGYVLX', 2),
('W9ZUR2PYE2', 12),
('W9ZUR2PYE2', 3),
('W9ZUR2PYE2', 4),
('W9ZUR2PYE2', 10),
('W9ZUR2PYE2', 11), 
('TY65CV34WQ', 6),
('TY65CV34WQ', 7),
('TY65CV34WQ', 8),
('TY65CV34WQ', 9),
('TY65CV34WQ', 12),
('TY65CV34WQ', 3),
('TY65CV34WQ', 4),
('TY65CV34WQ', 10),
('TY65CV34WQ', 11),
('TY65CV34WQ', 1),
('TY65CV34WQ', 2),
('PN900GYVLJ', 5),
('PN900GYVLJ', 6),
('PN900GYVLJ', 2),
('PN900GYVLJ', 3),
('PN900GYVLJ', 7),
('PN900GYVLJ', 8),
('PN900GYVLJ', 9),
('PN900GYVLJ', 10),
('PN900GYVLJ', 11);

INSERT INTO driver VALUES
('1I8EY9NGCM', 'A', 'ABROAD', 3),
('GRSJ56XYNT', 'B', 'LOCAL', 7),
('LA6TJRLMXF', 'D', 'LOCAL', 2),
('N1R10X3TUQ', 'A', 'ABROAD', 9),
('HG65TY89RE', 'C', 'ABROAD', 5),
('FD32WE12QW', 'B', 'LOCAL', 3),
('RET34768UT', 'D', 'ABROAD', 7),
('OI2DFEQR32', 'A', 'ABROAD', 9),
('W879R2PYE2', 'A', 'ABROAD', 3),
('0I5782HXTB', 'B', 'LOCAL', 7),
('HJ0EY9NGCM', 'D', 'LOCAL', 2),
('GR15826XYN', 'A', 'ABROAD', 9);

INSERT INTO guide VALUES
('2M2NKGPAYQ', 'Experienced guide with strong communication skills.'),
('LIBHQJOD4V', 'Efficient guide assistant with excellent organizational skills.'),
('FG43EW106Q', 'Experienced travel guide with a passion for history and culture.'),
('DFG3217GTE', 'Skilled travel guide with a strong knowledge of local landmarks and attractions.'),
('BGW45967QW', 'Experienced tour guide with a background in customer service.'),
('L43WE12QWV', 'Experienced guide with excellent organizational skills.'),
('L4GFJRLMXF', 'Experienced guide with strong communication and excellent organizational skills.'),
('NTYH0X3TUQ', 'Experienced tour guide with a background in education and a love of culture.'),
('2456KGPAYQ', 'Skilled travel guide with a strong knowledge of local landmarks and attractions.'),
('12EDQJOD4V', 'Experienced guide with excellent organizational skills.');

INSERT INTO languages VALUES
('2M2NKGPAYQ', 'English'),
('2M2NKGPAYQ', 'French'),
('2M2NKGPAYQ', 'German'),
('2M2NKGPAYQ', 'Russian'),
('LIBHQJOD4V', 'English'),
('LIBHQJOD4V', 'Dutch'),
('LIBHQJOD4V', 'Greek'),
('LIBHQJOD4V', 'Chinese'),
('LIBHQJOD4V', 'German'),
('LIBHQJOD4V', 'Russian'),
('FG43EW106Q', 'English'),
('DFG3217GTE', 'English'),
('BGW45967QW', 'Irish'),
('L43WE12QWV', 'French'),
('BGW45967QW', 'English'),
('BGW45967QW', 'Italian'),
('L43WE12QWV', 'English'),
('L43WE12QWV', 'Russian'),
('L43WE12QWV', 'Romanian'),
('L43WE12QWV', 'German'),
('L4GFJRLMXF', 'English'),
('NTYH0X3TUQ', 'French'),
('2456KGPAYQ', 'German'),
('12EDQJOD4V', 'German'),
('12EDQJOD4V', 'English'),
('2456KGPAYQ', 'Romanian'),
('L4GFJRLMXF', 'Korean'),
('NTYH0X3TUQ', 'German'),
('NTYH0X3TUQ', 'English'),
('12EDQJOD4V', 'Russian');

INSERT INTO trip VALUES
(NULL, '2022-01-19 06:22:54', '2022-01-20 15:53:21', 50, 60.50, 1, '2M2NKGPAYQ', '1I8EY9NGCM'),
(NULL, '2022-02-12 06:23:54', '2022-02-13 15:33:21', 30, 30.25, 2, '2M2NKGPAYQ', '1I8EY9NGCM'),
(NULL, '2022-03-11 06:24:54', '2022-03-12 15:23:21', 80, 80, 3, '2M2NKGPAYQ', '1I8EY9NGCM'),
(NULL, '2022-04-14 06:25:54', '2022-04-16 15:13:21', 90, 90.50, 4, '2M2NKGPAYQ', 'GRSJ56XYNT'),
(NULL, '2022-10-26 06:26:54', '2022-10-26 15:53:21', 10, 20, 4, '2M2NKGPAYQ', 'GRSJ56XYNT'),
(NULL, '2022-06-11 06:27:54', '2022-06-12 15:53:21', 30, 40.50, 5, 'LIBHQJOD4V', 'GRSJ56XYNT'),
(NULL, '2022-08-08 06:28:54', '2022-08-09 15:54:21', 25, 160.50, 5, 'LIBHQJOD4V', 'GRSJ56XYNT'),
(NULL, '2022-07-25 06:29:54', '2022-07-26 15:55:21', 80, 260.50, 5, 'LIBHQJOD4V', 'LA6TJRLMXF'),
(NULL, '2022-05-04 06:30:54', '2022-05-06 15:52:21', 90, 330.50, 6, 'LIBHQJOD4V', 'LA6TJRLMXF'),
(NULL, '2022-05-26 06:31:54', '2022-06-26 15:51:21', 50, 460.50, 6, 'LIBHQJOD4V', 'N1R10X3TUQ'),
(NULL, '2022-02-14 06:15:00', '2022-02-14 20:05:00', 80, 100.00, 6, 'FG43EW106Q', 'HG65TY89RE'),
(NULL, '2022-02-18 06:17:00', '2022-02-18 20:09:00', 50, 75.00, 6, 'DFG3217GTE', 'FD32WE12QW'),
(NULL, '2022-04-25 06:20:00', '2022-04-25 20:13:00', 40, 50.00, 7, 'BGW45967QW', 'RET34768UT'),
(NULL, '2022-04-27 06:24:00', '2022-04-27 20:21:00', 80, 100.00, 7, 'L43WE12QWV', 'OI2DFEQR32'),
(NULL, '2022-04-28 06:30:00', '2022-04-28 20:25:00', 30, 40.00, 7, 'FG43EW106Q', 'HG65TY89RE'),
(NULL, '2022-08-17 06:33:00', '2022-08-17 20:28:00', 40, 50.00, 8, 'DFG3217GTE', 'FD32WE12QW'),
(NULL, '2022-08-21 06:36:00', '2022-08-21 20:30:00', 70, 85.00, 8, 'BGW45967QW', 'RET34768UT'),
(NULL, '2022-10-14 06:40:00', '2022-10-14 20:34:00', 50, 75.00, 9, 'L43WE12QWV', 'OI2DFEQR32'),
(NULL, '2022-12-07 06:42:00', '2022-12-07 20:47:00', 30, 40.00, 9, 'FG43EW106Q', 'HG65TY89RE'),
(NULL, '2022-12-17 06:45:00', '2022-12-17 20:50:00', 80, 100.00, 10, 'DFG3217GTE', 'FD32WE12QW'),
(NULL, '2022-01-19 06:22:54', '2022-01-19 15:53:21', 50, 680.50, 10, 'L4GFJRLMXF', 'W879R2PYE2'),
(NULL, '2022-02-12 06:23:54', '2022-02-15 15:33:21', 90, 30.25, 10, 'L4GFJRLMXF', 'W879R2PYE2'),
(NULL, '2022-03-11 06:24:54', '2022-03-16 15:23:21', 80, 80, 10, 'NTYH0X3TUQ', 'GR15826XYN'),
(NULL, '2022-04-14 06:25:54', '2022-04-26 15:13:21', 90, 90.50, 11, '2456KGPAYQ', 'HJ0EY9NGCM'),
(NULL, '2022-05-12 06:26:54', '2022-05-14 15:53:21', 10, 70.5, 11, '2456KGPAYQ', 'HJ0EY9NGCM'),
(NULL, '2022-06-11 06:27:54', '2022-06-12 15:53:21', 20, 48.50, 11, '12EDQJOD4V', 'HJ0EY9NGCM'),
(NULL, '2022-06-22 06:28:54', '2022-06-23 15:54:21', 60, 160.50, 12, '12EDQJOD4V', '0I5782HXTB'),
(NULL, '2022-06-03 06:29:54', '2022-06-04 15:55:21', 80, 260.50, 12, '12EDQJOD4V', '0I5782HXTB'),
(NULL, '2022-05-04 06:30:54', '2022-05-05 15:52:21', 90, 30.50, 12, 'L4GFJRLMXF', '0I5782HXTB'),
(NULL, '2022-11-25 06:31:54', '2022-11-26 15:51:21', 50, 560.50, 12, 'NTYH0X3TUQ', '0I5782HXTB');

INSERT INTO event VALUES
(1, '2022-01-19 06:22:54', '2022-01-19 15:53:21', 'Safari adventure.'),
(1, '2022-02-12 06:23:54', '2022-02-12 15:33:21', 'Beach vacation.'),
(2, '2022-05-25 06:31:54', '2022-05-26 15:51:21', 'Mountain hiking trip.'),
(3, '2022-06-25 06:30:54', '2022-06-26 15:52:21', 'Cultural exchange program.'),
(3, '2022-06-25 06:31:54', '2022-06-26 15:51:21', 'Ski vacation.'),
(4, '2022-05-12 06:26:54', '2022-05-13 15:53:21', 'City break.'),
(5, '2022-03-11 06:24:54', '2022-04-11 15:23:21', 'Road trip.'),
(8, '2022-03-11 06:24:54', '2022-04-11 15:23:21', 'Cruise vacation.'),
(9, '2022-03-11 06:24:54', '2022-04-11 15:23:21', 'Eco-tourism trip.'),
(10, '2022-03-11 06:24:54', '2022-04-16 15:23:21', 'Adventure sports trip.'),
(11, '2022-02-14 06:16:00', '2022-02-14 20:05:00', 'Cruise vacation.'),
(12, '2022-02-18 06:18:00', '2022-02-18 20:09:00', 'Cultural exchange program.'),
(13, '2022-04-25 06:21:00', '2022-04-25 20:13:00', 'Safari adventure.'),
(14, '2022-04-28 06:31:00', '2022-04-27 20:21:00', 'Road trip.'),
(15, '2022-04-28 06:31:00', '2022-04-28 20:25:00', 'Ski vacation.'),
(16, '2022-08-17 06:34:00', '2022-08-17 20:28:00', 'Eco-tourism trip.'),
(17, '2022-08-21 06:37:00', '2022-08-21 20:30:00', 'Cultural exchange program.'),
(18, '2022-10-14 06:41:00', '2022-10-14 20:34:00', 'Road trip.'),
(19, '2022-12-07 06:43:00', '2022-12-07 20:47:00', 'Mountain hiking trip.'),
(20, '2022-12-17 06:46:00', '2022-12-17 20:50:00', 'Beach vacation.'),
(21, '2022-01-19 14:00:00', '2022-01-19 21:00:00', 'City break.'),
(22, '2022-02-12 14:00:00', '2022-02-12 17:00:00', 'Ski vacation.'),
(23, '2022-03-25 14:30:00', '2022-03-25 19:30:00', 'Safari adventure.'),
(24, '2022-04-04 14:30:00', '2022-04-04 20:30:00', 'Eco-tourism trip.'),
(25, '2022-05-25 20:30:00', '2022-05-26 9:30:00', 'Road trip.'),
(26, '2022-06-12 20:00:00', '2022-06-12 23:00:00', 'Mountain hiking trip.'),
(27, '2022-07-11 20:00:00', '2022-07-11 23:00:00', 'Beach vacation.'),
(28, '2022-10-11 21:00:00', '2022-10-11 22:30:00', 'Cinema.'),
(29, '2022-09-11 21:00:00', '2022-09-11 21:00:00', 'Mountain hiking trip.'),
(30, '2022-11-11 9:00:00', '2022-11-11 21:00:00', 'Beach vacation.');

INSERT INTO reservation VALUES
(1, 15, 'Augusta', 'Rush', 'ADULT'),
(3, 12, 'Jaimie', 'Devereux', 'MINOR'),
(3, 5, 'Rachael', 'Garbutt', 'MINOR'),
(5, 3, 'Oz', 'Perkins', 'ADULT'),
(7, 8, 'Kermit', 'Gibson', 'MINOR'),
(7, 5, 'Murphy', 'Rimmer', 'ADULT'),
(7, 3, 'Loraine', 'Miles', 'ADULT'),
(8, 5, 'Sasha', 'Wilson', 'MINOR'),
(9, 6, 'Carry', 'Earls', 'MINOR'),
(10, 9, 'Kimberlee', 'Anderson', 'MINOR'),
(13, 3, 'John', 'Homer', 'ADULT'),
(13, 4, 'Jane', 'Homer', 'MINOR'),
(13, 2, 'Andrew', 'Homer', 'MINOR'),
(15, 14, 'Thomas', 'Johnson', 'ADULT'),
(15, 15, 'Mike', 'Johnson', 'MINOR'),
(17, 2, 'Jimmy', 'Garfield', 'ADULT'),
(18, 5, 'Stan', 'Griffin', 'ADULT'),
(18, 6, 'Mary', 'Griffin', 'MINOR'),
(18, 7, 'William', 'Griffin', 'MINOR'),
(18, 8, 'Natasha', 'Griffin', 'MINOR'),
(21, 2, 'PeePee', 'PouPou', 'ADULT'),
(21, 1, 'Bigus', 'Dickus', 'MINOR'),
(23, 5, 'Sussus', 'Amogus', 'ADULT'),
(25, 3, 'Lord', 'Farquad', 'ADULT'),
(27, 8, 'Kermit', 'The Frog', 'MINOR'),
(27, 5, 'Mickey', 'Mouse', 'MINOR'),
(27, 3, 'NaLola', 'EnaMilo', 'ADULT'),
(28, 5, 'Karl', 'Marx', 'MINOR'),
(28, 6, 'Gork', 'Mork', 'MINOR'),
(29, 4, 'JarJar', 'BingsNotDarth', 'ADULT');

INSERT INTO destination VALUES
(NULL, 'United Kingdom', 'A country that has a rich history and cultural heritage, and 
is known for its iconic landmarks and cultural attractions, such as Buckingham Palace 
and the Tower of London.', 'ABROAD', 'English', NULL),
(NULL, 'France', 'A country located in western Europe, and is known for its beautiful 
cities, rich history, and cultural attractions, such as the Eiffel Tower and the Louvre Museum.', 
'ABROAD', 'French', NULL),
(NULL, 'Germany', 'A country known for its strong economy and advanced manufacturing 
industry.', 'ABROAD', 'German', NULL),
(NULL, 'Italy', 'A country known for its delicious cuisine and vibrant arts scene.', 
'ABROAD', 'Italian', NULL),
(NULL, 'Greece', 'A country located in southeastern Europe, known for its rich history 
and cultural heritage.', 'LOCAL', 'Greek', NULL),
(NULL, 'Manchester', 'A bustling city in the north of England known for its vibrant music and arts scene, 
as well as its rich industrial history.', 'ABROAD', 'English', 1),
(NULL, 'Glasgow', 'Scotland\'s largest city, known for its cultural and sporting events, as well as its 
beautiful Victorian architecture.', 'ABROAD', 'English', 1),
(NULL, 'Bristol', 'A coastal city in the southwest of England known for its vibrant arts and music scene, 
as well as its history as a major port city.', 'ABROAD', 'English', 1),
(NULL, 'Nottingham', 'A city in the East Midlands region of England known for its rich history and cultural 
attractions, such as the famous Sherwood Forest and Nottingham Castle.', 'ABROAD', 'English', 1),
(NULL, 'Cardiff', 'The capital and largest city of Wales, known for its stunning castle and beautiful parks, 
as well as its vibrant arts and music scene.', 'ABROAD', 'English', 1),
(NULL, 'Marseille', 'France\'s second largest city, located on the Mediterranean coast, known for its 
rich history and diverse culture, as well as its beautiful beaches and harbor.', 'ABROAD', 'French', 2),
(NULL, 'Paris', 'The capital and largest city of France, known for its iconic landmarks and cultural 
attractions, such as the Eiffel Tower and the Louvre Museum.', 'ABROAD', 'French', 2),
(NULL, 'Lyon', 'A city in central France known for its rich history and cultural attractions, such as 
the Old Town and the Basilica of Notre-Dame de Fourvière.', 'ABROAD', 'French', 2),
(NULL, 'Toulouse', 'A city in the southwest of France known for its beautiful architecture and cultural 
attractions, such as the Cité de l\'Espace theme park and the Musée des Augustins.', 'ABROAD', 'French', 2),
(NULL, 'Nice', 'A city on the French Riviera known for its beautiful beaches, lively nightlife, and cultural 
attractions, such as the Musée Matisse and the Musée des Beaux-Arts.', 'ABROAD', 'French', 2),
(NULL, 'Berlin', 'The capital and largest city of Germany, known for its rich history and cultural attractions, 
such as the Brandenburg Gate and the Berlin Wall.', 'ABROAD', 'German', 3),
(NULL, 'Munich', 'A city in southern Germany known for its beautiful architecture and cultural attractions, such 
as the Nymphenburg Palace and the BMW Museum.', 'ABROAD', 'German', 3),
(NULL, 'Hamburg', 'A city in northern Germany known for its vibrant nightlife and cultural attractions, such as 
the Miniatur Wunderland model railway exhibit and the Hamburg Dungeon.', 'ABROAD', 'German', 3),
(NULL, 'Cologne', 'A city in western Germany known for its beautiful architecture, including the iconic Cologne 
Cathedral, as well as its vibrant arts scene.', 'ABROAD', 'German', 3),
(NULL, 'Frankfurt', 'A city in central Germany known for its financial and business hub, as well as its cultural 
attractions, such as the Goethe House and the Frankfurt Zoo.', 'ABROAD', 'German', 3),
(NULL, 'Rome', 'The capital and largest city of Italy, known for its rich history and cultural attractions, 
such as the Colosseum and the Trevi Fountain.', 'ABROAD', 'Italian', 4),
(NULL, 'Milan', 'A city in northern Italy known for its fashion and design industry, as well as its cultural 
attractions, such as the Duomo di Milano and the Galleria Vittorio Emanuele II.', 'ABROAD', 'Italian', 4),
(NULL, 'Naples', 'A city in southern Italy known for its rich history and cultural attractions, such as the 
Royal Palace of Caserta and the Museo Archeologico Nazionale di Napoli.', 'ABROAD', 'Italian', 4),
(NULL, 'Turin', 'A city in northwest Italy known for its beautiful architecture and cultural attractions, such 
as the Egyptian Museum and the Mole Antonelliana.', 'ABROAD', 'Italian', 4),
(NULL, 'Bologna', 'A city in central Italy known for its rich history and cultural attractions, such as the 
Basilica di San Petronio and the University of Bologna, the oldest university in the world.', 'ABROAD', 'Italian', 4),
(NULL, 'Thessaloniki', 'A city in northern Greece known for its vibrant arts and music scene, as well as its rich 
history and cultural attractions, such as the White Tower and the Archaeological Museum of Thessaloniki.', 'LOCAL', 'Greek', 5),
(NULL, 'Patras', 'A city in western Greece known for its beautiful beaches and cultural attractions, such as the 
Roman Odeon and the Patras Castle.', 'LOCAL', 'Greek', 5),
(NULL, 'Heraklion', 'A city on the island of Crete known for its rich history and cultural attractions, such as the 
Heraklion Archaeological Museum and the Knossos Palace.', 'LOCAL', 'Greek', 5),
(NULL, 'Chania', 'A city on the island of Crete known for its beautiful beaches and cultural attractions, such as the 
Chania Old Town and the Nautical Museum of Crete.', 'LOCAL', 'Greek', 5),
(NULL, 'Athens', 'The capital and largest city of Greece, known for its rich history and cultural attractions, such as 
the Acropolis and the Parthenon.', 'LOCAL', 'Greek', 5);

INSERT INTO travel_to VALUES
(9, 2, '2022-03-20 06:22:54', '2022-03-19 15:53:21'),
(9, 6, '2022-02-19 06:22:54', '2022-02-18 07:53:23'),
(5, 1, '2022-02-20 06:22:54', '2022-02-19 08:53:21'),
(5, 2, '2022-01-19 08:22:54', '2022-01-18 09:53:21'),
(5, 8, '2022-02-19 09:22:54', '2022-02-18 10:53:21'),
(2, 1, '2022-02-24 16:22:54', '2022-02-23 11:53:24'),
(3, 2, '2022-03-25 06:31:54', '2022-03-24 12:51:26'),
(4, 2, '2022-11-20 03:22:54', '2022-11-19 15:53:11'),
(7, 2, '2022-07-14 02:22:54', '2022-07-13 19:53:19'),
(8, 2, '2022-02-12 01:22:54', '2022-02-11 18:53:21'),
(15, 13, '2022-02-14 06:16:00', '2022-02-13 20:05:00'),
(17, 14, '2022-02-18 06:18:00', '2022-02-17 20:09:00'),
(12, 13, '2022-04-25 06:21:00', '2022-04-24 20:13:00'),
(14, 16, '2022-04-28 06:31:00', '2022-04-26 20:21:00'),
(14, 15, '2022-04-28 06:31:00', '2022-04-27 20:25:00'),
(13, 11, '2022-08-17 06:34:00', '2022-08-16 20:28:00'),
(18, 11, '2022-08-21 06:37:00', '2022-08-20 20:30:00'),
(19, 17, '2022-10-14 06:41:00', '2022-10-13 20:34:00'),
(16, 17, '2022-12-07 06:43:00', '2022-12-06 20:47:00'),
(15, 16, '2022-12-17 06:46:00', '2022-12-16 20:50:00'),
(29, 22, '2022-03-19 06:22:54', '2022-03-18 15:53:21'),
(29, 27, '2022-02-19 06:22:54', '2022-02-18 07:53:23'),
(25, 21, '2022-02-20 06:22:54', '2022-02-19 08:53:21'),
(25, 22, '2022-01-19 08:22:54', '2022-01-18 09:53:21'),
(25, 28, '2022-02-19 09:22:54', '2022-02-18 10:53:21'),
(22, 22, '2022-02-24 16:22:54', '2022-02-23 11:53:24'),
(23, 22, '2022-03-25 06:31:54', '2022-03-24 12:51:26'),
(24, 22, '2022-11-20 03:22:54', '2022-11-19 15:53:11'),
(27, 22, '2022-07-14 02:22:54', '2022-07-12 19:53:19'),
(28, 22, '2022-02-12 01:22:54', '2022-02-10 18:53:21');

INSERT INTO it_manager VALUES
('GGGBV12BV1', '0101', '2022-01-01', NULL, FALSE),
('KKK3141WRR', '0101', '2022-01-01', NULL, FALSE);

INSERT INTO offers VALUES
(NULL, '2023-10-14', '2023-11-14', 250, 6),
(NULL, '2023-03-25', '2023-07-25', 320.5, 13),
(NULL, '2023-03-14', '2023-11-14', 442.25, 18);

SET GLOBAL local_infile=true;

/* loads the data to the reservation_offers table from an external csv file */ 
LOAD DATA LOCAL INFILE 'C:/Users/akisp/Desktop/CEID/Databases - Project/Project Travel Agency/SQL files/reservation_offers_data.csv'
INTO TABLE reservation_offers
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n';