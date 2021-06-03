-- Organization table
CREATE TABLE organizations (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	name				VARCHAR(255)	NOT NULL,
	activate_status		INT				NOT NULL			CHECK (activate_status <= 1),
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT								DEFAULT NULL,
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT								DEFAULT NULL
);

-- User table
CREATE TABLE users (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_user_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	firstname			VARCHAR(255),
	lastname			VARCHAR(255),
	phone_number		VARCHAR(15),
	email				VARCHAR(100)	NOT NULL,
	password			VARCHAR(255)	NOT NULL,
	-- bcrypt_password		VARCHAR(255)	NOT NULL,
	rolename			VARCHAR(100)	NOT NULL,
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_user_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_user_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Customer table
CREATE TABLE customers (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_customer_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
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
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_customer_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_customer_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Manufacturer table
CREATE TABLE manufacturers (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_manufacturer_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	name				VARCHAR(255)	NOT NULL,
	phone_number		VARCHAR(15),
	email				VARCHAR(100)	NOT NULL,
	country				VARCHAR(255),
	state				VARCHAR(255),
	prefecture			VARCHAR(255),
	city				VARCHAR(255),
	street_address		VARCHAR(255),
	apartment_address	VARCHAR(255),
	postal_code			VARCHAR(45),
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_manufacturer_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_manufacturer_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Manufacturer Staff table
CREATE TABLE manufacturer_staff (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_manufacturer_staff_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	firstname			VARCHAR(255),
	lastname			VARCHAR(255)	NOT NULL,
	phone_number		VARCHAR(15),
	email				VARCHAR(100)	NOT NULL,
	manufacturer_id		BIGINT,
		CONSTRAINT fk_manufacturer_staff_manufacturer_id FOREIGN KEY (manufacturer_id) REFERENCES manufacturers (id),
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_manufacturer_staff_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_manufacturer_staff_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Product Category table
CREATE TABLE product_categories (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_product_category_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	name				VARCHAR(255)	NOT NULL,
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_product_category_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_product_category_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Product Item table
CREATE TABLE product_items (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_product_item_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	name				VARCHAR(255)	NOT NULL,
	product_category_id	BIGINT,
		CONSTRAINT fk_product_item_product_category_id FOREIGN KEY (product_category_id) REFERENCES product_categories (id),
	manufacturer_id		BIGINT,
		CONSTRAINT fk_product_item_manufacturer_id FOREIGN KEY (manufacturer_id) REFERENCES manufacturers (id),
	buying_price		DECIMAL(15,2),
	selling_price		DECIMAL(15,2)	NOT NULL,
	inhouse_stock		int				NOT NULL,
	arriving_stock		int,
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_product_item_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_product_item_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Order table
CREATE TABLE orders (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_order_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	customer_id			BIGINT,
		CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers (id),
	total_price			DECIMAL(15,2)	NOT NULL,
	order_date			DATETIME		NOT NULL,
	order_status		INT									CHECK (order_status <= 4),
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_order_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_order_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);

-- Order Item table
CREATE TABLE order_items (
	id					BIGINT			AUTO_INCREMENT		PRIMARY KEY,
	organization_id		BIGINT			NOT NULL,
		CONSTRAINT fk_order_item_organization_id FOREIGN KEY (organization_id) REFERENCES organizations (id),
	order_id			BIGINT,
		CONSTRAINT fk_order_item_order_id FOREIGN KEY (order_id) REFERENCES orders (id),
	product_item_id		BIGINT,
		CONSTRAINT fk_product_item_id FOREIGN KEY (product_item_id) REFERENCES product_items (id),
	quantity			INT				NOT NULL,
	total_price			DECIMAL(15,2)	NOT NULL,
	created_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP,
	created_by			BIGINT,
		CONSTRAINT fk_order_item_created_by_id FOREIGN KEY (created_by) REFERENCES users (id),
	updated_at			TIMESTAMP		NOT NULL			DEFAULT CURRENT_TIMESTAMP		ON UPDATE CURRENT_TIMESTAMP,
	updated_by			BIGINT,
		CONSTRAINT fk_order_item_updated_by_id FOREIGN KEY (updated_by) REFERENCES users (id)
);