# Software Requirements Specification (SRS)
## Simple Blog Application

---

## 1. Introduction

### 1.1 Purpose
This document specifies the software requirements for the Simple Blog Application, a web-based platform that allows users to create, view, and manage blog posts. The system is designed for educational purposes as a college project demonstrating web development concepts using Spring Boot, HTML, Bootstrap, and CSS.

### 1.2 Scope
The Simple Blog Application provides:
- User authentication (registration and login)
- Blog post creation and management
- Blog post viewing and browsing
- Session-based user management
- Responsive web interface

The system uses an in-memory H2 database for data storage and is built using Spring Boot framework with Maven as the build tool.

### 1.3 Definitions, Acronyms, and Abbreviations
- **SRS**: Software Requirements Specification
- **UI**: User Interface
- **HTTP**: HyperText Transfer Protocol
- **HTML**: HyperText Markup Language
- **CSS**: Cascading Style Sheets
- **JPA**: Java Persistence API
- **H2**: In-memory Java database
- **Maven**: Build automation tool
- **Bootstrap**: CSS framework for responsive design
- **Thymeleaf**: Java template engine
- **Session**: Server-side user state management

---

## 2. Overall Description

### 2.1 Product Perspective
The Simple Blog Application is a standalone web application that operates as a self-contained system. It consists of:
- **Frontend**: HTML pages with Bootstrap styling and Thymeleaf templating
- **Backend**: Spring Boot application with REST controllers
- **Database**: H2 in-memory database for data persistence
- **Build System**: Maven for dependency management and compilation

The application runs on a single server and serves web pages to users through standard web browsers.

### 2.2 Product Functions
The system provides the following primary functions:
- **User Registration**: New users can create accounts with username and password
- **User Authentication**: Existing users can log into the system
- **Session Management**: Maintains user login state across requests
- **Blog Post Creation**: Authenticated users can write and publish new blog posts
- **Blog Post Viewing**: Users can browse all published blog posts
- **Blog Post Details**: Users can view individual blog posts in full detail
- **User Logout**: Users can securely end their session

### 2.3 User Classes and Characteristics
**Primary User Class: Blog Users**
- **Description**: Individuals who want to create and read blog content
- **Characteristics**:
  - Basic computer literacy and web browser usage
  - Interest in writing and sharing content
  - Familiarity with common web interfaces
- **Privileges**: Create, view, and manage blog posts after authentication
- **Technical Expertise**: Minimal - standard web user capabilities

---

## 3. Specific Requirements

### 3.1 Functional Requirements

#### 3.1.1 User Authentication
- **FR-1.1**: The system shall allow new users to register with a unique username and password
- **FR-1.2**: The system shall validate that usernames are unique during registration
- **FR-1.3**: The system shall authenticate users with valid username/password combinations
- **FR-1.4**: The system shall display error messages for invalid login attempts
- **FR-1.5**: The system shall maintain user sessions after successful login
- **FR-1.6**: The system shall allow users to logout and terminate their session

#### 3.1.2 Blog Post Management
- **FR-2.1**: The system shall allow authenticated users to create new blog posts
- **FR-2.2**: The system shall require a title and content for each blog post
- **FR-2.3**: The system shall automatically timestamp blog posts upon creation
- **FR-2.4**: The system shall save blog posts to the database
- **FR-2.5**: The system shall display all blog posts in reverse chronological order

#### 3.1.3 Blog Post Viewing
- **FR-3.1**: The system shall display a list of all blog posts on the home page
- **FR-3.2**: The system shall show post titles, creation dates, and content previews
- **FR-3.3**: The system shall allow users to view individual blog posts in full detail
- **FR-3.4**: The system shall provide navigation between the home page and individual posts

#### 3.1.4 Access Control
- **FR-4.1**: The system shall restrict access to blog functionality to authenticated users only
- **FR-4.2**: The system shall redirect unauthenticated users to the login page
- **FR-4.3**: The system shall display the current user's username when logged in
- **FR-4.4**: The system shall provide logout functionality on all authenticated pages

#### 3.1.5 User Interface
- **FR-5.1**: The system shall provide a responsive web interface using Bootstrap
- **FR-5.2**: The system shall display consistent navigation and styling across all pages
- **FR-5.3**: The system shall provide clear feedback for user actions (success/error messages)
- **FR-5.4**: The system shall be accessible through standard web browsers