# Expense Tracker (Java 21, Maven)

## Overview

This is a simple Expense Tracker application built using Java 21 without using the Spring Framework. It follows a layered architecture including Model, Repository, Service, and Controller layers. The application allows users to:
Register and log in. Create wallets and manage balances. Add income and expenses. View all transactions.

## Technologies Used

-Java 21 (Latest features like record, enhanced switch statements, etc.)

-Maven (Project management and dependency management)

-JUnit (For unit testing)

## Version

- Current Version: 1.0.0

- Java Version: 21

- Maven Version: Latest Stable Release

## Prerequisites

- Before running this project, ensure you have the following installed:

- Java 21 or higher

- Maven

- Git (optional, for cloning the repository)


## Features

- User Management: Register and log in.

- Wallet Management: Create and view wallets.

- Transaction Management: Add and view transactions.

- Expense & Income Tracking: Separate views for income and expenses.

- Database Tables (Future Enhancement)

- Currently, this application runs in-memory, but future versions may include database support with the following tables:

- Users (id, username, password)

- Wallets (id, user_id, name, balance)

-Transactions (id, wallet_id, type, amount, timestamp)

## Getting Started

1️⃣ Clone the Repository


2️⃣ Build the Project


3️⃣Run the Application


##  Future Improvements

-Add database support (MySQL, PostgreSQL, etc.)

-Develop a GUI-based interface.

-Implement REST APIs.

## Contributing

-Fork the repository.

-Create a new branch (feature-new-feature).

-Commit your changes.

-Push the branch and create a pull request.


