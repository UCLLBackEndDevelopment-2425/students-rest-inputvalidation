# Exercise 1

In the `model` package 2 classes exist: `Student` and `Course`.

#### Exercise 1a

Add a link between these 2 classes so that we can see the followed courses for every student. The field should be called
`courses`.

#### Exercise 1b

When you use the following GET endpoint http://localhost:8080/student the result should be:

- 200 OK
- The following JSON in the body of the response:

```javascript
[
  {
    name: 'Elke',
    courses: [
      {
        title: 'Back-End',
        credits: 6,
      },
    ],
  },
  {
    name: 'Stijn',
    courses: [],
  },
];
```

#### Exercise 1c

You should be able to add a course to a student by making a POST request as follows: POST http://localhost:8080/student/Elke with in the body of the request the following JSON:

```javascript
{
    "title": "Full Stack",
    "credits": 6
}
```

Leads to:

- Status 200 OK
- The following JSON in the body of the response
```javascript
{
    "title": "Full Stack",
    "credits": 6
}
```


When you now do the following GET request http://localhost:8080/student the result should be:

- 200 OK
- The following JSON in the body of the response:

```javascript
[
  {
    name: 'Elke',
    courses: [
      {
        title: 'Back-End',
        credits: 6,
      },
      {
        title: 'Full Stack',
        credits: 6,
      },
    ],
  },
  {
    name: 'Stijn',
    courses: [],
  },
];
```
