# Exercise 6

When you add a course to a student and following this new course will cause the student to go over a total of 180 credits, the course shouldn't be added and a proper error message should be given.

- Do you do the validation in the domain, the repository or the service? Why?
- Code it!

The result should be
- 400 Bad Request
- and the following JSON in the body of the response
```javascript
{
    "error": "You don't have enough credits to follow this course"
}
```

