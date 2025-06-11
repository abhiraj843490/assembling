## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Configuration](#configuration)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Deployment](#deployment)
- [Logging and Monitoring](#logging-and-monitoring)


### Get All Employees
- **URL:** `http://localhost:8080/vehicle?availability=true`
- **Method:** `GET`
- **Description:** Retrieves a list of all vehicles.
- **Response:**
  ```json
  [
    {
      "id": "55f141c3-7d23-41a7-837e-ce9a3d7c41a5",
      "brandName": "CHRYSLER",
      "availability": false
    }
  ]

### Create Vehicle
- **URL:** `http://localhost:8080/vehicle`
- **Method:** `POST`
- **Description:** Create a vehicle.
- **Response:**
  ```json
  {
    "brandName": "CHRYSLER",
    "availability": false
  }
### Delete Vehicle
- **URL:** `http://localhost:8080/vehicle/e3b5ba35-e620-4a66-99d1-88179ef6f0d5`
- **Method:** `DELETE`
- **Description:** Delete a vehicle.
- **Response:** Ok
