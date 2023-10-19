# Ecommerce Product Management System

![Java](https://img.shields.io/badge/Java-8%2B-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.0-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Maven](https://img.shields.io/badge/Maven-3.6.3-red)

Ecommerce Product Management System is a Java Spring Boot application designed to manage product-related operations in an e-commerce system.

## Project Details

- **Dependencies:**
  - Spring Boot Starter Web
  - Lombok
  - Validation

- **Data Flow:**
  - Products

- **Product Attributes:**
  1. productId
  2. productName
  3. productDescription
  4. productPrice
  5. productCategory
  6. productBrand

- **Controllers:**
  1. POST /products
  2. GET /product/category/{category}
  3. DELETE /product/id/{id}

- **Services:**
  1. Add products
  2. Get products by category
  3. Delete products by ID

- **Data Structure:**
  - Collections such as ArrayList to manage product data

## Project Summary

This Java Spring Boot application empowers you to manage various aspects of e-commerce products, including adding products, retrieving products by category, and deleting products by ID. The application is built on the Spring Boot framework and follows industry-standard practices.
