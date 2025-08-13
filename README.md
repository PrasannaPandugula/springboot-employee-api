# Jenkins Pipeline Demo – Spring Boot Employee API

This repository show cases a hands-on CI/CD pipeline implementation using Jenkins Declarative Pipeline to build and deploy a Spring Boot Java application.
Its springboot application with Rest API integration with basic endpoints , the real focus is on end-to-end automation — from pulling code from GitHub to building with Maven and running the application — simulating a real-world DevOps workflow.

---

## What You’ll Learn
- How to set up a **Jenkins Declarative Pipeline**.
- How to integrate a Spring Boot Maven project with Jenkins.
- How to build, package, and run a JAR file automatically in Jenkins.
- How to pull source code from GitHub and trigger builds.

---

## Pipeline Overview
**Flow:**
1. Jenkins pulls code from GitHub.
2. Maven builds the Spring Boot project and generates a JAR in `target/`.
3. Jenkins runs the application in the background.
4. API becomes available on the Jenkins server at port `8080`.

## API Endpoints

| Method | Endpoint      | Description             |
|--------|--------------|-------------------------|
| GET    | `/employees` | Get all employees (JSON) |