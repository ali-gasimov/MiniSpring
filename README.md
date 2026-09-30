# MiniSpring

A lightweight Spring-like Dependency Injection framework built from scratch with Java.

The purpose of this project is to understand how frameworks such as Spring work internally by implementing core concepts manually instead of relying on Spring itself.

## Overview

MiniSpring is a learning project that demonstrates the fundamental mechanisms behind a dependency injection container.

The project explores how Java applications can:

- Discover components
- Register beans
- Manage objects inside a container
- Use custom annotations
- Scan packages for components
- Create and manage dependencies

## Features

- Custom Dependency Injection container
- Custom component annotation
- Component scanning
- Bean registration and management
- Reflection-based object discovery
- Repository component example
- Separation of framework components and application components

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Java Reflection API
- Custom Annotations
- Dependency Injection
- Git
- GitHub

## Project Structure

```text
MiniSpring
└── src
    └── com.alim.mini_spring
        ├── BeanContainer.java
        ├── Component.java
        ├── ComponentScanner.java
        ├── Main.java
        └── UserRepository.java
