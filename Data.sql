USE ProductManager;

INSERT INTO ProductType (ProductTypeName) VALUES
						('Houseware'),
                        ('Green Electric Machine');

INSERT INTO Product	(ProductName, 		Producer, 					ProductTypeId) VALUES
					('Chair',			'Houseware',				'1'),
                    ('Table',			'Houseware',				'1'),
                    ('Air conditional',	'Green Electric Machine',	'2'),
                    ('Washing machine',	'Green Electric Machine',	'2');
                    
