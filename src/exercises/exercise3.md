# Exercise 3

When you want to add a course to an existing students, but the credits of the course is above 20 credits, the course shouldn't be added and you should get a proper error message.

- Do you do the validation in the domain, the repository or the service? Why?
- Code it!

When you use the following POST end-point http://localhost:8080/Stijn with in the body of the request the following JSON
```javascript
{
    "title":"Full Stack",
    "credits":2
}
```
The result should be
- 400 Bad Request
- and the following JSON in the body of the response
```javascript
{
    "credits": "A course must have a minimum of 3 credits"
}
```