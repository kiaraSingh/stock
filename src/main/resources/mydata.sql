

INSERT INTO customer(customer_id, password) VALUES(101, "212*fN$fff");
INSERT INTO customer(customer_id, password) VALUES(102, "fAn%223k");
INSERT INTO customer(customer_id, password) VALUES(103, "m*&Pqrst");
INSERT INTO customer(customer_id, password) VALUES(104, "df22*&2A");



INSERT INTO stock(stock_id, price, stock_name) VALUES(301, 12.2, "Apple");
INSERT INTO stock(stock_id, price, stock_name) VALUES(304, 14.1, "Tesla");
INSERT INTO stock(stock_id, price, stock_name) VALUES(306, 09.2, "MicroSoft CORP.");
INSERT INTO stock(stock_id, price, stock_name) VALUES(307, 11.33, "AMC");
INSERT INTO stock(stock_id, price, stock_name) VALUES(308, 12.21, "Google");

INSERT INTO investment_accounts(investment_account_id, balance, customer_id) VALUES(201, 300, 101);
INSERT INTO investment_accounts(investment_account_id, balance, customer_id) VALUES(202, 100, 102);
INSERT INTO investment_accounts(investment_account_id, balance, customer_id) VALUES(203, 800, 102);
INSERT INTO investment_accounts(investment_account_id, balance, customer_id) VALUES(204, 400, 104);
INSERT INTO investment_accounts(investment_account_id, balance, customer_id) VALUES(205, 26, 103);

INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(401, NOW(), 12.0, 10, 201, 301);
INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(402, NOW(), 18.0, 14, 201, 304);
INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(403, NOW(), 09.0, 10, 202, 306);
INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(405, NOW(), 12.0, 10, 203, 306);
INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(406, NOW(), 11.1, 14, 203, 308);
INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(407, NOW(), 14.0, 13, 204, 307);
INSERT INTO order_stock(id, order_stock_date, price, quantity, investment_account_id, stock_id) VALUES(408, NOW(), 15.0, 21, 205, 301);

