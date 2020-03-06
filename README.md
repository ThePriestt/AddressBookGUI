1. You can install
InteliJ Database Navigator plugin
https://plugins.jetbrains.com/plugin/1800-database-navigator/versions
File - Settings - Plugins

2. NO suitable driver found. Solve the problem by:
File -> Project Structure -> Project Settings -> Modules -> Dependencies -> + sign -> Jar or directories (point to sqlite-jdbc-3.30.1.jar)

Now you can see the file in the external libraries folder!!!!

3. SQL commands
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
0. PRAGMA foreign_keys = ON;

1.
CREATE TABLE roles (id INTEGER PRIMARY KEY, name TEXT);

2.
INSERT INTO roles (id, name) VALUES (1, 'Admin'), (2, 'Member');

3.
CREATE TABLE users (id INTEGER PRIMARY KEY, role_id INTEGER REFERENCES roles(id) ON UPDATE CASCADE, username TEXT, password TEXT);

IF YOU OPEN THE DB WITH ANOTHER PROGRAM IT IS LOCKET

4. INSERT INTO users (id, role_id, username, password) VALUES (1, 1, 'admin', 'password'), (2, 2, 'member', 'password');

5. CREATE TABLE contacts (id INTEGER PRIMARY KEY, user_id INTEGER REFERENCES users(id) ON UPDATE CASCADE ON DELETE CASCADE, name TEXT, family TEXT, address TEXT);

6. 
INSERT INTO contacts (id, user_id, name, family, address) VALUES (1, 1, 'John', 'Doe', 'Stanford bul. 23, NYC, 2GD34'), (2, 2, 'Susan', 'Matasy', 'Thotnan bul. 24, London, 4563GE3, London, UK');

SELECT * FROM contacts;

7. 
CREATE TABLE phones (id INTEGER PRIMARY KEY, contact_id INTEGER REFERENCES contacts(id) ON UPDATE CASCADE ON DELETE CASCADE, phone TEXT);

.tables

INSERT INTO phones (id, contact_id, phone) VALUES (1, 1, '+44 563765 432'), (2, 1, '+99 5635687456'), (3, 2, '+56 785 652 7685'), (4, 2, '+7435878975983');

INSERT INTO phones (contact_id, phone) VALUES (1, '+632476423847');

The autoincreament also works

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

4. COnfig file
Configuration comming from a file
https://crunchify.com/how-to-add-resources-folder-properties-at-runtime-into-intellijs-classpath-adding-property-files-to-classpath/

https://www.opencodez.com/java/read-config-file-in-java.htm
