# Exercise 5

When you add the same course to the same student twice, the course shouldn't be added twice and a proper error message should be given.

- Should you code this validation in the domain, the repository or the service? Why?
- Code it!

The result should be:

- 400 Bad Request
- The following JSON in the body of the response:

```javascript
{
    "error": "You already follow this course"
}
```
