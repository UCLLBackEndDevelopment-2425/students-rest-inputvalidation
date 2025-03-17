# Exercise 4

When you want to add a course to an existing student, but the credits of the course is more than 20 credits, the course shouldn't be added and you should get a proper error message.

- Should you code this validation in the domain, the repository or the service? Why?
- Code it!

When you use the following POST end-point http://localhost:8080/student/Stijn with in the body of the request the following JSON:

```javascript
{
    "title": "Full Stack",
    "credits": 22
}
```

The result should be:

- 400 Bad Request
- The following JSON in the body of the response:

```javascript
{
    "credits": "A course can have a maximum of 20 credits"
}
```
