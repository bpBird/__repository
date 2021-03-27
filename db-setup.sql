--以下内容にしたがってER図を作成

--tables for products
CREATE TABLE product_categories (
	category_id			INT				AUTO_INCREMENT		NOT NULL		PRIMARY KEY,
	category_name		VARCHAR(255)						NOT NULL,
	created_at			DATETIME,
	created_by			INT,
	updated_at			DATETIME,
	updated_by			INT
);

CREATE TABLE product_items (
	product_id			INT				AUTO_INCREMENT		NOT NULL		PRIMARY KEY,
	product_name		VARCHAR(255),
	category_id			INT,
	manufacturer_id		INT,
	created_at			DATETIME,
	created_by			INT,
	updated_at			DATETIME,
	updated_by			INT
);

--tables for orders

CREATE TABLE orders (
	order_id			INT				AUTO_INCREMENT		NOT NULL		PRIMARY KEY,
	customer_id			INT									NOT NULL,
	total_price			DECIMAL(15,2),
	order_date			TIMESTAMP,
	order_status		INT,
	created_at			DATETIME,
	created_by			INT,
	updated_at			DATETIME,
	updated_by			INT
);

CREATE TABLE order_items (
	order_item_id		INT				AUTO_INCREMENT		NOT NULL		PRIMARY KEY,
	order_id			INT									NOT NULL,
	product_id			INT									NOT NULL,
	quantity			INT									NOT NULL,
	total_price			DECIMAL(15,2),
	created_at			DATETIME,
	created_by			INT,
	updated_at			DATETIME,
	updated_by			INT
);

CREATE TABLE order_items (
	id		int		auto_increment		not null		primary key,
カラム名 型 その他
);