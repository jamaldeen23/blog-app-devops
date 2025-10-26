# Simple Blog Application

A clean and intuitive blog application built with Spring Boot, Maven, HTML, Bootstrap, and CSS.

## Features

- User authentication (Login/Signup)
- View all blog posts on the home page
- Create new blog posts
- View individual blog posts
- User session management
- Responsive design with Bootstrap
- In-memory H2 database
- Clean and modern UI

## Technologies Used

- **Backend**: Spring Boot 3.2.0, Spring Data JPA
- **Frontend**: HTML5, Bootstrap 5.3.0, CSS3, Thymeleaf
- **Database**: H2 (in-memory)
- **Build Tool**: Maven

## How to Run

1. Make sure you have Java 17+ and Maven installed
2. Navigate to the project directory
3. Run the following command:
   ```
   mvn spring-boot:run
   ```
4. Open your browser and go to `http://localhost:8080`

## Project Structure

```
simple-blog-app/
├── src/main/java/com/blog/
│   ├── BlogApplication.java      # Main Spring Boot application
│   ├── BlogPost.java            # Blog post entity
│   ├── BlogPostRepository.java  # Blog post repository
│   ├── BlogController.java      # Blog web controller
│   ├── User.java                # User entity
│   ├── UserRepository.java      # User repository
│   └── AuthController.java      # Authentication controller
├── src/main/resources/
│   ├── templates/               # HTML templates
│   │   ├── index.html          # Home page
│   │   ├── new-post.html       # Create post page
│   │   ├── view-post.html      # View post page
│   │   ├── login.html          # Login page
│   │   └── signup.html         # Signup page
│   ├── static/css/
│   │   └── style.css           # Custom styles
│   └── application.properties   # App configuration
└── pom.xml                     # Maven configuration
```

## Usage

1. **Sign Up**: Create a new account at `/signup`
2. **Login**: Access the application at `/login`
3. **Home Page**: View all published blog posts
4. **Write New Post**: Click "Write New Post" to create a new blog entry
5. **View Post**: Click on any post title or "Read More" to view the full post
6. **Logout**: Click logout to end your session
7. **Database Console**: Access H2 console at `http://localhost:8080/h2-console` (optional)

Perfect for college projects - simple, clean, and fully functional!