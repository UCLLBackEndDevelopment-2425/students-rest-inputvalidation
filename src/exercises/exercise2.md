# Exercise 2

When you want to add a course to a not existing student, the course shouldn't be added and you should get a proper error message.

- Do you do the validation in the domain, the repository or the service? Why?
- Code it!

When you use the following POST end-point http://localhost:8080/Johan with in the body of the request the following JSON
```javascript
{
    "title":"Full Stack",
    "credits":6
}
```
The result should be
- 400 Bad Request
- and the following JSON in the body of the response
```javascript
{
    "error": "Student not found!"
}
```

