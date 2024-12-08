# Backend_Ticketing_System

Real-Time Event Ticketing System - Spring Boot Backend
Overview
This project implements the backend of a Real-Time Event Ticketing System using Spring Boot. The backend serves as the core of the system, handling requests for ticket release, ticket purchase, system configuration, and real-time updates. It provides RESTful APIs that interact with the frontend to manage event tickets in real-time.

Features
Ticket Management: API for managing tickets, including releasing and purchasing tickets.
System Configuration: Admin API to configure system parameters such as total tickets, release rate, and maximum ticket capacity.
Real-Time Updates: Uses WebSocket or server-sent events (SSE) to provide real-time updates on ticket availability.
User Authentication: Implements security and authentication for admin and regular users.
Database Integration: Stores ticketing information and system parameters in a relational database (e.g.,SQlite).
