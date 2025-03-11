# Exercise 5

When you add twice the same course to a student, the course shouldn't be added twice and a proper error message should be given.

- Do you do the validation in the domain, the repository or the service? Why?
- Code it!

The result should be
- 400 Bad Request
- and the following JSON in the body of the response
```javascript
{
    "error": "You already follow this course"
}
```