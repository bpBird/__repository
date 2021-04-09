CREATE TABLE orders (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	FOREIGN KEY (organization_id) REFERENCES organizations (id),
	FOREIGN KEY (customer_id) REFERENCES customers (id),
	total_price			DECIMAL(15,2)	NOT NULL,
	order_date			DATETIME		NOT NULL,
	order_status		INT,
	created_at			DATETIME		NOT NULL,
	created_by			INT				NOT NULL,
	updated_at			DATETIME		NOT NULL,
	updated_by			INT				NOT NULL
);

CREATE TABLE order_items (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	FOREIGN KEY (order_id) REFERENCES orders (id),
	FOREIGN KEY (product_item_id) REFERENCES product_items (id),
	quantity			INT				NOT NULL,
	total_price			DECIMAL(15,2)	NOT NULL,
	created_at			DATETIME		NOT NULL,
	FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			DATETIME		NOT NULL,
	FOREIGN KEY (updated_by) REFERENCES users (id)
);

CREATE TABLE customers (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	FOREIGN KEY (organization_id) REFERENCES organizations (id),
	firstname			VARCHAR(255)	NOT NULL,
	lastname			VARCHAR(255)	NOT NULL,
	phone_number		VARCHAR(15),
	email				VARCHAR(100)	NOT NULL,
	country				VARCHAR(255),
	state				VARCHAR(255),
	prefecture			VARCHAR(255),
	city				VARCHAR(255),
	street_address		VARCHAR(255),
	apartment_address	VARCHAR(255),
	postal_code			VARCHAR(45),
	created_at			DATETIME		NOT NULL,
	FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			DATETIME		NOT NULL,
	FOREIGN KEY (updated_by) REFERENCES users (id)
);

CREATE TABLE manufacturers (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	FOREIGN KEY (organization_id) REFERENCES organizations (id),
	name				VARCHAR(255)	NOT NULL,
	phone_number		VARCHAR(15),
	country				VARCHAR(255),
	state				VARCHAR(255),
	prefecture			VARCHAR(255),
	city				VARCHAR(255),
	street_address		VARCHAR(255),
	apartment_address	VARCHAR(255),
	postal_code			VARCHAR(45),
	created_at			DATETIME		NOT NULL,
	FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			DATETIME		NOT NULL,
	FOREIGN KEY (updated_by) REFERENCES users (id)
);

CREATE TABLE manufacturer_staff (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	firstname			VARCHAR(255),
	lastname			VARCHAR(255)	NOT NULL,
	phone_number		VARCHAR(15),
	email				VARCHAR(100)	NOT NULL,
	FOREIGN KEY (manufacturer_id) REFERENCES manufacturers (id),
	created_at			DATETIME		NOT NULL,
	FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			DATETIME		NOT NULL,
	FOREIGN KEY (updated_by) REFERENCES users (id)
);

CREATE TABLE users (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	FOREIGN KEY (organization_id) REFERENCES organizations (id),
	firstname			VARCHAR(255),
	lastname			VARCHAR(255),
	email				VARCHAR(100)	NOT NULL,
	password			VARCHAR(100)	NOT NULL,
	rolename			VARCHAR(100)	NOT NULL,
	created_at			DATETIME		NOT NULL,
	FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			DATETIME		NOT NULL,
	FOREIGN KEY (updated_by) REFERENCES users (id)
);

CREATE TABLE organizations (
	id					INT				AUTO_INCREMENT		PRIMARY KEY,
	name				VARCHAR(255)	NOT NULL,
	activate_status		VARCHAR(1)		NOT NULL,
	created_at			DATETIME		NOT NULL,
	FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			DATETIME		NOT NULL,
	FOREIGN KEY (updated_by) REFERENCES users (id)
);