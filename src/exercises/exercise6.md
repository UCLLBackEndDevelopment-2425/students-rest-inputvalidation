# Exercise 6

When you try to add a course to a student but following this new course will cause the student to go over a total of 180 credits, the course shouldn't be added and a proper error message should be given.

- Should you code this validation in the domain, the repository or the service? Why?
- Code it!

The result should be:

- 400 Bad Request
- The following JSON in the body of the response:

```javascript
{
    "error": "You don't have enough credits to follow this course"
}
```
