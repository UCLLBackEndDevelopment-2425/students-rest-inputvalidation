# Exercise 2

When you want to add a course to a non-existing student, the course shouldn't be added and you should get a proper error message.

- Should you code this validation in the domain, the repository or the service? Why?
- Code it!

When you use the following POST endpoint http://localhost:8080/student/Johan with in the body of the request the following JSON:

```javascript
{
    "title": "Full Stack",
    "credits": 6
}
```

The result should be:

- 400 Bad Request
- The following JSON in the body of the response:

```javascript
{
    "error": "Student not found!"
}
```
