# Exercise 1

In the `model` package 2 classes exist: `Student` and `Course`.

#### Exercise 1a
Add a link between these 2 classes so that a student can follow a number of courses.

#### Exercise 1b
When you use the following GET end-point http://localhost:8080/student the result should be
  - 200 OK
  - and the following JSON in the body of the response
```javascript
[
    {
        "name": "Elke",
        "courses": [
            {
                "title": "Back-End",
                "credits": 6
            }
        ]
    },
    {
        "name": "Stijn",
        "courses": []
    }
]
```
#### Exercise 1c
When you use the following POST end-point http://localhost:8080/Elke with in the body of the request the following JSON
```javascript
{
    "title":"Full Stack",
    "credits":6
}
```
The result should be
- 200 OK

When you now do again the following GET request http://localhost:8080/student the result should be
- 200 OK
- and the following JSON in the body of the response
```javascript
[
    {
        "name": "Elke",
        "courses": [
            {
                "title": "Back-End",
                "credits": 6
            },
            {
                "title": "Full Stack",
                "credits": 6
            }
        ]
    },
    {
        "name": "Stijn",
        "courses": []
    }
]
```
