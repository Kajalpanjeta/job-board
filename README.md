# 💼 Job Board Application

**Job Board** is a full-stack platform for posting, browsing, and applying for jobs, with geolocation-based features like finding nearby job listings. This project uses **Java Spring Boot** for the backend and will use **React** for the frontend (under development).

🚀 \[Live Demo (Coming Soon)] • 📖 Documentation • 🐛 Report Bug • 💡 Request Feature

---

## 🌟 Overview

A scalable and modular job board system enabling:

* Role-based registration (Job Seeker, Company, Admin)
* Posting and applying for jobs
* Geolocation search using PostgreSQL + PostGIS
* Future-ready frontend in React with modern UI

---

## ✨ Key Highlights

* 🌍 **Nearby Job Search** — Spatial search using PostGIS
* 🔐 **Secure Registration & Authentication** — Role-based access
* 📨 **Email Notifications** — For job applications and updates
* 📈 **Actuator Monitoring** — For production readiness
* 🧪 **REST APIs** — Well-structured and documented

---

## 🏗️ System Architecture

**Backend:** Java + Spring Boot (REST APIs)
**Frontend:** React (Planned)
**Database:** PostgreSQL + PostGIS

```
[ React Frontend (coming soon) ]
          ⬇
     REST APIs (Spring Boot)
          ⬇
 PostgreSQL + PostGIS (Spatial Data)
```

---

## 📋 Features

### 👥 User Management

* Sign up as Job Seeker or Company
* Role-based validation and entity creation

### 📝 Job Management

* Create job posts with details like title, location, salary
* Filter jobs based on title, skills, location

### 📍 Geospatial Features

* Store job coordinates using PostGIS `POINT`
* Query for nearby jobs with distance calculation

### 📧 Email Services

* Notify companies on job application
* Custom email service with Spring MailSender

### 🔍 Search and Filters

* Keyword & skill-based job filtering
* Location-based search (coming soon)

---

## 🛠 Backend Tech Stack

* Java 17
* Spring Boot 3.x
* Spring Web / MVC
* Spring Data JPA + Hibernate
* PostgreSQL + PostGIS
* Lombok
* Spring Validation
* Spring Boot Actuator
* Email Support with Spring Mail
* Swagger/OpenAPI for API Docs

---

## 🌐 Frontend (Planned)

The frontend will be developed using:

* React 18+
* TypeScript
* Tailwind CSS
* Axios (for API communication)
* React Router
* Geolocation maps integration (e.g., Mapbox/Leaflet)

Folder Structure:

```
job-board-frontend/
├── public/
├── src/
│   ├── components/
│   ├── pages/
│   ├── services/ (API calls)
│   ├── styles/
│   └── App.tsx
```

---

## ⚙️ Installation & Setup

### Prerequisites

* Java 17
* PostgreSQL with PostGIS enabled
* Maven
* (Soon) Node.js for frontend

### Steps

```bash
git clone https://github.com/your-username/job-board.git
cd job-board
```

### For Backend

```bash
cd backend
./mvnw spring-boot:run
```
## 🧪 Development Notes

### Sample API Endpoints

* `POST /api/users/register`
* `GET /api/jobs/all`
* `POST /api/applications`
* `GET /api/jobs/nearby?lat=..&lon=..&distance=..`

### Environment Variables

Create `application.properties` or use Spring Profiles:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/jobboard
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.properties.hibernate.dialect=org.hibernate.spatial.dialect.postgis.PostgisDialect
```

---

## 🤝 Contributing

We welcome contributions!

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Submit a pull request

---

## 📜 License

This project is licensed under the MIT License.

---

## 📞 Contact

* Email: [kajalpanjeta@gamil.com](mailto:kajalpanjeta@gmail.com)
* GitHub Issues: [Create an issue](https://github.com/kajalpanjeta/job-board/issues)
* Feature Requests: Use GitHub Discussions or issues

---

## 🙏 Acknowledgements

* Spring Boot for backend framework
* PostgreSQL + PostGIS for geospatial features
* Swagger for API documentation
* React (planned) for modern frontend development
