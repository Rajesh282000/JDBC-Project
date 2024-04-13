# JDBC Image Handling

This Java application demonstrates how to retrieve an image stored in a MySQL database and save it to a local directory using JDBC.

Overview
This program connects to a MySQL database using JDBC and executes a SQL query to retrieve an image stored as binary data in the database. It then saves the image data to a local directory on the file system.

Prerequisites
JDK (Java Development Kit)
MySQL Database Server
MySQL Connector/J (JDBC driver)

Setup
MySQL Database Setup:
1)Install and configure MySQL Database Server.
Create a database named jdbcp1 or modify the database URL in the code to match your database configuration.
Create a table named image_table with columns image_id (INT) and image_data (BLOB).
2)JDBC Driver:
Download and add the MySQL Connector/J(JDBC driver) JAR file to your project dependencies.
3)Code Modifications:
Modify the url, username, and password variables in the Main class to match your database connection details.
Modify the folderPath variable to specify the directory where you want to save the retrieved image.

Usage
Compile the Main.java file using the Java compiler:
javac Main.java

Run the compiled Java program:
java Main

Notes:
Ensure that the MySQL database server is running and accessible from the application.
Verify that the SQL query in the code (query variable) retrieves the correct image data from the database table.
